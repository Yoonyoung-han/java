package c_control;

import java.util.*;

/* [3,6,9 게임]
 * 
 * 1~50까지 숫자 중에서 3,6,9 포함되면 그 갯수만큼 '짝' 출력
 * 하나도 포함되지 않으면 그 숫자 출력
 * 
 */
public class Ex09_while연습 {

	public static void main(String[] args) {
		//(정답)
		//		for(int i =1; i<= 50;i++) {
		//			int mok = i; //1.30 넣으면
		//			boolean su369 = false; // true false 만 판단하는 거
		//			//i=123
		//			while(mok!=0) { // 2. 30은 0이 아니라서
		//				int na = mok%10;
		//				if(na==3 | na==6| na==9) {
		//					System.out.print("짝");
		//					su369 = true; // 
		//				}
		//				mok /=10; // mok=mok/10
		//			}
		//					if(su369) { //
		//						System.out.println();
		//					}else {
		//						System.out.println(i);
		//	}
		//
		// }
		/*
		 *  * 문제  : 8의 숫자 세기(구글입사문제)
		 * 
 1부터 10,000까지 8이라는 숫자가 총 몇번 나오는가?
 8이 포함되어 있는 숫자의 갯수를 카운팅 하는 것이 아니라 8이라는 숫자를 모두 카운팅 해야 한다.
 (※ 예를들어 8808은 3, 8888은 4로 카운팅 해야 합니다)
 결과 : 4000

		 */
		//		Scanner input = new Scanner(System.in);
		//		System.out.println("수를 입력하세요");
		//		int n = input.nextInt();
		//		int i=1;
		//		int nb =0;
		//		for(int i =1; i<=10000 ;i++) {
		//			int mok = i;
		//			while(mok!=0) {
		//				int na = mok%10;
		//				if(na == 8) {
		//					nb=nb+1;
		//					}
		//				mok/=10;
		//		 }
		//		}
		//		System.out.println(nb);
	}
}
