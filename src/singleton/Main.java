package singleton;

public class Main {
    public static void main(String[] args) {
     Singleton obj1 = Singleton.getInstance();
     Singleton obj2 = Singleton.getInstance();
     Singleton obj3 = Singleton.getInstance();

     //All three variables are pointing to just one object
    }
}
