package si.um.feri.osebe.vao;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Oseba {

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
