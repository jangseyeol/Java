package ex01;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int형 배열
		
		int sum;
		
		int[] arrNum = new int[5];
		
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 30;
		arrNum[3] = 40;
		arrNum[4] = 50;
		
		
		for(int i=0; i<5; i++)
			System.out.print(arrNum[i] + " ");
		
		
		System.out.println("\n--------------------------------");
		
		
		int[] arrNum2 = {11,22,33,44,55};
		
		
		for(int i=0; i<5; i++)
			System.out.print(arrNum2[i] + " ");
		
		
		System.out.println("\n--------------------------------");
		
		
		int[] arrNum3 = {11,22,33,44,55,66,77};
		
		
		for(int i=0; i<7; i++)
			System.out.print(arrNum3[i] + " ");
		
		
		System.out.println("\n--------------------------------");
		
		
		int[] arrNum5 = new int[]{11,22,33,44,55,66,77};
		
		
		for(int i=0; i<7; i++)
			System.out.print(arrNum5[i] + " ");
		
		System.out.println("\n--------------------------------");
		
		
		int[] arrNum4 = {11,22,33,44,55,66,77,88,99};
		
		
		for(int i=0; i<arrNum4.length; i++)
			System.out.print(arrNum4[i] + " ");
		
		System.out.println("\n--------------------------------");
		
	}

}
