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

    public void setSzczekanie(Szczekanie szczekanie) {
        this.szczekanie = szczekanie;
    }

    public void setSpanie(Spanie spanie) {
        this.spanie = spanie;
    }

    public void setRuszanie(Ruszanie ruszanie) {
        this.ruszanie = ruszanie;
    }
}

