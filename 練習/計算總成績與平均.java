import java.util.Scanner;


public class 計算總成績與平均 {

   
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int sum=0;
        System.out.print("請輸入學生人數=");
        int people =s1.nextInt();
        
        for(int i=1;i<=people;i++){
            System.out.print("請輸入第"+i+"位學生的成績=");
            int score =s1.nextInt();
            sum+=score;
        }
        System.out.println("總分為:"+sum+"分"+"平均:"+(sum/people)+"分");
    }

}
