package class11;

public class Task6 {
    public static void main(String[] args) {
        String [][] countries={{"USA","Canada"},
            {"Peru", "Brazil","Chile", "Argentina"},
            {"France", "Ukraine", "Portugal", "Austria"},
            {"Thailand","South Korea","China"},
            {"Tunis", "Morocco", "Zimbabwe"}
        };
        int total=0;
        for (int i=0; i<countries.length; i++){
            for (int j=0; j<countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                total++;
            }
            System.out.println();
            }

        System.out.println("Total countries "+total);

        // enhanced for loop
        for(String [] country: countries){
            for(String s:country){
                System.out.print(s+" ");
                total++;
            }
            System.out.println();
        }
        System.out.println("Total countries "+total);


    }
}
