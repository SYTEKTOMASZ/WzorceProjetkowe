package wzorzecDekorator;

public class Cukier extends SkladnikDekorator {

    private Napoj napoj;
    public Cukier(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public String getOpis(){
        return napoj.getOpis()+", Cukier";
    }


    @Override
    public float getKoszt(){
        return napoj.getKoszt()+0.50f;
    }
}
