package b_Operator;
/*
 * 산술연산자 : *     /  %, +  -
 */

import java. util.*;

public class Ex03_Arithmetic {

	public static void main(String[] args) {

		// 1. 숫자 하나를 입력받기 ( Scanner - import java.util.*) 이때 별표의 의미는 all의 의미
		// 2. 홀수인지 짝수인지 연산하여 출력( % : 나머지 연산자)
		
		Scanner input = new Scanner(System.in);
		System.out.println("숫자 하나 입력 ->");
		int su = input.nextInt();
		
		if(su % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		

		
	}

}
