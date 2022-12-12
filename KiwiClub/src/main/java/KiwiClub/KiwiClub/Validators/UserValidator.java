package KiwiClub.KiwiClub.Validators;

import KiwiClub.KiwiClub.Domain.User;
import KiwiClub.KiwiClub.Service.UserService;
import KiwiClub.KiwiClub.dto.UserDto;
import br.com.fluentvalidator.AbstractValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static br.com.fluentvalidator.predicate.StringPredicate.stringEmptyOrNull;
import static java.util.function.Predicate.not;

@Component
public class UserValidator extends AbstractValidator<UserDto> {

    @Autowired
    private UserService userService;
    @Override
    public void rules() {



    }

}
