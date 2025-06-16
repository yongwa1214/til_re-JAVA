package blackjack;

import java.util.List;

public class Rule {
    private final static int MAX_SCORE = 21;
    public static void getWinner(Dealer dealer, Gamer gamer){
        // 경우의 수 6가지
        // 1. 둘 다 총 점수가 21점 초과
        // 2. 둘 다 총 점수가 21점 이하지만 점수가 같음 >> 비김
        // 3. 딜러의 총 점수가 21점 초과 게이머의 총 점수가 21점 이하 >> 게이머 승
        // 4. 둘 다 총 점수가 21점 이하지만 게이머의 총 점수가 21점에 가까움 >> 게이머 승
        // 5. 게이머의 총 점수가 21점 초과 딜러의 총 점수가 21점 이하 >> 딜러 승
        // 6. 둘 다 총 점수가 21점 이하이지만 딜러의 총 점수가 21점에 가까움
        //----
        /*
        1. 비김
        2. 게이머 승
        3. 딜러 승
        ---
        1. 21 초과 ==> 비김
        2. 21 이하
        */


        int scoreD = getScore(dealer.openCards());
        int scoreG = getScore(gamer.openCards());
        if( scoreD > MAX_SCORE && scoreG > MAX_SCORE || scoreD == scoreG){
            System.out.println("Draw");
        }else if(scoreD <= MAX_SCORE && scoreG <= MAX_SCORE){
            System.out.println(scoreD > scoreG ? "Dealer Win" : "Gamer Win");
        }else if(scoreD <= MAX_SCORE){
            System.out.println("Dealer Win");
        }else {
            System.out.println("Gamer Win");
        }
    }


    // 객체 생성없이 호출하려면 static
    public static int getScore(List<Card> cards ) {
        int score = 0;
        for (Card card : cards) {
            int eachScore = convertDenominationToScore(card.getDenomination());
            score += eachScore;

        }
        return score;
    }

    // 왜 이렇게 쪼개나요?
    // 보기 힘들어서 switch << 뭔 작업하는지 해석해야함
    // 그래서 뭐하는 작업인지 이름을 주려고 메소드로 뺌
    private static int convertDenominationToScore(String denomination){
        return switch (denomination) {
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(denomination);
        };
    }
}
