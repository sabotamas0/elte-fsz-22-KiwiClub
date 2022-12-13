package KiwiClub.KiwiClub.Controller;
import KiwiClub.KiwiClub.Domain.Kiwi;
import KiwiClub.KiwiClub.Domain.User;
import KiwiClub.KiwiClub.Service.KiwiService;
import KiwiClub.KiwiClub.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class KiwiController {

    @Autowired
    private UserService userService;
    @Autowired
    private KiwiService kiwiService;
    @GetMapping("/createKiwi/{username}")
    public String Index(@PathVariable(value="username") String name,
                                       Model model){
        //UserDto user = new UserDto();
        //model.addAttribute("kiwi", user);

        User loginedUser=userService.findUserByEmail(name);

        Kiwi userKiwi=kiwiService.findByUserId(loginedUser.getUserId());

        if(userKiwi==null) {
            return "create";
        }
        else {
            model.addAttribute("userKiwi", userKiwi);
            return "seeKiwi";
        }

        //model.addAttribute("username", id);

    }
    @GetMapping("/seeKiwi/{kname}/{sex}/{species}")
    public String showKiwiCreationForm(@PathVariable String kname,@PathVariable String sex,@PathVariable String species,Model model){
        //UserDto user = new UserDto();
        model.addAttribute("kname",kname);
        model.addAttribute("sex",sex);
        model.addAttribute("species",species);
        return "seeKiwi";
    }
    /*
    @Autowired
    private UserService userService;


    @GetMapping("/createKiwi")
    public String showKiwiCreationForm(Model model){
        UserDto user = new UserDto();
        model.addAttribute("kiwi", user);
        return "createKiwi";
    }
    @PostMapping("/register/save")
    public String registration(@Valid @ModelAttribute("user") UserDto userDto,
                               BindingResult result,
                               Model model){

        User existingUser = userService.findUserByEmail(userDto.getEmail());

        if(existingUser != null && existingUser.getEmail() != null && !existingUser.getEmail().isEmpty()){
            result.rejectValue("email", null,
                    "There is already an account registered with the same email");
        }

        if(result.hasErrors()){
            model.addAttribute("user", userDto);
            return "/register";
        }

        userService.saveUser(userDto);
        return "redirect:/register?success";
    }


*/
}

