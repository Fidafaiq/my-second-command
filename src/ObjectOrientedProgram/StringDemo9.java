package ObjectOrientedProgram;

public class StringDemo9 {
    public static void main(String[] args) {
         String str="java is not pain";
        System.out.println(str.indexOf("j"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("p"));
        for (int i = 0; i <str.length() ; i++) {

            System.out.println(str.charAt(i)+" has the index "+i);

        }
    }
}
