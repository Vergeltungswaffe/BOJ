import java.util.*;
 
public class Main
{
    enum ResistColor {black, brown, red, orange, yellow, green, blue, violet, grey, white}
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long num = 0;
        ResistColor color = ResistColor.valueOf(scan.nextLine());
        num = 10*color.ordinal();
        color = ResistColor.valueOf(scan.nextLine());
        num += color.ordinal();
        System.out.println(num * (long)Math.pow(10, ResistColor.valueOf(scan.nextLine()).ordinal()));
        scan.close();
    }
 
}
