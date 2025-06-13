package blackjack;

public class BlackJack {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        //cd.printAllCards();
        Card c = cd.getCard();
        System.out.println(c);
        System.out.println(cd.getCard());
        System.out.println(cd.getCard());

        System.out.println("============");
        cd.printAllCards();

//        Object obj = cd;
//        obj = 1;
//
//        System.out.println(cd);
//        System.out.println(cd.toString());

    }
}
