import java.util.Scanner;

public class SumFirstLast {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        int first=n/100000000;
        int sum=first+last;
        System.out.println(sum);
    }
}
