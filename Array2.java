package test;
import java.util.Scanner;
import java.util.Arrays;
public class Array2 {
    public static void main(String[] args) {
        System.out.println("Enter Charactor: ");
        Scanner in =new Scanner(System.in);
        String[] coll = new String[5];
        System.out.println("get:"+coll.length);
        for(int i=0;i<coll.length;i++){
            coll[i] = in.nextLine();
            
        }
        for(String j:coll){
            System.out.println("value: "+j);
        }
    }
    
}
