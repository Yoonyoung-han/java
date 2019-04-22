package d_Array;
import java.util.*;
public class Ex01_성적 {

	public static void main(String[] args) {
		
//		int kor[];//배열을 쓰겠다는 신호 []는 []kor kor[] 이런식으로 쓰면 되는데 앞에 쓰는 걸 권장한다.
//		kor = new int[5];//5개로 메모리를 쪼개겠다는 의미 0,1,2,3,4 이런 식으로 데이터 자리가 생성됨 
		int kor[]=new int[5]; //메모리를 잡아놓고 조금 쓰는건 문제가 안된다! heap은 초기화가 기본 세팅이라 데이터를 지우면 0으로 된다.
//		kor[0]=80;
//		kor[1]=99;
//		kor[2]=77;
//		kor[3]=55;
//		kor[4]=81;
		//kor[5]=100; //메모리 5개 잡아놓고 6번째 데이터 입력하면 에러남
		
		Scanner input = new Scanner(System.in);
		System.out.println("점수입력 ex)12 13 14");
		String score= input.nextLine();
		StringTokenizer st = new StringTokenizer(score);
		for(int i = 0 ;st.hasMoreTokens(); i++) {
			kor[i] = Integer.parseInt(st.nextToken()); // integer.parseInt : String을 int로 캐스팅해주는 작업
		}
		
//		for(int i=0; i<5; i++) {
//			kor[i] =input.nextInt();
//		} //점수만 5번 입력하게 하는 방식으로 점수 받기
		
		//총점 구하기
		int total =0;
		for(int i=0; i<=4;i++) {
			total +=kor[i];
		}
		System.out.println("총점 : "+ total);
	}

}
