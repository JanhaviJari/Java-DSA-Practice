import java.util.Arrays;

public class MaxSubArray {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5};
        int[] subarray = new int[20];
        int sum = 0;
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                sum = 0;
                for (int x = start; x <= end; x++) {
                    sum = sum + arr[x];
                    {
                        subarray[start] = sum;
                    }
                   // int max = Arrays.stream(subarray).max().getAsInt();
                   // System.out.println(max);
                }
            }
        }
        int max = Arrays.stream(subarray).max().getAsInt();
        System.out.println(max);
    }
}


