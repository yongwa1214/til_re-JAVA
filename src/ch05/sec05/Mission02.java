package ch05.sec05;

public class Mission02 {
    public static void main(String[] args) {
        String fileName = "가나다라.haha.jpg";

        int ext = fileName.lastIndexOf("."); // 여기에 +1 해도 됨
        // 뒤에서 . 을 찾음
        // 그 인덱스 뒷번호부터 마지막까지 가져옴
        String ext1 = fileName.substring(ext+1);
        System.out.println("ext: " + ext1);
    }
}
