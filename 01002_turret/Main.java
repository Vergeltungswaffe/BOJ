import java.util.*;
 
public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println(NumOfPlace(scan.nextInt(),scan.nextInt(),scan.nextInt(),
                  scan.nextInt(),scan.nextInt(),scan.nextInt()));
        }
        scan.close();
    }
 
    static int NumOfPlace(int x1, int y1, int r1, int x2, int y2, int r2)
    {
        int dist = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        int far = Math.max(r1, r2);
        int close = Math.min(r1, r2);
        if(dist==0)
        {
            if(r1==r2)
                return -1;
            else
                return 0;
        }
        else
        {
            if((r1+r2)*(r1+r2)<dist||dist<(far-close)*(far-close))
                return 0;
            else
            {
                if((r2+r1)*(r2+r1)==dist||(far-close)*(far-close)==dist)
                    return 1;
                else
                    return 2;
            }
        }
 
    }
}
