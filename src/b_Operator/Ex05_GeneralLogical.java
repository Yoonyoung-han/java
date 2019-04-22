package b_Operator;
/*
 * 논리연산자(Not 이랑 똑같다)
 * 			- 일반논리(true/false) : && ||
 * 			- 이지논리(bit에 맞는 1/0) : & ^(exclusive or) |
 *  */
import java.util.*;
public class Ex05_GeneralLogical {

	
	public static void main(String[] args) {
		
		//문자 하나를 입력받아
		//(1) 대문자인지 출력
		//(2) 대문자인지 소문자인지 그외인지 출력
		
		Scanner input = new Scanner(System.in);
		System.out.println("문자하나 입력받아-->");
		char ch = input.next().charAt(0);
		System.out.println("입력값:"+ch);
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자");
		}else {
			System.out.println("대문자 아님");
		}
		if(ch >= 'a' && ch <= 'z') {
			System.out.println("소문자");
		}
		/*int 성적 = 75;
		char  태도 = 'A';
		
		// 성적향상반 조건 - 80점 이상이고 태도는 'A' 이여야 함
		if(성적>=80 && 태도 == 'A') {
			System.out.println("성적향상반");
		}
		// 우등생 조건 - 성적은 80점 이상이거나 태도는 'A' 이면 가능
		
		if(성적>= 80 || 태도 == 'A') {
			System.out.println("우등생");
		}*/
	}

}
