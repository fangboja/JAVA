


public class example4 {

    //主程式
    public static void main(String[] args) {
        int max = 0;
        int min = 100;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入國文成績:");
        int score1 = sc.nextInt();
        if(score1>0){
            
        }else{
            System.out.println("輸入錯誤");
        }
        System.out.print("請輸入英文成績:");
        int score2=sc.nextInt();
        if(score2>0){
            
        }else{
            System.out.println("輸入錯誤");
        }
              
        
        if (score1 >= max) {
            max = score1;
        } else if (score1 <= min) {
            min = score1;
        }
        if (score2 >= max) {
            max=score2;
        }else if(score2<=min){
            min=score2;
        }
        
        System.out.println("總成績為" +(score1 + score2)+ "分" + ",總平均為" +
                           ((float)(score1)+(float)(score2))/2+"分");
        System.out.println("最高分數為" + max +"分" );
        System.out.println("最低分數為" + min +"分" );
    }
}
