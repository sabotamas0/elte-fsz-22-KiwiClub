package KiwiClub.KiwiClub.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import KiwiClub.KiwiClub.Domain.Trick;

@Service
@Scope("prototype")
public class AdminTrickService extends TrickService {
	
	public void deleteTrick(Trick trick) {
		trickRepository.delete(trick);
	}
	
	public void addTrick(Trick trick) {
		trick=trickRepository.save(trick);
	}
	
	public void modifyTrick(Trick t) {
		Trick trick = trickRepository.findById(t.getTrickId()).get();
		trick=t;
		trickRepository.save(trick);
	}

}
