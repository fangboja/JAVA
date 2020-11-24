import java.util.Scanner;
public class 有幾個因數 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("請輸入數字=");
       int num = scan.nextInt();
       
       for(int i=1;i<=num;i++)
       {
           if(num%i!=0)
           {
               continue;
           }
            System.out.println(i+", ");
       }
    }
    
}
