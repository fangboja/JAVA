import java.util.Scanner;


public class 一加到任意數字 {

   
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int sum=0;
        System.out.print("請輸入數字:");
       int num= scan.nextInt();
       for(int i=1;i<=num;i++){
           if(i != num){
               System.out.print(i+"+");
               sum+=i;
           }
           else{
               System.out.println(i+"=");
               sum+=i;
           }
       }
        System.out.println(sum); 
    }

}
