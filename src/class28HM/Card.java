package class28HM;

import java.util.Iterator;
import java.util.LinkedList;

public class Card {
   /* Create a Card class that will have interest rate field and card type
      and a constructor that will initialize the fields.
      Create 3 objects of different card and store them into LinkedList.
      Using for loop/advanced for loop/ iterator access all methods of the class.*/


    double interestRate;
    String cardType;

    Card(double interestRate, String cardType) {
        this.interestRate = interestRate;
        this.cardType = cardType;
    }

    public void interest() {
        System.out.println("Interest on card " + cardType + " is " + interestRate + " % ");
    }

    public void cardType() {
        System.out.println("Your card type is " + cardType);
    }

    public static void main(String[] args) {
        Card Visa = new Card(12.0, "Visa");
        Card Amex = new Card(15, "Amex");
        Card MasterCard = new Card(19.27, "MasterCard");
        LinkedList<Card> cards = new LinkedList<>();
        cards.add(Visa);
        cards.add(Amex);
        cards.add(MasterCard);
        for (Card x : cards) {
            x.cardType();
            x.interest();
        }


        Iterator<Card> i2=cards.iterator();
        while (i2.hasNext()){
            Card c=i2.next();
           c.interest();
           c.cardType();
        }

        for (int i = 0; i < cards.size(); i++){
            Card c= cards.get(i);
            c.interest();
            c.cardType();
        }




    }

}
