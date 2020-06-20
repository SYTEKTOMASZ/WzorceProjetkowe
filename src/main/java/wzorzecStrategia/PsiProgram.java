package wzorzecStrategia;

public class PsiProgram {
    public static void main (String[] args){
        Pies pies   = new Pies(new SzczekanieHauHau(), new SpanieJakZwierz(), new Bieganie());
        Pies piesZabawka = new Pies(new NieSzczekam(), new NIeSpie(), new RuszanieGlowa());
        pies.ruszajSie();
        pies.spij();
        pies.szczekaj();
        piesZabawka.ruszajSie();
        piesZabawka.spij();
        piesZabawka.szczekaj();



    }
}
