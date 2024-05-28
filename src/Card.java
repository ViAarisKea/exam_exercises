public class Card {

    private String suit;
    private int value;

    public Card(String suit, int value){
        this.suit = suit;
        this.value = value;
    }

    public boolean beats(Card card){
        if(card.getSuit().equalsIgnoreCase("spades") && suit.equalsIgnoreCase("hearts")){
            return true;
        }else if(card.getSuit().equalsIgnoreCase("hearts") && suit.equalsIgnoreCase("diamonds")){
            return true;
        }else if(card.getSuit().equalsIgnoreCase("diamonds") && suit.equalsIgnoreCase("clubs")){
            return true;
        }else{
            return false;
        }

    }

    public int getValue(){
        return value;
    }

    public String getSuit(){
        return suit;
    }
}
