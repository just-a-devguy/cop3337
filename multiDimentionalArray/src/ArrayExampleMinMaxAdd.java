import java.util.Scanner;

public class ArrayExampleMinMaxAdd {

    public static void main(String[] args) {
        int[] num;
        System.out.println("How many values you want to enter?");
        Scanner scan = new Scanner(System.in);
        num = new int[scan.nextInt()];
        int sum = 0;
        System.out.println("Enter " + num.length + " values and hit enter after each input");
        for(int i = 0; i<num.length; i++) {
            num[i] = scan.nextInt();
            sum += num[i];
        }
        int max = num[0];
        int min = num[0];
        for(int i = 1; i<num.length; i++) {
            if(num[i] > max)
                max = num[i];
            if(num[i] < min)
                min = num[i];
        }

        System.out.println("Sum = " + sum);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }

}


