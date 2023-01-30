package ObjectOrientedProgram;

public class HomeWork06 {
    public static void main(String[] args) {
          /* Create a 2D array or integer type where you will store odd and even
          numbers in 3 rows and 4 columns.
           Develop a program which will identify/print the even numbers only.
           */
         int evenSum=0;
         int oddSum=0;
        int[][] numbers={   { 10,12,1,5,},
                             {11,45,55,60},
                               {90,35,76,75}
        };
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i][j]%2==0){
                    evenSum = numbers[i][j];
            }else if (numbers[i][j]%2==0){
                    oddSum+=numbers[i][j];
                }
                System.out.println("the sum of even numbers is:" +evenSum);
                System.out.println("the sum of odd numbers in:"+oddSum);
            }

        }
    }
}
