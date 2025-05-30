package ch05.sec08;

public class ArrayRefObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray [0] = "Java";
        strArray [1] = "Java";
        strArray [2] = new String("Java");

        System.out.println(strArray[0] == strArray[1]);

        String[] strArray2 = new String[3];
        strArray2 [0] = "Java";
        System.out.println(strArray[0] == strArray2[0]);
    }
}
