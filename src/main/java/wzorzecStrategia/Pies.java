package wzorzecStrategia;

import java.math.BigDecimal;

public class Pies {
    private Szczekanie szczekanie;
    private Spanie spanie;
    private Ruszanie ruszanie;

    public Pies(Szczekanie szczekanie, Spanie spanie, Ruszanie ruszanie) {
        this.szczekanie = szczekanie;
        this.spanie = spanie;
        this.ruszanie = ruszanie;
    }



    public void szczekaj() {
    szczekanie.sczekaj();
    }

    public void spij() {
    spanie.spij();
    }

    public void ruszajSie() {
    ruszanie.ruszajSie();
    }
}

