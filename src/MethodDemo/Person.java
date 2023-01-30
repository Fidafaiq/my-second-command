package MethodDemo;

public class Person {

    private double bankBalance=10000;
    String Address="street 123";
    public String name="jon snow";


    private void printPhonePassword(){
        System.out.println("123abc");
    }
    void printSSN(){
        System.out.println("12345678910");
    }

   public void printTikTokAccount(){
       System.out.println("user123");
    }

    public static void main(String[] args) {

        Person person=new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.Address);
        System.out.println(person.name);
          person.printPhonePassword();
          person.printSSN();
          person.printTikTokAccount();
    }
}
