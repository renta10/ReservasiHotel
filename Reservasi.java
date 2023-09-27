import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservasi {
    private List<Kamar> kamar;
    private LocalDate cekIn;
    private LocalDate cekOut;

    public Reservasi(){

    }

    public Reservasi( List<Kamar> kamar, LocalDate cekIn, LocalDate cekOut) {
        this.kamar = kamar;
        this.cekIn = cekIn;
        this.cekOut = cekOut;
    }

    public List<Kamar> getKamar() {
        return kamar;
    }

    public void setKamar(List<Kamar> kamar) {
        this.kamar = kamar;
    }

    public LocalDate getCekIn() {
        return cekIn;
    }

    public void setCekIn(LocalDate cekIn) {
        this.cekIn = cekIn;
    }

    public LocalDate getCekOut() {
        return cekOut;
    }

    public void setCekOut(LocalDate cekOut) {
        this.cekOut = cekOut;
    }

    public void listKamar(){
        kamar = new ArrayList<>();

    }
}
