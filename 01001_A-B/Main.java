import java.util.Scanner;
 
public class Main
{
 
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        int a, b;
        a = key.nextInt();
        b = key.nextInt();
        int sum = a-b;
        System.out.print(sum);
    }
 
}
