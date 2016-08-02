import java.util.Scanner;
 
public class Main
{
 
    public static void main(String[] args)
    {
        Scanner key = new Scanner(System.in);
        double a, b;
        a = key.nextInt();
        b = key.nextInt();
        double sum = a/b;
        System.out.print(String.format("%.20f", sum));
    }
 
}
