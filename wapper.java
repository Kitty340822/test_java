package test;
import java.util.Scanner;
public class wapper {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner a = new Scanner(System.in);
        int number = a.nextInt();
        Integer i =new Integer(number);
        String s =i.toString(number);
        System.out.println("string: "+s);
        
    }
    
}
