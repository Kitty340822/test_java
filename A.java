package test;

public class A {
    public static void main(String[] args) {
    
        StringBuffer sb = new StringBuffer("A");

        for(int i=0;i<10;i++){
            sb.append("A");
            System.out.println(sb);
            }
        /*insert
        sb.insert(5,"B");
        System.out.println(sb);
        */
        /*delete
         * sb.delete(2,4) will delete location 2-3
         */
    }
}