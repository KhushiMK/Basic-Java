/*In a program,input 3numbers: A , B and C.You have to output the average of these 3 numbers. */
import java.util.*;
public class Practice1 {
    public static void main(String args[])
    {
        Scanner s =  new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();
        float avg=(a+b+c)/3;
        System.out.println(avg);
        s.close();
    }
}
