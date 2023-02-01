package Class15HW;

public class Task4 {
    /*
    Create a method that will say Hello
    in different language based on the country
    that will passed when method is executed
     */


    String hello(String country) {
        switch (country) {
            case "Ukraine":
                return "Privit";
            case "Spain":
                return "Hola";
            case "England":
                return "Hi";
            default:
                return "unknown";
        }



    }


    public static void main(String[] args) {

        Task4 name= new Task4();
       // String line2="Ukraine";
        //System.out.println(name.hello(line2));
        //or
        System.out.println(name.hello("jsdfh"));
    }


    }



