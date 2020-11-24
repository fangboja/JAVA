public class CustomerTest {

    public static void main(String[] args) {
       Customer s1 = new Customer();
       s1.setCustomerInfo(1, "Marry", "234 Maple St", "505-123-4545");
       s1.displayCustomerInfo();
       
       Customer s2 = new Customer();
       s2.setCustomerInfo(2, "Sally", "567 Oak St", "585-123-2323",
                          "sally@gmail.com");
       s2.displayCustomerInfo();

    }
    
}
