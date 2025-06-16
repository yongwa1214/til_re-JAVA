package blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    private List<Card> cards = new ArrayList<>();

    public void receiveCard(Card card){
        cards.add(card); // js의 어쩌구.push 感 입니다 | 카드 소유
    }

    public List<Card> openCards(){
        return this.cards;
    }

    public void showCards(){
        for(int i =0; i < cards.size(); i++){ // size는 length 感
            Card card = cards.get(i);
            System.out.println(card);
        }
    }
}
