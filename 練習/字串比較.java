
public class 字串比較 {

    
    public static void main(String[] args) {
        String s1 = "Jim";
        String s2 = "Jim";
        String s3 = new String("Jim");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
    
}
