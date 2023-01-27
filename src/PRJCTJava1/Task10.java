package PRJCTJava1;

public class Task10 {
    //Write a java program to find the second largest number in the array?
    public static void main(String[] args) {
        int[] arr = {120, 11, 25, 63, 96, 57};
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {

                secondLargest = largest;

                largest = arr[i];

            } else if (arr[i] > secondLargest) {

                secondLargest = arr[i];

            }

        }
        System.out.println("the second largest number is :" + secondLargest);
    }
}