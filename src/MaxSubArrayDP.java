import java.util.Arrays;

public class MaxSubArrayDP {
    public static void main (String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5};
        int[] subarray = new int[20];
        int maxsum=0;
        int currsum=0;
        for (int start = 0; start < arr.length; start++) {
            currsum=0;
            for (int end = start; end < arr.length; end++) {
                    currsum = currsum + arr[end];
                    maxsum=Math.max(currsum,maxsum);
                    // int max = Arrays.stream(subarray).max().getAsInt();
                    // System.out.println(max);
                }
            }

        //int max = Arrays.stream(subarray).max().getAsInt();
        System.out.println(maxsum);
    }
    }

