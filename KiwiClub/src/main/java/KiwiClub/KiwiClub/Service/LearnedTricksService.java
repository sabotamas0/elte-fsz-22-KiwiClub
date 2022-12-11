package KiwiClub.KiwiClub.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import KiwiClub.KiwiClub.Domain.LearnedTricks;
import KiwiClub.KiwiClub.Repository.LearnedTricksRepository;

@Service
@Scope("prototype")
public class LearnedTricksService {
	
	@Autowired
	LearnedTricksRepository learnedTricksRepository;
	
	public LearnedTricks getLearnedTricksByKiwiId(UUID id) {
		LearnedTricks learnedTricks = learnedTricksRepository.findById(id).get();
		return learnedTricks;
	}

}
