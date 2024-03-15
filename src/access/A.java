package access;

public class A {
   //if we put private for int num it can only accessible within the class. But it can be used via get and set method.
  protected int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
