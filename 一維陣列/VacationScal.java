
public class VacationScal {
   int yearOfService;
   int vacationDays[]={10,15,15,15,20,20,25};
   public void displayVacationDays(){
       System.out.print("服務年資"+yearOfService+"年");
       if(yearOfService>6){
           System.out.println("特休"+vacationDays[6]+"天");
       }
       else{
           System.out.println("特休"+vacationDays[yearOfService]+"天");
       }
   }
}
