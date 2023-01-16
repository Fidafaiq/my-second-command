public class Class23 {
    public static void main(String[] args) {

        /*   Create an array of chars and store grades into it:
         A,B,C,D,E,F. Then print a grade B
         (use 2 different ways of creating an array).
         */


        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < letters.length; i++) {
            if (i == 1) {
                System.out.println(letters[1]);
            }


        }
    }
}
