package MethodDemo;

public class MethodTask {

    void ispalindrome(String str) {
        StringBuilder st = new StringBuilder(str);
        st.reverse();
        String reversedStr = st.toString();
        if (str.equals(reversedStr)) {
            System.out.println(str + "is palindrome");
        } else {
            System.out.println(str + "not is palindrome");
        }
    }

    public static void main(String[] args) {
        MethodTask methodTask=new MethodTask();
        methodTask.ispalindrome("kaya ");
    }
}