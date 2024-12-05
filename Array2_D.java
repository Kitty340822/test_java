package test;
import java.util.Arrays;


public class Array2_D {
    public static void main(String[] args) {
        int[][] table = {{1,2,3},{4,5,8},{7,6,9}};
        /*int target=6;
        boolean found = false;
        int row =-1;
        int col =-1;
        */
        int sum=0;
        for (int i=0;i<table.length;i++){
            for (int j=0;j<table[i].length;j++){
                /*if (table[i][j]==target){
                    found = true;
                    row=i; 
                    col=j;
                    System.out.println("Row:"+row+"Collum:"+col);
                    continue;
                }*/
                sum+=table[i][j];
            }
        }
        System.out.println(sum);
    }
    
}
