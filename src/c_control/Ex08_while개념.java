package c_control;

import java.util.*;

public class Ex08_while개념 {

	public static void main(String[] args) {
		//1~10까지 합 구하기
//		int sum =0;
//		int i=1;
//		//for( ; i<=10;  ) {
//		while(i<=10) {// for문에서 조건문만 가지고 있는 형태 : while
//		//언제까지 반복할 지 수치가 확실할 때는 for, 정확하지 않은 값(ex 입력값)까지 구할때는 while
//			sum += i;
//			i++;
//		}
//		System.out.println("결과: "+sum);
		
		//[연습] 구구단 수를 입력받아서 구구단 출력( while 문으로)
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("구구단 수를 입력하세요");
//		int gugudan = input.nextInt();
//		int i = 1;
//		while(i<=9) {
//			System.out.printf("%d * %d= %d \n", gugudan, i, gugudan*i);
//			i++;
//			
//		}
		
//		String str = "독도는 대한민국의 아름다운 섬입니다";
//		StringTokenizer st = new StringTokenizer(str);
//		while(st.hasMoreTokens()) {//내 뒤에 토큰이 있나없나 판단할 수 있음, 토큰 없을 때까지 반복가능
//		System.out.println(st.nextToken());// 다음 토큰을 출력
//		
//	}
		String str = "100*3+/2-5";
		StringTokenizer st = new StringTokenizer(str, "+-*/%");
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken());
		
	}

}
}
