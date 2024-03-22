package DSA_Shorting_BubbleTechnique;

import java.util.Arrays;

public class Bubble_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 0};
        for (int i = 0; i < arr.length - 1; i++) {
            Boolean shorted = true;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    shorted = false;
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
            if (shorted) {
                System.out.println("All reddy sorted");
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
