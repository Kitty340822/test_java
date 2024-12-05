package test;

public class Array_3D {
    public static void main(String[] args) {
        int[][][]table={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}};
        int sum = 0;
        for(int i=0;i<table.length;i++){
            for(int j=0;j<table[i].length;j++){
                for(int k=0;k<table[i][j].length;k++){
                    sum =sum+table[i][j][k]; 
                }
            }
        }
        System.out.println(sum);
    }
    
}
