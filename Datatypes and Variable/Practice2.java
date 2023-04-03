
/* In a program , input the side of a square.You have to output the area of the square.*/
import java.util.*;
public class Practice2 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        float l = s.nextFloat();
        float area = l * l;
        System.out.println(area);
        s.close();
    }
}
