package KiwiClub.KiwiClub.Service;

import KiwiClub.KiwiClub.Domain.Trick;
import KiwiClub.KiwiClub.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.Vector;

@Service
public class TrickServiceImplementation implements TrickService{

    @Autowired
    private TrickRepository trickRepository;

    @Override
    public void deleteTrickById(Long trickId) {
        trickRepository.deleteById(trickId);
    }

    @Override
    public Trick addTrick(Trick trick) {
        return trickRepository.save(trick);
    }

    @Override
    public Trick getTrickByName(String name) {
        return trickRepository.getTrickByName(name);
    }

    @Override
    public List<Trick> getAllTricks() {
        List<Trick> tricks = new ArrayList<>();
        tricks.addAll(trickRepository.findAll());
        return tricks;
    }
}
