package ex01;

public class 로또2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] lotto = new int[45];
		
		for(int j=0; j<5; j++) {
			for(int i=0; i<lotto.length; i++)
				lotto[i] = i+1;
			
			for(int i=0; i<1; i++) {
				int num = (int)(Math.random()*44)+1; //1~44
				int tmp = lotto[0];
				lotto[0] = lotto[num];
				lotto[num]=tmp;
			}
			
			for(int i=0; i<6; i++)
				System.out.print(lotto[i]+" ");
			
			System.out.println();
			System.out.println("-----------------------------");
			
		}
		
		
		
		}
	}

