
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
public class Solution {

    /**
     * @param args
     * 
     */
    public static long[] convertStringToLong(String array[])
    {
        long longArray[] = new long[array.length];
        for (int i = 0; i < array.length; i++) longArray[i] = Long.parseLong(array[i]);
        return longArray;
    }
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        FileInputStream fis = new FileInputStream("MinimumScalarProductB.in");
        DataInputStream in = new DataInputStream(fis);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int N = Integer.parseInt(br.readLine());
        int x = 1;
        int totalVectors;
        BigInteger min;
        long arrX[], arrY[];
        while(x <= N)
        {
            totalVectors = Integer.parseInt(br.readLine());
            arrX = convertStringToLong(br.readLine().split(" "));
            arrY = convertStringToLong(br.readLine().split(" "));
            Arrays.sort(arrX);
            Arrays.sort(arrY);
            min= new BigInteger("0");
            for (int i = 0; i< totalVectors; i++ )
            {
                min = min.add(new BigInteger(Long.toString(arrX[i] * arrY[(totalVectors-1)-i])));
            }
            System.out.println("Case #"+x+": "+min);
            x++;
        }
        br.close();
    }
}