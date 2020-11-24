import java.util.Scanner;
public class 輸出是否為閏年與有這個月有幾天 {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.print("請輸入月份=");
        int month=scan.nextInt();
        int days=0;
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
               days=30;
                break;
            case 2:
                System.out.println("請輸入年分=");
                int year=scan.nextInt();
                    if(year%4==0&&year%100!=0 || year%400==0)
                    {
                    days=29;
                    }
                    else
                    {
                   days=28;
                    }
                    break;
            default:
                System.out.println("月份錯誤");
             return;   
        }
        
        System.out.println(month+"月有"+days+"天");
    }
}

