package KiwiClub.KiwiClub.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import KiwiClub.KiwiClub.Domain.LearnedTricks;

@Service
@Scope("prototype")
public class AdminLearnedTricksService extends LearnedTricksService {
	
	public Iterable<LearnedTricks> getAllLearnedTricks() {
		return learnedTricksRepository.findAll();
	}

}
