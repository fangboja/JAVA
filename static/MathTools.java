public class MathTools {
    public static double getHypontenuse(double l1, double l2){
        return Math.sqrt(Math.pow(l1,2)+Math.pow(l2,2));
    }
    
    public static boolean isPrimeNumber(int num){
        boolean isPrime = true;
        for(int i=2; i<num; i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    
    public static double convertTemp(double celsius){
        return celsius*9/5+32;
    }
    
    public static double calcBmi(int height, int weight){
        return weight/Math.pow((double)height/100,2);
    }
    
}
