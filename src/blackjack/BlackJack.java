package blackjack;

import java.util.List;

public class BlackJack {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        //cd.printAllCards();
        Card c = cd.getCard();
        System.out.println(c);
        System.out.println(cd.getCard());
        System.out.println(cd.getCard());

        System.out.println("============");
        //cd.printAllCards();

//        Object obj = cd;
//        obj = 1;
//
//        System.out.println(cd);
//        System.out.println(cd.toString());
        System.out.println("-------------게이머 카드-------------");
        Gamer gamer = new Gamer();
        gamer.receiveCard(c);
        gamer.receiveCard(cd.getCard());
        gamer.receiveCard(cd.getCard());
        gamer.showCards();

        List<Card> cardsG = gamer.openCards();
        int score = Rule.getScore(cardsG); // A:1 , 2~10 그대로 jQK,10

        System.out.println("score:" + score);

        System.out.println("-------------딜러 카드-------------");
        Dealer dealer = new Dealer();
        List<Card> cardsD =dealer.openCards();
        dealer.receiveCard(cd.getCard());
        dealer.receiveCard(cd.getCard());
        dealer.showCards();
        int score2 = Rule.getScore(cardsD);
        System.out.println("score2:" + score2);

        System.out.println(dealer.needMoreCard());
        if(dealer.needMoreCard()){ // if 안에 올 수 있는 값은 불린 타입밖에 없다.
            dealer.receiveCard(cd.getCard());
        }
        dealer.showCards();

    }
}
