package si.um.feri.osebe.vao;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Oseba {

    public Oseba() {
    }

    public Oseba(String ime, String priimek) {
        this.ime = ime;
        this.priimek = priimek;
    }

    private String ime;

    private String priimek;

    @Id
    @GeneratedValue
    private int id;

}
