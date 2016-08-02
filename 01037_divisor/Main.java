import java.util.*;
 
public class Main
{
 
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] a = new int[N];
         
        for(int i=0; i<N;i++)
        {
            int temp = scanner.nextInt();
            a[i] = temp;
        }
        Arrays.sort(a);
        System.out.println(a[0]*a[N-1]);
         
    }
     
}
