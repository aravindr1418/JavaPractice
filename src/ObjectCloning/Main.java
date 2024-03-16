package ObjectCloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department(1,"CSE");
        Student student1 =  new Student(1,"Aravind",department);
        Student student2 = (Student) student1.clone();

        department.Name ="EEE";
        student1.display();
        student2.display(); 
    }
}
