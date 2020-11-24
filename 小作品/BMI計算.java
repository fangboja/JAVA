import java.util.Scanner;
public class BMI計算 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hight = 0;
        System.out.print("請輸入身高=");
        hight = scan.nextDouble();
        hight= hight / 100.0;
        double weight = 0;
        System.out.print("請輸入體重=");
        weight= scan.nextDouble();
        double c = weight/ Math.pow(hight, 2);
        System.out.println("BMI=" + c);
        if(c<18.5)
        {
            System.out.println("體重過輕");
        }
        if(c>=18.5&c<24)
        {
            System.out.println("體重正常");
        }
        if(c>=24&c<27)
        {
            System.out.println("體重過重");
        }
        if(c>=27&c<30)
        {
            System.out.println("輕度肥胖");
        }
        if(c>=30&c<35)
        {
            System.out.println("中度肥胖");
        }
        if(c>=35)
        {
            System.out.println("重度肥胖");
        }
    }
    
}
