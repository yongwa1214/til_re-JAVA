package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "950624-1230123";
        char gender = ssn.charAt(7); // 문자열에서 특정 문자를 가져오고 싶을 대 charAt을 사용
                                     // charAt은 0번부터 시작합니다
        System.out.println("gender: " + gender);
        /*switch(gender){
            case '1', '3': //: 대신 -> 이렇게 써도 됨 이렇게 쓰면 break; 필요없음
                System.out.println("남자입니다");
                break;
            case '2', '4':
                System.out.println("여자입니다");
                break;
        }*/
        if (gender == '1' || gender == '3' ){ // ""은 String, ''은 char
            System.out.println("남자입니다");
        }else{
            System.out.println("여자입니다");
        }
        // char
        Character.getNumericValue(gender); // 이러면 char = '1' 이 int = 1이 됩니다
    }
}
