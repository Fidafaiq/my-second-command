package ObjectOrientedProgram;

public class CarTester {
    public static void main(String[] args) {

        car bmw=new car();
        bmw.make="BMW";
        bmw.model="i7";
        bmw.year=2023;
        bmw.color="Grey";
        bmw.moveForward();
        bmw.applyBrakes();

    }
}
