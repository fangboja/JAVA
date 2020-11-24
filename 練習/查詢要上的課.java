import java.util.Scanner;


public class 查詢要上的課 {

   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("請輸入星期=");
        String days = scan.next();
        switch(days)
        {
            case "Monday":
                System.out.println("鋼琴課");
                break;
            case "Tuesday":
                System.out.println("圍棋課");
                  break;
            case "Wednesday":
                System.out.println("英文課");
                  break;
            case "Thursday":
                System.out.println("桌球課");
                  break;
            case "Friday":
                System.out.println("跆拳道");
                  break;
            case "Saturday":
                System.out.println("電腦課");
                  break;
            case "Sunday":
                System.out.println("作文課");
                  break;
        }
    }

}
