package e_Method;

import java.util.*;
public class Ex04_Method문제 {

	public static void main(String[] args) {
//		(문제 1) 영문자를 입력하여 이 문자가 소문자이면 ture을 반환 그렇지 않으면 false을 반환하는 메소드를 작성하시오
//		  함수명 : checkLower
//		  인자 : char
//		  리턴(반환) : boolean
		Scanner input = new Scanner(System.in);
		System.out.println("영문자를 입력하세요");
		char abc = input.next().charAt(0);
		boolean result = checkLower(abc);
		System.out.println(result);
	}
		static boolean checkLower(char abc) {
//			if(abc>= 'a' && abc<='z') {
//				return true;
//			}else {
//				return false;
//			} 
			if( Character.isLowerCase(abc)) {
				return true;
			}else { // 이런 경우 else도 안쓰고 return false;만 써도 된다.
				return false;
			}
			

//		(문제 2) 영문자를 입력하여 이 문자가 소문자이면 대문자로 변환하여 반환하고 대문자라면 그대로 반환하는 메소드를 작성하시오. 
//		  함수명 : checkUpper
//		  인자 : char
//		  리턴(반환) : char



	}

}
