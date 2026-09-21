public class RevString {
    public static void main(String args[]){
        String s ="Hello world!";
        char[] arr=s.toCharArray();

        int left=0;
        int right=arr.length-1;
        if(arr[left]== ' ')
            left++;
        else if(arr[right]==' ')
            right--;
        else
        {
            while(left<right)
            {
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;

            }
        }
        System.out.println(arr);

    }
}
