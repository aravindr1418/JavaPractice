package ObjectCloning;

public class Student implements Cloneable{
    int id;
    String name;
    Department dept;

    public Student(int id, String name, Department dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;

    }
    void display (){
        System.out.println(id);
        System.out.println(name);
        dept.display();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       Student S = (Student) super.clone();
       S.dept =(Department) S.dept.clone();
       return S;
    }
}
