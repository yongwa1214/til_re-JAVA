package ch13.sec01;

public class BoxObjExample {
    public static void main(String[] args){
        BoxObj obj = new BoxObj(); //Object 타입은 뭐든지 다 받을 수 있다.
        obj.setObj(10); // integer 객체로 바뀌어서 저장됨

        int result = (int)obj.getObj();
        System.out.println("result:" + result);

        obj.setObj("문자열");

        String strValue =(String)obj.getObj();
        System.out.println("result2:"+ strValue);


        obj.setObj(true);
    }
}
