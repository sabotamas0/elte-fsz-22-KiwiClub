package KiwiClub.KiwiClub.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import KiwiClub.KiwiClub.Domain.Kiwi;
import KiwiClub.KiwiClub.Repository.KiwiRepository;

@Service
@Scope("prototype")
public class KiwiService {

	@Autowired
	KiwiRepository kiwiRepository;
	
	public Kiwi findKiwiByUserId(UUID id) {
		Kiwi kiwi = kiwiRepository.getKiwiByPlayerId(id);
		return kiwi;
	}
	
}
