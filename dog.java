package test;
import java.util.Scanner;
public class dog {
    public static void main(String[] args) {
        System.out.println("Enter word: ");
        Scanner sentence = new Scanner(System.in);
        String word = sentence.nextLine();
        word =word.toLowerCase();
        String changeword = word.replace("the","***");
        System.out.print("sentence is:"+changeword);
    }
    
}
