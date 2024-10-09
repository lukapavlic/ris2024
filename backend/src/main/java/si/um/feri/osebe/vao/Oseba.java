package si.um.feri.osebe.vao;

import lombok.Data;

@Data
public class Oseba {

    public Oseba(String ime, String priimek) {
        this.ime = ime;
        this.priimek = priimek;
    }

    private String ime;

    private String priimek;

    private int id;

}
