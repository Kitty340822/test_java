package test;

public class stringbuf {
    public static void main(String[] args) {
        StringBuffer word = new StringBuffer("A");
        for(int i=0;i<10;i++){
            word.append("A");
            System.out.println(word);
        }
        word.insert(2,"B");
        System.out.println(word);

        word.delete(5, 10);
        System.out.println(word);
            
    }
    
}
