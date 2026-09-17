import java.util.Scanner;
class Box{
    double width;
    double height;
    double depth;
    
    double volume(){
        return width*height*depth;
    }
    void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the width : ");
        width=sc.nextDouble();
        System.out.print("Enter the height : ");
        height=sc.nextDouble();
        System.out.print("Enter the depth : ");
        depth=sc.nextDouble();
    }
}

public class method{
    public static void main(String[] args) {
        Box mybox1=new Box();
        Box mybox2=new Box();
        double vol;
        mybox1.input();
        mybox2.input();
        vol=mybox1.volume();
        System.out.println("Volume of box 1 is "+vol);

        vol=mybox2.volume();
        System.out.println("Volume of box 2 is "+vol);
    }
}