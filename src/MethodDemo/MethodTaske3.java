package MethodDemo;

public class MethodTaske3 {

    String sayHello(String countryName){
         switch (countryName){
             case "USA":
                 return "Hello";
             case " kazakhstan":
                 return "salam";
             case "Italy":
                 return "ciao";
             case "China":
                 return "Ni hao";
             default:
                 return "country not supported";
         }
     }

    public static void main(String[] args) {
        MethodTaske3 methodTaske3=new MethodTaske3();
        System.out.println(methodTaske3.sayHello("Italy"));
        }
    }

