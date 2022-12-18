package KiwiClub.KiwiClub.Controller;
import KiwiClub.KiwiClub.Domain.*;
import KiwiClub.KiwiClub.QueryResult.JoinedLecture;
import KiwiClub.KiwiClub.Service.*;
import KiwiClub.KiwiClub.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Controller
public class KiwiController {

    @Autowired
    private UserService userService;
    @Autowired
    private KiwiService kiwiService;
    @Autowired
    private TrickService trickService;
    @Autowired
    private FoodService foodService;
    @Autowired
    private DrinkService drinkService;
    @Autowired
    private LectureProgressService lectureProgressService;
    @PostMapping ("indexKiwi")
    public String Index(@Valid @ModelAttribute("user") UserLoginDto user, BindingResult result,Model model){

        //user validacio
        User existingUser = userService.findUserByEmail(user.getEmail());

        if(existingUser == null) {
            result.rejectValue("email", null,
                    "There is no user with this email!");

        }

        if(existingUser!=null && !user.getPassWord().equals(existingUser.getPassword())){
            result.rejectValue("passWord", null,
                    "Wrong password!");
        }

        if(result.hasErrors()){
            model.addAttribute("user", user);
            return "login";
        }

        Kiwi userKiwi=kiwiService.findByUserId(existingUser.getUserId());


        if(userKiwi==null) {
            KiwiDto kiwi = new KiwiDto();

            model.addAttribute("optionsNem", Sex.Sexes());
            model.addAttribute("optionsFaj", KiwiSpecies.Species());
            kiwi.setUserId(existingUser.getUserId());
            model.addAttribute("kiwi", kiwi);

            return "create";
            //ezután átirányitani formban egy save metodusra ahol elmentjük, átalakitjuk meg ilyenek(átalakitás az a service feladata lesz)
        }
        else {
            //TODO
            model.addAttribute("userKiwi", userKiwi);
            model.addAttribute("userName",user.getEmail());
            return "redirect:/sKiwi/" + existingUser.getUserId();
        }
    }
    @PostMapping ("/create/save")
    public String SaveKiwi(@Valid @ModelAttribute("kiwi") KiwiDto kiwi, BindingResult result, Model model){

        if(result.hasErrors()){
            model.addAttribute("kiwi", kiwi);
            model.addAttribute("optionsNem", Sex.Sexes());
            model.addAttribute("optionsFaj", KiwiSpecies.Species());
            return "/create";
        }
        kiwiService.saveKiwi(kiwi);
        model.addAttribute("userKiwi", kiwi);
        model.addAttribute("userName","kiwi.getEmail()");
        return "redirect:/sKiwi/" + kiwi.getUserId();
    }
    @PostMapping ("/toDrink")
    public String ItatKiwi(DrinkDto toDrink,BindingResult result, Model model){

        Drink d = drinkService.getDrinkByName(toDrink.getDrinkName());
        Optional<Kiwi> userKiwiOptional=kiwiService.findById(toDrink.getKiwiId());
        if(userKiwiOptional.isPresent())
        {
            Float thirst = userKiwiOptional.get().getThirst();
            thirst+=d.getCapacity();
            userKiwiOptional.get().setThirst(Math.min(3.0f,thirst));
            kiwiService.updateKiwi(userKiwiOptional.get());
            return "redirect:/sKiwi/" + userKiwiOptional.get().getUserId();
        }
        return "index";
    }
    @PostMapping ("/toEat")
    public String EtetKiwi(FoodDto toEat,BindingResult result, Model model){

        Food f = foodService.getFoodByName(toEat.getFoodName());
        Optional<Kiwi> userKiwiOptional=kiwiService.findById(toEat.getKiwiId());
        if(userKiwiOptional.isPresent())
        {
            Float weight = userKiwiOptional.get().getWeight();
            weight+=f.getNutrition();
            userKiwiOptional.get().setWeight(Math.min(30000.0f,weight));
            userKiwiOptional.get().setLastFeedDay(Date.from(Instant.now()));
            kiwiService.updateKiwi(userKiwiOptional.get());
            return "redirect:/sKiwi/" + userKiwiOptional.get().getUserId();
        }
        return "index";
    }
    @PostMapping ("/toTeach")
    public String TanitKiwi(LearnDto toLearn,BindingResult result, Model model){
        LectureProgress prog=lectureProgressService.getLectureProgressByLectureProgressId(toLearn.getLectureProgressId());
        Optional<Kiwi> userKiwiOptional=kiwiService.findById(toLearn.getKiwiId());
        if(userKiwiOptional.isPresent()) {
            if(prog.getStartDate()==null) {
                prog.setStartDate(Date.from(Instant.now()));
                lectureProgressService.addLectureProgress(prog);
            }
            return "redirect:/sKiwi/" + userKiwiOptional.get().getUserId();
        }
        return "index";
    }



