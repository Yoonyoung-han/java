package b_Operator;
/*
 * 삼항연산자
 * 			(조건)? A : B
 * 			조건이  true 이면 A 실행하고 false이면 B 실행한다.
 */

import java.util.Scanner;
public class Ex09_Samhang {

	public static void main(String[] args) {
		
//		int score = 71;
//		String result = (score>=80)? "합격" : "불합격" ;
//		System.out.println(result);
		
		// [문제] 두 수를 입력받아 큰 수를 출력 (삼항연산자 이용)
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요");
		int first = input.nextInt();
		System.out.println("두번째 수를 입력하세요");
		int second = input.nextInt();
		
		int max = (first > second)?  first : second;
		System.out.println("큰수:" + max);
		
	}

}
