import java.io.*;
 
public class Main
{
    static int[][][] arr = new int[21][21][21];
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] fileNames = new String[n];
        for(int i=0;i<n;i++)
            fileNames[i] = br.readLine();
        for(int i=0;i<fileNames[0].length();i++)
        {
            char temp = fileNames[0].charAt(i);
            sb.append(temp);
            for(int j=1;j<n;j++)
            {
                if(fileNames[j].charAt(i)!=temp)
                {
                    sb.setCharAt(i, '?');
                    break;
                }
            }
        }
        System.out.println(sb.toString());
    }
}
