
public class 階乘計算 {

	public static void main(String[] args) {
		int value=20;//設定多少階乘
		System.out.println(factorial(value));

	}
	public static long factorial(int v) {
		if(v<=0) {
			return 1;
		}
		return v * factorial(v - 1);//階乘計算
	}

}
