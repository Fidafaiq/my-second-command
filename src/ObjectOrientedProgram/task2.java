package ObjectOrientedProgram;

public class task2 {
    public static void main(String[] args) {

        String day="sunday";
        String reverse="";
        for (int i = 0; i < day.length(); i++) {
            reverse= day.charAt(i)+reverse;

        }
        System.out.println(reverse);



    }
}
