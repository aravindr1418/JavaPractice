package singleton;
//singleton class is a class which creates a single object.
public class Singleton {
private Singleton(){

    }
private static Singleton instance;
public static Singleton getInstance(){
    //check whether the object is created or not
    if (instance == null){
        instance = new Singleton();
    }
    return instance;
}
}
