package MethodDemo;

public class Taske6 {

     int sumArrayElements(int[] array){
         int sum=0;
         for(int num:array){
             sum+=num;
         }
         return sum;
     }

    public static void main(String[] args) {
        int[] arr={10,25,35,45};
        Taske6 taske6=new Taske6();
        System.out.println(taske6.sumArrayElements(arr));
    }
}
