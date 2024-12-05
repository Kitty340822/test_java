package test;

public class if_else {
    public static void main(String[] args) {
        String sentense = "https://www.abc.com/index.html&quot" ;
        for(int i=0;i<sentense.length();i++){
            if(sentense.charAt(i)=='/'){
                System.out.println(i);
            }

        }
        
    }
    
}
