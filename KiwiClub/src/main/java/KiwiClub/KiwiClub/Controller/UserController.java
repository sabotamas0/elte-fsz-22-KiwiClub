package KiwiClub.KiwiClub.Controller;

import KiwiClub.KiwiClub.Domain.Trick;
import KiwiClub.KiwiClub.Domain.User;
import KiwiClub.KiwiClub.Repository.CredentialsRepository;
import KiwiClub.KiwiClub.Service.TrickService;
import KiwiClub.KiwiClub.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void registerUser(@RequestBody User user) {
        int asd=0;
        user.setUserAdmin(false);
        userService.addUser(user);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void loginUser(@RequestBody User user) {
        int asd=0;
        user.setUserAdmin(false);
        userService.addUser(user);
    }
}
