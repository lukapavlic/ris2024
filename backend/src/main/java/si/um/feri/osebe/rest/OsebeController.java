package si.um.feri.osebe.rest;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import si.um.feri.osebe.dao.OsebaRepository;
import si.um.feri.osebe.vao.Oseba;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@CrossOrigin
@RestController
public class OsebeController {

    Logger logger = Logger.getLogger(OsebeController.class.getName());

    @GetMapping("/info")
    public String info(){
        return "Hello World!";
    }

    @GetMapping("/osebe")
    public Iterable<Oseba> getAllOseba(){
        logger.info("Getting all Oseba data");
        return repository.findAll();
    }

    @GetMapping("/osebe/{id}")
    public Optional<Oseba> getOsebaById(@PathParam("id") int id){
        logger.info("Get Oseba by id: " + id);
        return repository.findById(id);
    }

    @Autowired
    OsebaRepository repository;

    @PostMapping("/osebe")
    public void postOseba(Oseba oseba){
        logger.info("Post Oseba with id: " + oseba.getId());
        repository.save(oseba);
    }



}
