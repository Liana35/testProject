package class20;

public class userClass {

        String name;
        int mobileNumber;
        userClass(String name, int mobileNumber ){
            this.name=name;
            this.mobileNumber=mobileNumber;
        }
    }
class userInfo extends userClass {
    String address;

    userInfo(String name, int mobileNumber, String address) {
        super(name, mobileNumber);
        this.address = address;
    }

    void userDetails() {

        System.out.println(name + " " + mobileNumber + " " + address);
    }


    public static void main(String[] args) {
        userInfo us = new userInfo("John", 122212, "5577 Stuart Dr");

        us.userDetails();
        // all classes in java have a parent class - its an Object class


    }
}