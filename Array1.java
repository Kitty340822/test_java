package test;
import java.util.Arrays;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        System.out.println("enter score: ");
        Scanner in = new Scanner(System.in);
        int score = in.nextInt();
        int[]scores = new int[score];
        for (int i=0;i<score;i++){
            System.out.println("enter number"+i);
            int value = in.nextInt();
            scores[i]=value;
        }
        for (int j=0;j<scores.length;j++){
            Arrays.sort(scores);
            System.out.print(scores[j]);
            
        
        }
        System.out.println("");
        int id=Arrays.binarySearch(scores,7);
            System.out.print(id);
        
    
    }
}
