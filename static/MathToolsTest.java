public class MathToolsTest {

    public static void main(String[] args) {
        System.out.println("底為3公分,高為4公分的直角三角形, 斜邊長為"+MathTools.getHypontenuse(3, 4)+"公分");
        System.out.println("底為5公分,高為12公分的直角三角形, 斜邊長為"+MathTools.getHypontenuse(5, 12)+"公分");
        
        System.out.println("89"+(MathTools.isPrimeNumber(89)?"是質數":"不是質數"));
        System.out.println("87"+(MathTools.isPrimeNumber(87)?"是質數":"不是質數"));
        
        System.out.println("攝氏50度等於華氏"+MathTools.convertTemp(50)+"度");
        System.out.println("攝氏100度等於華氏"+MathTools.convertTemp(100)+"度");
        
        System.out.println("身高178公分,體重80公斤,BMI值為"+MathTools.calcBmi(178, 80));
        
    }
    
}
