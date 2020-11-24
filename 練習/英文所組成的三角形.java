import java.util.Scanner;
public class 英文所組成的三角形 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("輸入高=");
        int height=scan.nextInt();
        
        for(int i=0;i<height;i++)
        {
            for(int j=0;j<height-1-i;j++)
            {
                System.out.println("");
            }
            char c=(char)('A'+i);
            for(int k=0;k<2*i+1;k++)
            {
                System.out.print(c);
            }
            System.out.println("");
        }
    }
    
}
