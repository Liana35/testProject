package class24;

public class PhoneTester {
    public static void main(String[] args) {

        Phone [] phones={new Samsung(), new IPhone()};
        for(Phone po: phones){
            po.displayPictures();
            po.unlockPhone();
            po.sendText();
        }

    }
}
