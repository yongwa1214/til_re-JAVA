package ch13.sec01;



public class BoxGenericExample {
    public static void main(String[] args) {
        BoxGeneric<String> strBox = new BoxGeneric<>(); // new bg<> 에 꺾쇠가 있어도 되고 없어도 되는데 걍 넣어
        // 이제부터 String 타입만 집어넣을 수 있음 형변환 안해도 됨
        strBox.setObj("안녕");

        String strValue = strBox.getObj();

        BoxGeneric<Integer> intBox =  new BoxGeneric<>();
    }
}

