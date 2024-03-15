package abstractDemo;

public class Main {
    public static void main(String[] args) {
      Son son = new Son(23);
      son.career();
      Daughter daughter = new Daughter(42);
      daughter.career();
        System.out.println(son.age);
        Parent.hello();
    }
}
