package ObjectOrientedProgram;

public class StringDemo {
    public static void main(String[] args) {

        String strObj=new String("java");
        String strObj2="java";
        System.out.println(strObj2.length());
         String str="banana";
         int len=str.length();
        System.out.println(len);
        String name="Ahmad";
        if(name.length()>10){
            System.out.println("name is not more then 10 letters");
        }
    }
}
