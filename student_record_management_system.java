import java.util.*;
class std{
    int reg_num;
    String name;
    String dep;
    int marks;
    std(int reg_num,String name,String dep,int marks){
        this.reg_num=reg_num;
        this.name=name;
        this.dep=dep;
        this.marks=marks;
    }

}
public class student_record_management_system{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("CHOICE ");
        System.out.println("Enter 1 to add a student");
        System.out.println("Enter 2 to display all students");
        System.out.println("Enter 3 to search a student with regnum");
        System.out.println("Enter 4 to update student marks");
        System.out.println("Enter 5 to remove a student record");
        System.out.println("6.EXIT");
        System.out.println("enter your choice : ");
        int ch;
        ch=sc.nextInt();
        if(ch==1){

        }
        else if(ch==2){

        }
        else if(ch==3){

        }
        else if(ch==4){

        }
        else if(ch==5){

        }
        else if(ch==6){
            break;
        }
        else{
            System.out.println("INVALID INPUT");
        }
    }
}
    

    