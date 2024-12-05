package test;
import java.util.Arrays;
import java.util.Scanner;
public class Pluem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] number = new int[5];

		for (int i=0;i<5;i++){
		    System.out.println("Enter the number : ");
		    int num = in.nextInt();
		    number[i] = num;
        }
        
        for (int j=0;j<number.length;j++){
            
		    System.out.print(number[j]);

        }
        System.out.println(" ");
        Arrays.sort(number);
		    System.out.println(number[0]);
    }
}

