package ex02;

public class For01 {

	public static void main(String[] args) {

		int sum = 0;
		for(int i=1; i<=5; i++) {
			sum = sum + i;
		}
		System.out.println("누적합 : " + sum);
	}

}
