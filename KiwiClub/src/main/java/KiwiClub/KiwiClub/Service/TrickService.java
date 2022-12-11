package KiwiClub.KiwiClub.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import KiwiClub.KiwiClub.Domain.Trick;
import KiwiClub.KiwiClub.Repository.TrickRepository;

@Service
@Scope("prototype")
public class TrickService {
	
	@Autowired
	TrickRepository trickRepository;
	
	public Trick getTrickByName(String name) {
		Trick trick = trickRepository.getTrickByName(name);
		return trick;
	}
	
	public Iterable<Trick> getAllTricks() {
		return trickRepository.findAll();
	}

}
