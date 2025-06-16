package blackjack;

public class Card {
    private String patten;
    private String denomination;

    public Card(String patten, String deno){
        this.patten = patten;
        this.denomination = deno;
    }

    public String getDenomination (){
        return denomination;
    }

    public String getPatten(){
        return patten;
    }
    @Override
    public String toString(){
        return String.format("%s (%s)", this.patten, this.denomination);
    }
}
