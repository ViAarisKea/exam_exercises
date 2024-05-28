public class Bil {

    private Trailer trailer;
    private float vægt;

    public Bil(float vægt){
        this.vægt = vægt;
    }

    public void setTrailer(Trailer trailer){
        if((trailer.getVægt() + vægt) < 3500){
            this.trailer = trailer;
        }
    }

    public float totalVægten(){
        if(trailer!=null) return vægt + trailer.getVægt();
        else return vægt;
    }

}
