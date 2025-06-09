package ch05.sec05.method;

public class CharAtMethod {
    public static void main(String[] args) {
        String gender = checkGender("900212-1998756"); // 1,3 "남자" 리턴
        String gender2 = checkGender("900212-2998756"); // 2,4 "여자" 리턴
        String gender3 = checkGender("900212-5998756"); // 2,4 "여자" 리턴

        System.out.println(gender);
        System.out.println(gender3);

        // 8번째 문자가 2,4, . 여자 리턴
        // 1,3 남자 리턴
        // 그 이외는 null

    }
    public static String checkGender(String ssn){
        char gender = ssn.charAt(7);

       /* if (gender == '1' || gender == '3'){
            return "남자";

        }else if(gender == '2' || gender == '4'){
            return "여자";
        }
        return null;*/


        return switch(gender){
            case '2', '4' -> "여자";
            case '3', '1' -> "남자";
            default -> null;
        };

    }

}
