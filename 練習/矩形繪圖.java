import java.util.Scanner;
public class 矩形繪圖 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);
        System.out.print("寬=");
        int leight = scan.nextInt();
        
        System.out.print("高=");
        int weight = scan.nextInt();
        
        for(int i=0;i<weight;i++)
        {
            for(int j=0;j<leight;j++)
            {
                System.out.print("@");
            }
            System.out.println("");
        }
       
       
  } 
}
