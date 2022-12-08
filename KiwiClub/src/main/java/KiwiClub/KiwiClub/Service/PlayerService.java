package KiwiClub.KiwiClub.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import KiwiClub.KiwiClub.Domain.Player;
import KiwiClub.KiwiClub.Repository.PlayerRepository;

@Service
@Scope("prototype")
public class PlayerService {

	@Autowired
	protected PlayerRepository playerRepository;
	
	public Player getPlayerByName(String name) {
		Player player = playerRepository.getPlayerByName(name);
		return player;
	}
	
	public Player getPlayerByEmail(String email) {
		Player player = playerRepository.getPlayerByEmail(email);
		return player;
	}
	
	public Player getPlayerByUUID(UUID id) {
		Player player = playerRepository.findById(id).get();
		return player;
	}
	
}
