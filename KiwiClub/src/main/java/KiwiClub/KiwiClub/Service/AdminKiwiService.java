package KiwiClub.KiwiClub.Service;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import KiwiClub.KiwiClub.Domain.Kiwi;
import KiwiClub.KiwiClub.Domain.Player;

@Service
@Scope("prototype")
public class AdminKiwiService extends KiwiService {
	
	public Iterable<Kiwi> getAllKiwis() {
		return kiwiRepository.findAll();
	}
	
	public void modifyKiwiByUserId(Kiwi k) {
		Kiwi kiwi = kiwiRepository.getKiwiByPlayerId(k.getPlayerId());
		kiwi=k;
		kiwiRepository.save(kiwi);
	}

}
