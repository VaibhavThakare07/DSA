package DSA_Shorting_BubbleTechnique;

public class Bubble {
    public static void main(String[] args)
    {

        int [] arr1 = {12,24,4,57,68,7,45,32,12};
        for (int i = 0; i < arr1.length-1; i++)
        {
            for (int j = 0; j < arr1.length-1; j++)
            {
                if (arr1[j] > arr1[j+1])
                {
                    int temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }

            }
        }
        for (int num : arr1)
        {
            System.out.print(num +" ");
        }
       // System.out.println(Arrays.toString(arr1));
    }
}
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int a = 10;
//        int b = 20;
//        System.out.println(a + " "+ b);
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " "+ b);
//
//
//    }
//}
