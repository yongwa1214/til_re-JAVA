package ch05.sec05;

public class SplitExample {
    public static void main(String[] args) {

    String board = "번호, 제목, 내용, 성명";
    board.split(",");
    String[] arr = board.replace(" ","").split(",");
                // 객체(또는 배열)주소 . << 을 사용할 수 있음
                // 보드 객체(또는 배열)이다
                // split는 string 배열
                // split이 결과가 됨 이게 arr에 담김 그러니까 split이 string 배열이라는거죠
    // 즉 아래와 같다.
    // String replaceBoard = board.replace(" " ,"");
    // String[] arr = replaceBoard.split(",");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);


    }

}
