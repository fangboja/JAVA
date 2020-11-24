
public class foreach2 {

    
    public static void main(String[] args) {
        String exam[][]={
                         {"SCJP","SCWD","SCMAD"},
                         {"MCSD","MCAD","MCDBA"}
                         };
        for(String[] ex:exam){
            for(String e:ex){
                System.out.print(e+",");    
            }
            System.out.println("");
        }
    
    }  
}
