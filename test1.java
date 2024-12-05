package test;
import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name1 = name.nextLine();
        System.out.println("Enter lastname: ");
        String name2 = name.nextLine();
        String Fullname = name1.concat(" "+name2);
        System.out.println("Fullname : "+Fullname);

    }
    
}
