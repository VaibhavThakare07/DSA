package DSA_Shorting_BubbleTechnique;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] arrr = {113,2,34,4,2,32,432,4,23,13,24,2,2,34,3,4,2,2,0,56,3,5,7};
        for(int i = 0 ; i < arrr.length-1; i ++)
        {
            for (int j = 0 ; j < arrr.length-1 ; j ++)
            {
                if (arrr[j] > arrr[j+1])
                {
                    int temp = arrr[j];
                    arrr[j] = arrr[j+1];
                    arrr[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrr));
    }
}
