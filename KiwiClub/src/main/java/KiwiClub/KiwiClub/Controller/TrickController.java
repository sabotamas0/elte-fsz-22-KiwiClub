package KiwiClub.KiwiClub.Controller;
import java.util.List;

import KiwiClub.KiwiClub.Domain.Trick;
import KiwiClub.KiwiClub.Service.TrickService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrickController {

    /*
    @Autowired
    private TrickService trickService;

    @RequestMapping(value = "/tricks/getAllTricks", method = RequestMethod.GET)
    public List<Trick> getAllTricks() {
        return trickService.getAllTricks();
    }
    @RequestMapping(value = "/tricks/{name}", method = RequestMethod.GET)
    public Trick getTrick(@PathVariable String name) {
        return trickService.getTrickByName(name);
    }
    @RequestMapping(value = "/tricks", method =RequestMethod.POST)
    public void addTrick(@RequestBody Trick trick) {
        trickService.addTrick(trick);
    }

     */
}
