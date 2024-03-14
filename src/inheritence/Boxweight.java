package inheritence;

public class Boxweight extends Box {
     double weight;
    Boxweight(){
        this.weight = -1;
    }

    public Boxweight(double l, double h, double w, double weight) {
        super(l, h, w);//this super keyword is used to intialize values used in parent class and it call the parent constructor.
        this.weight = weight;
    }
    Boxweight(Boxweight other){
        super(other);
        this.weight = other.weight;
    }
    Boxweight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}
