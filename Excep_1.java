package test;
import java.util.Scanner;
public class Excep_1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("enter Integer:");
            //int number = in.nextInt(); 
            String name = in.next();
        try{
            int num = Integer.parseInt(name);
            continue;
        }
        catch(NumberFormatException e){
            System.out.println("info data is wrong");
        }
        }
    }  
}


