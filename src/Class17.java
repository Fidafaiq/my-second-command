
import java.util.Scanner;
public class Class17{

    public static void main(String[] args) {

        Scanner sacan=new Scanner(System.in);
        System.out.println(" would you like to apply for a credit card");
        boolean creditcard= sacan.hasNextBoolean();
        for (int i = 0; i <=10; i++){
            System.out.println("would you ,like to apply for a credit card");

            creditcard= sacan.hasNextBoolean();
            break;
        }

    }
}
