class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "Kind : " + kind + " , number : " + number;
    }
}
class CardToString2 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card("Heart", 10);
        
        System.out.println(c1);
        System.out.println(c2.toString());
    }
}
