
public class �����p�� {

	public static void main(String[] args) {
		int value=20;//�]�w�h�ֶ���
		System.out.println(factorial(value));

	}
	public static long factorial(int v) {
		if(v<=0) {
			return 1;
		}
		return v * factorial(v - 1);//�����p��
	}

}
