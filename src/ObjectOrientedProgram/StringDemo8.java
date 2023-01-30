package ObjectOrientedProgram;

public class StringDemo8 {
    public static void main(String[] args) {

        String str="jdnfkd  99887 $#%@";

        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        System.out.println("total isAlphabetic in Str"+counter);
    }
}
