package KiwiClub.KiwiClub.Controller;

import KiwiClub.KiwiClub.Domain.User;
import KiwiClub.KiwiClub.Service.UserService;
import KiwiClub.KiwiClub.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import javax.validation.*;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home(){
        return "index";
    }
    @GetMapping("/login")
    public String login(){
        //TODO
        return "login";
    }
    @GetMapping("/login/{username}")
    public String red(@PathVariable(value="username") String id,
                      String username){

        //TODO: validalni a usert

        //return "redirect:/createKiwi/create?param=" + username;
        return "redirect:/createKiwi/"+ username;
    }
    @GetMapping("/register")
    public String showRegistrationForm(Model model){
        UserDto user = new UserDto();
        model.addAttribute("user", user);
        return "register";
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

}
