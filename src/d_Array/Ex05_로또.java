package d_Array;

public class Ex05_로또 {

	public static void main(String[] args) {
		
		// 로또 번호 생성(5줄 6개)
		int [][] lotto = new int[5][6];
		for(int i =0; i< lotto.length;i++) {
			//LOOP:
			for(int j=0; j<lotto[i].length; j++) {
				lotto[i][j]= (int)(Math.random()*45)+1;//  random :아무 숫자나 0.23234234 이런식으로 나오는 함수 
				for(int k =0; k<j; k++) {
					if(lotto[i][k] == lotto[i][j]) {
						j--; //j가 계속 더해지면 중복될 경우에 다른 수를 구하고 싶은데 덮어씌워지지 않고 다음 수를 구한다.
						//continue LOOP;
					}
				}
				//j++
			}
		}
		//정렬
		for(int k=0; k< lotto.length; k++) {
			for(int i = lotto[k].length-1;i>0;i--) {
				for(int j=0; j<i;j++) {
					if(lotto[k][j]>lotto[k][j+1]) {
						int temp = lotto[k][j];
						lotto[k][j] = lotto[k][j+1];
						lotto[k][j+1]=temp;
					}
				}
			}
		}
		
		//출력
		// - 숫자의 합 106~170 사이라면 별표 출력
		for(int i =0; i< lotto.length;i++) {
			int sum =0;
			for(int j=0; j< lotto[i].length;j++) {
				sum += lotto[i][j];
				System.out.print(lotto[i][j]+"\t");
			}
			if(sum>106 && sum<170) System.out.print("★");
			System.out.println();
		}
	}
}
