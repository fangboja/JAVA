


public class 暫存空間 {

    //主程式
    public static void main(String[] args) {
        int x=3*4;
        System.out.println(x);//12
        
        long a=55555*66666;
        System.out.println(a);//-591337666
        
        long b=(long)(55555*66666);
        System.out.println(b);//-591337666
        
        long c=((long)(55555))*66666;
        System.out.println(c);//3703629630
    }

}
