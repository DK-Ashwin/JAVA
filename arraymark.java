import java.util.ArrayList;
public class arraymark{
        public static void main(String[] args) {
            ArrayList<Integer> marks =new ArrayList<>();
            marks.add(85);
            marks.add(90);
            marks.add(99);

            for(int mark:marks){
                System.out.println(mark);
            }
        }
}