package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.Trick;
import KiwiClub.KiwiClub.Domain.User;
import KiwiClub.KiwiClub.Repository.CredentialsRepository;
import KiwiClub.KiwiClub.Repository.TrickRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private CredentialsRepository credentialsRepository;

    @Override
    public User addUser(User user) {
        return credentialsRepository.save(user);
    }
}
