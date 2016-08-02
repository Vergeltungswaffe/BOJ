import java.util.*;
 
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
         
        int min = x;
        if(min>y)
            min=y;
        if(min>w-x)
            min=w-x;
        if(min>h-y)
            min=h-y;
        System.out.println(min);
    }
}
