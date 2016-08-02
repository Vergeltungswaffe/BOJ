import java.util.*;
 
public class Main
{
 
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int result = -1;
        int n = scanner.nextInt();
        int temp = n;
        while(n!=result)
        {
            result = generateNum(temp);
            temp = result;
            count+=1;
        }
        System.out.println(count);
    }
     
    static int generateNum(int a)
    {
        int x = (a-(a%10))/10;
        int y = a%(10);
        int z = x+y;
        return (10*y)+(z%(10));
    }
}
