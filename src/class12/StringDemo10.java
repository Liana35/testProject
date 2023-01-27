package class12;

public class StringDemo10 {
    public static void main(String[] args) {

        //THE LOCATION (INDEX) OF A CHARACTER


        // the input is char but can be String
        String str="Java is not pain";
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("not"));  // for multiple it will only show the first one

        for(int i=0; i< str.length(); i++){
            System.out.println(str.charAt(i)+" has the index "+i);
        }


    }
}
