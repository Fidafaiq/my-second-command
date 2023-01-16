public class Class12 {
    public static void main(String[] args) {

        boolean summer=true;
        int temp=75;
        while(summer){
            if (temp<100){
                System.out.println(" i love summer because temp is"+temp);
            }else{
                summer=false;
                System.out.println("its very hot"+temp);
            }
            temp+=5;
        }
    }
}
