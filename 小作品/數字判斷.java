


public class 數字判斷 {

    //主程式
    public static void main(String[] args) {
        int a=0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入數字:");
        int b=sc.nextInt();
        for(a=2;a<=b-1;a++){
           if(b/a==0){
              System.out.println(b+"不是質數");
              
           } 
        }
        if(a==b){
            System.out.print(b+"是質數");
        }
        if(b>0){
            if(b%2==0){
                System.out.print(",正偶數");
            }
            else{
                System.out.println(",正積數");
            }
        }
        else{
            if(b%2==0){
            System.out.println("負偶數");
        }
            else{
                System.out.println("負積數");
            }
        }
    }

}
