package ObjectOrientedProgram;

public class HomeWork05 {
    public static void main(String[] args) {

        int[] numbers=new int[6];

        numbers[0]=10;
        numbers[1]=70;
        numbers[2]=5;
        numbers[3]=1;
        numbers[4]=4;
        numbers[5]=5;
        int sum=0;
        for (int i = 0; i <numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);


    }
}
