import java.util.*;
 
public class Main
{
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0; i<n;i++)
            fibonacci(scan.nextInt());
        scan.close();
    }
     
    static void fibonacci(int a)
    {
        if(a==0)
        {
            System.out.println("1 0");
            return;
        }
        if(a==1)
        {
            System.out.println("0 1");
            return;
        }
        int cnt[][] = new int[a+1][2];
        cnt[0][0] = 1;
        cnt[0][1] = 0;
        cnt[1][0] = 0;
        cnt[1][1] = 1;
        for(int i=2; i<=a;i++)
        {
            cnt[i][0] = cnt[i-1][0]+cnt[i-2][0];
            cnt[i][1] = cnt[i-1][1]+cnt[i-2][1];
        }
        System.out.println(cnt[a][0]+" "+cnt[a][1]);
    }
 
}
