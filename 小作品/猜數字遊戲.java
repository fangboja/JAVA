import java.util.Scanner;


public class 猜數字遊戲 {

    //主程式
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess=0;
        int sum=0;
       
        guess=(int)(Math.random()*100)+1;
        
       while(true){
            System.out.print("請輸入數字(範圍1~100):");
            int a=scan.nextInt();    
            sum+=1;
          if(a>=1 && a<=100){
              if(guess==a){
                  System.out.println("猜對了第"+sum+"次猜對");
                  break;
              }
              else if(guess>a){
                  System.out.println("比猜的數字大"+(guess-a));
                  
              }
              else if(guess<a){
                  System.out.println("比猜的數字小"+(a-guess));
                  
              }
          }
          else{
              System.out.println("請輸入範圍內的數字");
              System.out.println("再輸入一次");
          }
        }
    }

}
