package ObjectOrientedProgram;

public class HomeWork07 {
    public static void main(String[] args) {

        String [][] cars={ { "American","German","korean","Italian"},
                {"Ford"," BMW","Kia","Ferrari"}

        };
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j]+" , "+" ");
            }
            System.out.println();

        }
        System.out.println();


        System.out.println("------------");

        for(String[] car: cars){
            for(String car2: car){
                System.out.println(car2+" , "+" ");
            }
            System.out.println();
        }
        System.out.println();

        {

        }
    }
}
