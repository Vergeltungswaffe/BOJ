import java.util.*;
 
public class Main
{
 
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int[] a = new int[T];
        int[] b = new int[T];
         
        for(int i=0;i<T;i++)
        {
            int atemp = scanner.nextInt();
            int btemp = scanner.nextInt();
            a[i] = atemp;
            b[i] = btemp;
        }
         
        for (int i = 0; i < T; i++)
        {
            int t = 1, temp = 1;
            for (int j = 0; j < b[i]; j++)
            {
                temp = t * a[i];
                t = temp % 10;
            }
            if (t == 0)
                System.out.println(10);
            else
                System.out.println(t % 10);
        }
    }
}
