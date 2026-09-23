import java.util.ArrayList;
class Student{
    int roll;
    String name;
    double mark;
    Student(int roll,String name,double mark){
        this.roll=roll;
        this.name=name;
        this.mark=mark;
    }
    void display(){
        System.out.println("ROLL : "+roll);
        System.out.println("NAME : "+name);
        System.out.println("MARK : "+mark);
        System.out.println("---------------------");
    }
}
public class arraylist_add{
    public static void main(String[]args){
        ArrayList<Student> students=new ArrayList<>();
        students.add(new Student(1,"ashwin",85.0));
        students.add(new Student(2,"joel",75.0));
        students.add(new Student(3,"arjun",80.0));
        students.add(new Student(4,"vaishnav",90.0));

        for(Student s:students){
            s.display();
        }
    }
}