package class26;

public class Account {

   private double balance;
   private String accountNumber;
  private   String type;
    private String accountTitle;


    public void setAccountNumber(String accountNumber){
        if(accountNumber.length()!=16){
            System.out.println("Wrong account number");
        }else{
            this.accountNumber=accountNumber;
        }
    }

    public String getAccountNumber(){
        return accountNumber;
    }

    public void setBalance(double balance){
        //sanitizing the input meaning checking the values before we can assign them
        if(balance<0){
            System.out.println("Negative balance is not allowed in a current account");
        }else{
            this.balance=this.balance+balance;
        }
    }


    public double getBalance(){
        return balance;
    }



    public  String getAccountTitle(){
        return accountTitle;
    }

    public Account(double balance, String accountNumber, String type, String accountTitle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTitle = accountTitle;
    }
}

class AccountTester{
    public static void main(String[] args) {
        Account account = new Account(-1000,"sfjkf", "kjfhsdkf", "dhffdk");
        System.out.println(account.getAccountTitle());
        account.setBalance(7483);
    }
}
