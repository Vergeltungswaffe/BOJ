import java.util.*;
 
public class Main
{
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        System.out.println(Integer.bitCount(x));
    }
     
}
