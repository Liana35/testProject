package class8;

public class HomeWork6 {
    public static void main(String[] args) {

        for (int i=0; i<10; i++){
            if (i==1 || i==3){
                System.out.println();
                continue;
            } if (i==6 || i==8){
                System.out.println("**");
            } else{
                System.out.println("*");
            }
        }

    }}
