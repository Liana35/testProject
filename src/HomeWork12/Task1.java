package HomeWork12;

public class Task1 {
    public static void main(String[] args) {


        String newString="Letters";

        if(!newString.isEmpty()){
            if(newString.length()%2!=0&&newString.length()>=3){
               // System.out.println(newString.charAt(newString.length()/2));

                //or
                int middle= newString.length()/2;
                System.out.println(newString.charAt(middle));
            }

        }

        }

    }

