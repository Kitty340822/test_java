package test;
import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        System.out.println("plese input String: ");
        Scanner in = new Scanner(System.in);
        String  word = in.nextLine();
        System.out.println(word.length());
        System.out.println(word.charAt(2));
        System.out.println(word.indexOf("a"));
        System.out.println(word.substring(1,5));
    }
    
}