    @PostMapping ("/fillLectures")
    public String KitoltLectures(@RequestBody LearnDto toLearn,BindingResult result, Model model) {
        updateProgress();
        List<JoinedLecture> joinedLectures = kiwiService.getJoinedLectures(toLearn.getTrickId(),toLearn.getKiwiId());
        Optional<Kiwi> userKiwiOptional=kiwiService.findById(toLearn.getKiwiId());
        model.addAttribute("lectures",joinedLectures);

        return "lectureList";
    }
    @GetMapping ("/sKiwi/{userId}")
    public String SeeKiwi(@PathVariable("userId") Long userId, Model model)
    {
        Kiwi userKiwi=kiwiService.findByUserId(userId);

        DrinkDto drinkDto= new DrinkDto();
        FoodDto foodDto= new FoodDto();

        // az átirányitáshoz
        model.addAttribute("userId",userId);

        model.addAttribute("userKiwi", userKiwi);
        model.addAttribute("tricks", trickService.getAllTricks());

        model.addAttribute("food",foodDto);
        model.addAttribute("drink",drinkDto);

        model.addAttribute("foods",foodService.getAllFoods());
        model.addAttribute("drinks",drinkService.getAllDrinks());

        model.addAttribute("hunger",userKiwi.getWeight()/30000f*100f);
        model.addAttribute("thirst",userKiwi.getThirst()/3.0f*100f);


        //List<JoinedLecture> lectures = kiwiService.getJoinedLectures(userKiwi.kiwiId, );
        Date lastfeed = userKiwi.getLastFeedDay();
        Date lastPenaltyDay = userKiwi.getLastPenaltyDay();
        Date now = Date.from(Instant.now());
        long ellapsed = now.getTime() - lastfeed.getTime() ;
        long ellapsedPenalty = now.getTime() - lastPenaltyDay.getTime() ;
        //ez a logika
        int happiness = 0;

        if (ellapsed > 86400000 * 5) {
            //itt megdöglik
            happiness = 0;
        } else if (ellapsed > 86400000) {
            //itt rossz kedv
            happiness = 10;
        } else if (ellapsed > 86400000 / 3) {
            //itt közepes kedv
            happiness = 60;
        } else if (ellapsed > 86400000 / 4)//60000 demora
        {
            if(ellapsedPenalty > 86400000) {//ha demóra kell át lehet irni 1 percre (60000 ms)
                //itt közepes kedv
                happiness = 100;
                userKiwi.setWeight(Math.max(0, userKiwi.getWeight() - 20000f));
                userKiwi.setThirst(Math.max(0, userKiwi.getThirst() - 2.0f));
                userKiwi.setLastPenaltyDay(now);
                kiwiService.updateKiwi(userKiwi);
            }
            happiness=0;

        } else {
            //jó kedv
            happiness = 100;
        }


        Float wHapp=userKiwi.getWeight()/30000f*100f/3.f;
        Float tHapp= userKiwi.getThirst()/3.0f*100f/3.f;
        Float defHapp = Math.min(wHapp,Math.min(tHapp,(float)happiness/3f));
        happiness=Math.round(defHapp+wHapp+tHapp);
        model.addAttribute("happiness", happiness);
        return "seeKiwi";
    }
    private void updateProgress()
    {
        List<LectureProgress> progresses = lectureProgressService.getAllLectureProgresses();

        Date now = Date.from(Instant.now());
        for(LectureProgress currProg : progresses) {
            if(currProg.getStartDate()!=null && !currProg.isLearned())
            {
                long ellapsed = now.getTime() - currProg.getStartDate().getTime();
                int numberofdaystolearn = currProg.getHowManyDaysToLearn();
                Float numb = ellapsed / 86400000f * (float) numberofdaystolearn;
                if (numb >= 1.0) {
                    currProg.setLearned(true);
                    currProg.setProgress(100);
                }
                else {
                    currProg.setProgress((int) (numb * 100));
                }
                lectureProgressService.updateLectureProgress(currProg);
            }
        }
    }
}

