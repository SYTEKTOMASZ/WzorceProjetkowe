package wzorzecDekorator;


public class Mleko extends Napoj {

    private Napoj napoj;

    public Mleko(Napoj napoj){
        this.napoj = napoj;
    }
    @Override
    public float getKoszt() {
        return napoj.getKoszt()+1.22f;
    }
    @Override
    public String getOpis(){
        return napoj.getOpis() + ", Mleko";
    }
}
