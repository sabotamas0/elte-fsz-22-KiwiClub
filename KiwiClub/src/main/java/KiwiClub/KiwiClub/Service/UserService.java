package KiwiClub.KiwiClub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import KiwiClub.KiwiClub.Domain.User;
import KiwiClub.KiwiClub.Repository.CredentialsRepository;

@Service
@Scope("prototype")
public class UserService {
	
	@Autowired
	private CredentialsRepository credentialsRepository;
	
	public void register(User user) {
		user=credentialsRepository.save(user);
	}

}
