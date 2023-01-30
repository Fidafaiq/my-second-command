package ObjectOrientedProgram;

public class IphoneTester {
    public static void main(String[] args) {
        Iphone Iphone1=new Iphone();
      Iphone.color();
      Iphone.name();
        System.out.println();


        Iphone1.color="black";
        Iphone.name="iphone";
        System.out.println("name");
        System.out.println("color");

    }
}
