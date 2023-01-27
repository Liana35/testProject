package class12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your username");
        String userName=scan.next();
        System.out.println("Please enter your password");
        String password=scan.next();
        System.out.println("Please enter yor password again");
        String confirmPassword=scan.next();





        if(userName.isEmpty()||(password.isEmpty())) {
            System.out.println("Username and password cannot be empty") ;
            } else if (password.length()<8) {
                System.out.println("Password is too short, should be 8 characters or more");
            }else if  (password.contains(userName)){
            System.out.println("Password cannot contain username");
            } else if(!password.equals(confirmPassword)){
            System.out.println("Passwords do not match");
          }else{
            System.out.println("Your user name and password have been created");
        }





    }
}
