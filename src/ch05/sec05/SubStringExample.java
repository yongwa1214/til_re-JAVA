package ch05.sec05;

public class SubStringExample {
    public static void main(String[] args) {
        String str = "ABCDEFGHIJKLMN";
        String str2 = str.substring(8);
        // substring(여기에)하나 보내면 끝까지 가져옴 인자 두개 보내면 범위 지정가능
        String str3 = str.substring(11);

        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);

        String str4 = str.substring(0,6);
        // 0부터 6전까지 가져온다 그냥 (index, length)라고 생각하면 됨
        // substr은 (index, index)
        System.out.println(str4);

    }
}
