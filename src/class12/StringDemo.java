package class12;

public class StringDemo {
    public static void main(String[] args) {

        //LENGTH METHOD

        // creating an object of String class
        String strObj= new String("Java"); //strObj - is object // java inside is optional

        // output= is also called returns
        // another way of creating an  object of String class
        // mostly this is how we create the objects of String class


        // LENGTH METHOD
        String strObj2="Java";
        System.out.println(strObj2.length());
      String str="Banana";
        System.out.println(str.length());
        int len=str.length();
        System.out.println(len);

        String name="Rafik";
        if(name.length()>10){
            System.out.println("Name cant be more than 10 letters");
        }



    }
}
