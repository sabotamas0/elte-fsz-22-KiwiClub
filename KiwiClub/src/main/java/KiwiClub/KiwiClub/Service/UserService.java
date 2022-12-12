package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.Trick;
import KiwiClub.KiwiClub.Domain.User;
import KiwiClub.KiwiClub.dto.UserDto;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);
}
