package abstractDemo;

public class Daughter extends Parent{
    Daughter(int age){
       super(age);;
    }
    @Override
    void career() {
        System.out.println("I am going to be a coder");
    }

    @Override
    void partner() {
        System.out.println("My partner name is super man");
    }
}
