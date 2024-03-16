package ObjectCloning;

public class Department {
    int deptid;
    String Name;

    public Department(int deptid, String name) {
        this.deptid = deptid;
        Name = name;
    }
    void display(){
        System.out.println(deptid);
        System.out.println(Name);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
