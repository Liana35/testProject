package Review6;

public class AccountEnc {
    long acc_no;
    String name;
    String email;
    double doubleAmount;

    public void setAcc_no(long acc_no){
        this.acc_no=acc_no;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setDoubleAmount(double doubleAmount){
        this.doubleAmount=doubleAmount;
    }

    public long getAcc_no(){
        return acc_no;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public double getDoubleAmount(){
        return doubleAmount;
    }
}

class Main21{
    public static void main(String[] args) {
        AccountEnc person= new AccountEnc();
        person.setAcc_no(7560504000l);
        person.setName("Sumair");
        person.setEmail("sumair@syntax.com");
        person.setDoubleAmount(50000.0);
        System.out.println(person.getAcc_no()+" "+person.getName()+" "+person.getEmail()+" "+person.getDoubleAmount());
    }
}
