public class OrderTest {

    public static void main(String[] args) {
       Order ordertest = new Order();
       ordertest.displayOrderInfo();
       Shirt s1 = new Shirt();
        s1.price=250;
        s1.shirtID=1;
        s1.description="Polo";
        s1.colorCode='B';
        double CurrentTotal = ordertest.addShirt(s1);
        System.out.println("加入第一件衣服:"+ CurrentTotal);
        ordertest.displayOrderInfo();
        
        Shirt s2 = new Shirt();
        s2.price=150;
        s2.shirtID=2;
        s2.description="T-shirt";
        s2.colorCode='G';
         CurrentTotal = ordertest.addShirt(s2);
        System.out.println("加入第二件衣服:"+ CurrentTotal);
        ordertest.displayOrderInfo();
        
        Shirt s3 = new Shirt();
        s3.price=500;
        s3.shirtID=3;
        s3.description="Jacket";
        s3.colorCode='R';
         CurrentTotal = ordertest.addShirt(s3);
        System.out.println("加入第三件衣服:"+ CurrentTotal);
        ordertest.displayOrderInfo();
    }
    
}
