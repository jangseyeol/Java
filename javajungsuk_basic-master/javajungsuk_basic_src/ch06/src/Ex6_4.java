class Ex6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long result1 = mm.add(5L, 3L); //add 메서드 호출
		long result2 = mm.subtract(5L, 3L); 	
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);

		mm.printGugudan(12);
		
		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
	}
 }

 class MyMath {
	 void printGugudan(int dan) {
		 if(!(2<=dan && dan <=9)) {
			 return;
		 }else {
		 for(int i=1; i<=9; i++) {
			 System.out.printf("%d*%d = %d%n", dan, i, dan*i);
		 }
		 return;
		 }
	 }
	 
	 
	 long max(long a, long b) {
		 if(a>b) {
			 return a;
		 }

		 else {
			 return b;
		 }
	 }
	 
	 
	 
	 long add(long a, long b) {
		long result = a + b;
		return result; 
	//	return a + b;	// 이렇게 표현할 수 있음.
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
 }
