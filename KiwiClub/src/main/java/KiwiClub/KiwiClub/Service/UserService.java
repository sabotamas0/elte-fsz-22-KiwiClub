package KiwiClub.KiwiClub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import KiwiClub.KiwiClub.Domain.Player;
import KiwiClub.KiwiClub.Repository.PlayerRepository;

@Service
@Scope("prototype")
public class UserService {
	
	@Autowired
	protected PlayerRepository playerRepository;
	
	public void login(Player player) {
		player=playerRepository.save(player);
	}
	
	public void register(Player player) {
		
	}

}
