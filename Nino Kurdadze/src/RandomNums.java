import java.util.Random;

public class RandomNums {
    private int a;
    private int b;

    public RandomNums(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int[] random40Numbers(){
        int max;
        int min;

        if(a > b){
            max = a;
            min = b;
        }
        else{
            max = b;
            min = a;
        }

        Random rand = new Random();
        int array[] = new int[40];

        int i = 0;
        while(i<40){
            array[i] = rand.nextInt((max - min) + 1) + min;
            i++;
        }

        return array;
    }

    public int[] random5Numbers(int arr[]){
        int max;
        int min;
        int x = arr[0];
        int y = arr[1];

        if(x > y){
            max = x;
            min = y;
        }
        else{
            max = y;
            min = x;
        }

        Random rand = new Random();
        int array[] = new int[5];

        int i = 0;
        while(i<5){
            array[i] = rand.nextInt((max - min) + 1) + min;
            i++;
        }

        return array;
    }

    public void oddAndEven(int array[]){
        int ctr_even = 0, ctr_odd = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0)
            {
                ctr_even++;
            }
            else
                ctr_odd++;
        }
        System.out.println("Evens: " + ctr_even);
        System.out.println("Odds: " + ctr_odd);
    }

    public int[] sumOddAndEven(int array[]){
        int sum_even = 0, sum_odd = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0)
            {
                sum_even += array[i];
            }
            else
                sum_odd += array[i];
        }

        int arr[] = {sum_even, sum_odd};

        return arr;
    }

    public void printSums(int arr[]){
        System.out.println("Evens sum: " + arr[0]);
        System.out.println("Odds sum: " + arr[1]);
    }
}
