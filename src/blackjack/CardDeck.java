package blackjack;

public class CardDeck {
    private Card[] cards = new Card[52];
    private String[] patterns = {"S", "H", "D", "C"};
    private int selectedIdx = 0;
    // 패턴은 Spade, Heart, Diamond, Clover
    // 디노미네이션  a,2,3,4,5,6,7,8,9,0,j,q,k

    // 기본 생성자
    public CardDeck(){
        int index = 0;
        for(int i = 0; i<patterns.length; i++){ //4

            for(int k = 1; k<=13; k++){ //13
                String denomination = switch (k){
                    case 1 -> "A";
                    case 11 -> "J";
                    case 12 -> "Q";
                    case 13 -> "K";
                    default -> String.valueOf(k);
                };
                cards[index++] = new Card(patterns[i],denomination);

            }
        }
        shuffle();
    }

    private void shuffle(){
        for(int i = 0; i< cards.length; i++){
            int rNum = (int)(Math.random() * cards.length);
            Card temp = cards[i];
            cards[i]= cards[rNum];
            cards[rNum] = temp;

        }
    }

    public Card getCard(){
        if(selectedIdx == cards.length){
            return  null;
        }
        Card c = cards[selectedIdx];
        cards[selectedIdx++]=null;
        return c;
    }

    public void printAllCards(){
        for(Card card : cards){
           //System.out.printf("%s (%s)\n", this.getPatten(), this.getDenomination());
            System.out.println(card);
        }
    }



//    @Override// 에노테이션
//    public String toString(){
//        return "나는 카드덱이야";
//    }
}
