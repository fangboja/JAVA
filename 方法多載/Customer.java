public class Customer {
    public int customerID=0;
    public String name ="-name required-";
    public String adress="-address required-";
    public String phoneNumber="-phone required-";
    public String emailAdress="-email optional-";
    
    public void setCustomerInfo(int id, String nm, String addr, String phNum){
        customerID=id;
        name =nm;
        adress=addr;
        phoneNumber=phNum;
   }
    public void setCustomerInfo(int id, String nm, String addr, String phNum,String email){
        customerID=id;
        name =nm;
        adress=addr;
        phoneNumber=phNum;
        emailAdress=email;
   }
     public void displayCustomerInfo(){
         System.out.println("Customer ID:"+ customerID);
         System.out.println("Customer name:"+ name);
         System.out.println("Customer adress:"+adress);
         System.out.println("Customer phone:"+phoneNumber);
         System.out.println("Customer email:"+emailAdress);
     }
} // end of class
