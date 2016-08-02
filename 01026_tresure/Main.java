import java.util.*;
 
public class Main
{
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++)
            a[i] = scan.nextInt();
        for(int i=0;i<n;i++)
            b[i] = scan.nextInt();
        scan.close();
        Arrays.sort(a);
        Arrays.sort(b);
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i]*b[n-1-i];
        System.out.println(sum);
    }
}
