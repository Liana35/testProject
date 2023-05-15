package Review6;

public class Person {

String firstname;
String lastname;
int birthmonth;
int birthday;

int birthyear;
String ssn;

    public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthmonth = birthmonth;
        this.birthday = birthday;
        this.birthyear = birthyear;
        this.ssn = ssn;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLaststname(){
        return lastname;
    }

    public int getBirthmonth(){
        return birthmonth;
    }
    public int getBirthday(){
        return birthday;
    }
    public int getBirthyear(){
        return birthyear;
    }
    public String getSsn(){
        return ssn;
    }


    public String formatBirthday(){

        return birthmonth+"/"+birthday+"/"+birthyear;
    }
}

class Main378{
    public static void main(String[] args) {
        Person pers= new Person("John","Doe",10,25,1900,"123-45-6789");
        System.out.println(pers.getFirstname());
        System.out.println(pers.getLaststname());
        System.out.println(pers.formatBirthday());
        System.out.println(pers.getSsn());
    }
}
