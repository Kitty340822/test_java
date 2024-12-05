package test;
import java.util.Scanner;
public class printf {
    public static void main(String[] args) {
        System.out.println("Enter score ");
        Scanner x = new Scanner(System.in);
        int i=x.nextInt();
        System.out.println("Enter Double ");
        Double d=x.nextDouble();
        System.out.printf("%d\n",i);
        System.out.printf("%x\n",i);
        System.out.printf("%f\n",d);
        System.out.printf("%16f\n",d);
        System.out.printf("%16f.2\n",d);
        System.out.printf("%,16.2f\n",d);
        }
    
}
