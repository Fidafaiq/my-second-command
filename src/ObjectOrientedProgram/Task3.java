package ObjectOrientedProgram;

public class Task3 {
    public static void main(String[] args) {
        /* Create a String that will hold a sentence.
         Write a program to get a new String without any spaces
         */

       String str="I'm originally from afghanistan";
       String withoutspace= str.replaceAll(" ","");
        System.out.println(withoutspace);
    }
}
