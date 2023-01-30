package ObjectOrientedProgram;

public class ArrayAddMachine {
    static void addArrayElenentMachine(int[] arr) {
        int sum=0;
        for (int number:arr){
            sum+=number;
        }
        System.out.println(sum);

    }
    public static void main(String[]args){
        int [] array2={10,10,10,20,30};
        addArrayElenentMachine(array2);
        int [] array3={20,20,40,40};
        addArrayElenentMachine(array3);
    }

}
