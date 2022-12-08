package KiwiClub.KiwiClub.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import KiwiClub.KiwiClub.Domain.Player;

@Service
@Scope("prototype")
public class AdminService extends PlayerService {
	
	public void modifyPlayer(Player p) {
		Player player = playerRepository.findById(p.getUserId()).get();
		player=p;
		playerRepository.save(player);
	}
	
	public void deletePlayer(Player p) {
		Player player = playerRepository.findById(p.getUserId()).get();
		playerRepository.delete(player);
	}
	
	public void addPlayer(Player p) {
		p=playerRepository.save(p);
	}
	
}
