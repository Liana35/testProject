package Review6;

public class Avarage {
  final static double avgElements2(int[] nums){
    int sum = 0;
    for (int num : nums) {
      sum += num;
    }
    return sum/nums.length;
  }


  public static void main(String[] args) {
    int[] a = {2,7,3,8,4};
    System.out.println(avgElements2(a));

    }
  }



