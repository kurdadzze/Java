import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int a;
        int b;

        System.out.println("Enter a value");
        a = myObj.nextInt();
        System.out.println("Enter b value");
        b = myObj.nextInt();

        RandomNums randomNums = new RandomNums(a,b);
        int arr[] = randomNums.random40Numbers();
        int arr1[] = randomNums.sumOddAndEven(arr);
        System.out.println(Arrays.toString(arr));
        randomNums.oddAndEven(arr);
        randomNums.printSums(arr1);
        System.out.println(Arrays.toString(randomNums.random5Numbers(arr1)));
    }
}
