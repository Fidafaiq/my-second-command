package MethodDemo;

public class MPractice3 {

    int largerNumber(int num1,int num2){
        if( num1>num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static void main(String[] args) {
        MPractice3 mp=new MPractice3();
        System.out.println(mp.largerNumber(12,13));
    }
    }