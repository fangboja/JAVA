
public class Customertest {

    
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        Customer cust2 = new Customer();
        cust1.id=1;
        cust1.name="Mary Smith";
        cust1.email="mary.smith@gmail.com";
        cust1.displayCustomerInfo();
        
        cust2.id=2;
        cust2.name="Frank Jones";
        cust2.email="frank.jones@gmail.com";
        cust2.displayCustomerInfo();
        
        cust2=cust1;
        cust1.displayCustomerInfo();
        cust2.displayCustomerInfo();
                
    }
    
}
