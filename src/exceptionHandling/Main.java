package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

       try{
//         divide(a,b);
           String name = "Aravind";
           if(name.equals("Aravind")){
               throw new Myexception("Name is Aravind");
           }
       }catch(Myexception e){
           System.out.println(e.getMessage());

       }
       catch(ArithmeticException e){
            System.out.println(e.getMessage());

        }catch(Exception e){
           System.out.println("normal exception");}
       finally {
           System.out.println("This will always run ");
       }

    }

    public static int divide(int a, int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Please do not divide like this.");
        }
        return a/b;
    }
}
