


public class example3 {

    //主程式
    public static void main(String[] args) {
       
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入國文成績:");
        int score1 = sc.nextInt();
        System.out.print("請輸入英文成績:");
        int score2 = sc.nextInt();
        int i = (score1 + score2) / 2;
        System.out.println("總成績為多少分:" + (score1 + score2) + "總平均為多少分:" + i);
        System.out.println("最高分數為"+Math.max(score1, score2));
        System.out.println("最低分數為"+Math.min(score1, score2));
    }

}
