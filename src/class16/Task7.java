package class16;

public class Task7 {

  static  int sumArrayElements(int[] array){
        int sum=0;
        for(int num:array){
            sum+=num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr={10,25,35,45};

        Task7 task7=new Task7();
        System.out.println(task7.sumArrayElements(arr));
       // System.out.println(sumArrayElements(arr));

    }

}
