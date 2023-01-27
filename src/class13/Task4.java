package class13;

public class Task4 {
    public static void main(String[] args) {

        String str = "This is the string i need to reverse";

        String[] arr = str.split(" ");
        /*for (String word : arr) {
            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
        }System.out.println(" ");
*/
/*

            String word1 = "This";
            for (int i = word1.length() - 1; i >= 0; i--) {
                System.out.print(word1.charAt(i));
            }
*/

     /*   // option 2
          StringBuilder st=new StringBuilder("This is the string i need to reverse");
        System.out.println(st.reverse());

        String str=st.toString();

        for(String word: arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.println(st);
            System.out.println();
        }*/

        // 3d way
        for(String word:arr){
            System.out.print(new StringBuilder(word).reverse()+" ");
            System.out.print(" ");
        }
        }

    }