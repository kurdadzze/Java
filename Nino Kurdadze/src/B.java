import java.util.Scanner;

public class B extends A {
    private int y;

    public  void assignValues(){
        Scanner myScn = new Scanner(System.in);
        int y;

        System.out.println("Enter y value");
        y = myScn.nextInt();

        this.y = y;
    }

    public int sumOfXY(){
        int y = this.y;
        int x = super.x;

        return x + y;
    }
}
