class Ex5_2 {
	public static void main(String[] args) {
		int   sum = 0;      // ������ �����ϱ� ���� ����
		float average = 0f; // ����� �����ϱ� ���� ����

		int[] score = {100, 88, 100, 100, 90};

		sum += score[0];
		
		for (int i=0; i < score.length ; i++ ) {
			sum += score[i];
		}
		average = sum / (float)score.length ; // ������� float�� ��� ���ؼ� ����ȯ

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + average);
	}
}