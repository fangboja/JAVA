



public class 購物打折 {

    
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入金額:");
        int num = sc.nextInt();
        int pay=0;
        if(num>=5000)
        {
            pay=(int)(num*0.7);
        }
        else if(num>=3000)
        {
           pay=(int)(num*0.8);
        }
        else if(num>=2000)
        {
            pay=(int)(num*0.85);
        }
        else if(num>0)
        {
            pay=(int)(num*0.9);
        }
        if(pay>0)
        {
            System.out.println("購物打折" + pay);
        }
        else
        {
            System.out.println("請重新輸入金額");
        }
    }
    
}
