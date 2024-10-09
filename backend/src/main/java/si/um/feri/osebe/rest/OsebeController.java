package si.um.feri.osebe.rest;

import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import si.um.feri.osebe.vao.Oseba;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@RestController
public class OsebeController {

    Logger logger = Logger.getLogger(OsebeController.class.getName());

    @GetMapping("/info")
    public String info(){
        return "Hello World!";
    }

    @GetMapping("/osebe")
    public List<Oseba> getAllOseba(){
        List<Oseba> allOsebas = new ArrayList<>();
        allOsebas.add(new Oseba("Peter","Klepec"));
        allOsebas.add(new Oseba("Martin","Krpan"));
        allOsebas.add(new Oseba("Mojca","Pokrajculja"));
        return allOsebas;
    }

    @GetMapping("/osebe/{id}")
    public Oseba getOsebaById(@PathParam("id") int id){
        logger.info("Get Oseba by id: " + id);
        Oseba ret=new Oseba("Peter","Klepec");
        ret.setId(id);
        return ret;
    }


}
