package example3;

public class Card {
    public static void main(String[] args) {
        Card c = new Card("1021");
        Card cc = new Card("1021");
        System.out.println(c.hashCode()+"  "+cc.hashCode());
    }
    private String number; // 12345

    public Card(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;

        if (o instanceof Card) {
            Card c = (Card) o;
            return c.getNumber().equals(this.number);
        } else {
            return false;
        }
    }
 }