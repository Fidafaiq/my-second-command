import java.util.Arrays;
import java.util.Scanner;

public class Class27 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("please enter 5 numbers");
        int []numbers=new int[5];

        numbers[0]=scan.nextInt();
        numbers[1]=scan.nextInt();
        numbers[2]= scan.nextInt();
        numbers[3]=scan.nextInt();
        numbers[4]=scan.nextInt();

        System.out.println(Arrays.toString(numbers));

    }

}
