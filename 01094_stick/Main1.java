import java.util.*;
 
public class Main
{
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.close();
        Vector<Integer> vec = new Vector<>();
        vec.add(64);
        while(x!=sum(vec))
        {
            if(x<sum(vec))
            {
                vec.set(vec.size()-1, vec.lastElement()/2);
                vec.add(vec.lastElement());
                if(sum(vec)-vec.lastElement()>=x)
                    vec.remove(vec.size()-1);
            }
        }
        System.out.println(vec.size());
    }
     
    static int sum(Vector<Integer> v)
    {
        int temp =0;
        for(int i=0;i<v.size();i++)
            temp += v.get(i);
        return temp;
    }
     
}
