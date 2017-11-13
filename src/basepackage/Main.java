package basepackage;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentId = i;
            int currentVal = arr[currentId];

            while (currentId > 0 && arr[currentId - 1] > currentVal) {
                arr[currentId] = arr[currentId-1];
                currentId -= 1;
            }

            arr[currentId] = currentVal;
        }

        return arr;
    }

    public static void main(String[] args) {
	    //int[] inArr = new int[] {5, 2, 6, 12, 4, 11, 3};

        Scanner sc = new Scanner(System.in);
        String arrLine = sc.nextLine();
        String[] numbers = arrLine.split(" ");
        int[] inArr = new int[numbers.length];

        for (int i = 0; i < inArr.length; i++) {
            inArr[i] = Integer.parseInt(numbers[i]);
        }

        int[] sortedArr = insertionSort(inArr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
