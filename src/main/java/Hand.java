import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;
    private String playerName;

    public Hand(String playerName){
        this.playerName = playerName;
        cards = new ArrayList<>();
    }

    public void deal(Card card){
        cards.add(card);
    }

    public int getSize(){
        return cards.size();
    }

    public int getValue(){
        int value = 0;
        for (Card card : cards){
            card.flip();
            value += card.getPointValue();
            card.flip();
        }
        return value;
    }

    public String toString(){
        return  String.format("%s", playerName);
    }
}
