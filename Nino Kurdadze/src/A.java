import java.util.Scanner;

public class A {
    public int x;

    public  A(){
        System.out.println("Hello");
    }

    public  void assignValues(){
        Scanner myScn = new Scanner(System.in);
        int x;

        System.out.println("Enter x value");
        x = myScn.nextInt();

        this.x = x;
    }

    public  void printXPlusTwelve(){
        System.out.println(x + 12);
    }

    public  void oddOrEven(){
        if ( x % 2 == 0 )
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }


}
