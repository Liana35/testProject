package class19;

public class TestBA {
    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=78976483445l;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);


        System.out.println("----Creating an object of checking account----");



        Checking check=new Checking();
        //features from parent
        check.accountNumber=45730983l;
        check.money=780;
        check.deposit();

        // features from checking class itself
        check.interest=0;
        check.transfer();

        System.out.println("----Creating an object of Savings account----");

        Savings save=new Savings();
        save.accountNumber=8439758934l;
        save.money=7687;
        save.profit=121;
     //   save.interest=45; siblings features are not available
        save.deposit();  // from parent
        save.takeProfit(); // comes from savings, its own method


        System.out.println("----Creating an object of Super Savings account----");

        SuperSavings supSave= new SuperSavings();
        supSave.checkFicoScore=800;
        supSave.superSaving();
        supSave.profit=150;
        supSave.takeProfit();
        supSave.money=10000;
        supSave.accountNumber=1213213l;
        supSave.deposit();
       // supSave.transfer() - not available

    }
}
