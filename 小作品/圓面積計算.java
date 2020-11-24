


public class 圓面積計算 {

    //主程式
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
         double PI=3.14159;
         System.out.print("請輸入半徑:");
         int round=sc.nextInt();
         System.out.println("圓面積為:" + ((float)round*(float)round*PI));
         System.out.println("圓周為:" + ((float)round*2*PI));
    
     }
}
