/*Enter cost of 3 items from the user(using float datatype)-a pencil,a pen and an eraser. 
You have to output the total cost of the items back to the user as their bill. */
import java.util.*;
public class Practice3 {
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        float  pencil = s.nextFloat();
        float  pen = s.nextFloat();
        float  eraser = s.nextFloat();
        float cost = pencil + pen + eraser;//without gst 
        float costgst = cost + (0.18f * cost);//without gst
        System.out.println("The cost of a pencil , a pen and a eraser: " + cost);
        System.out.println("The cost of a pencil , a pen and a eraser: " + costgst);
        s.close();
    }
}
