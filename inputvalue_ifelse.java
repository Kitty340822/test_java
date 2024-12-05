package test;
import java.util.Scanner;
public class inputvalue_ifelse {
    public static void main(String[] args) {
        System.out.println("Enter value");
        Scanner va = new Scanner(System.in);
        int value = va.nextInt();
        if(value >500){
         
           System.out.print("can buy");
        }
        else
            System.out.print("can't buy");
    }
    
}
