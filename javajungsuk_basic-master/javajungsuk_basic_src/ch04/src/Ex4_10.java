class Ex4_10 {
	public static void main(String[] args) { 
		int sum = 0;	
		
		sum += 1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		
		
		for(int i=1; i <= 5; i++) {
			sum += i ;	// sum = sum+i;
			System.out.printf("1부터 %2d까지의 합: %2d%n", i, sum);
		}
	}
}