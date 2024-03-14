package inheritence;

public class BoxPrice extends Boxweight {
    double cost;
    BoxPrice(){
        this.cost = -1;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double l , double h , double w , double weight, double cost) {
        super(l,w,h,weight);
        this.cost = cost;
    }
    BoxPrice(double side, double weight,double cost){
        super(side,weight);
        this.cost = cost;
    }
}
