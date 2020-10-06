import java.util.Scanner;

public class C {
    private int a;
    private int b;
    private int c;

    public  void assignValues(){
        Scanner myObj = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("Enter a value");
        a = myObj.nextInt();
        System.out.println("Enter b value");
        b = myObj.nextInt();
        System.out.println("Enter c value");
        c = myObj.nextInt();

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int lastDigit()
    {
        return (a % 10);
    }

    public int firstDigit()
    {
        while (b >= 10)
            b /= 10;

        return b;
    }

    public int sumDigits(){
        int sum = 0;
        while (c > 0) {
            sum = sum + c % 10;
            c = c / 10;
        }

        return sum;
    }

    public int printMultiplied(){
        int parametri1 = lastDigit();
        int parametri2 = firstDigit();
        int namravli = parametri1 * parametri2;

        System.out.println(namravli);
        return  namravli;
    }

    public void printSum(){
        int parametri1 = firstDigit();
        int parametri2 =printMultiplied();
        int sum = parametri1 + parametri2;

        System.out.println(sum);
    }
}
