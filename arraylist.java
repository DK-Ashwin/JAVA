import java.util.ArrayList;
public  class arraylist{
        public static void main(String[] args){
            ArrayList<String> students=new ArrayList<>();
            students.add("ashwin");
            students.add("joel");
            System.out.println("ArrayList :"+students);
            
        
        System.out.println("first Student"+students.get(0));
        students.remove("ashwin");
        System.out.println("updated list :"+students);
        System.out.println("Number of students: "+students.size());
        }
}