package c_control;
/*
 * 문제 1)1~ N까지의 숫자를 다음처럼 출력하라
	1 2 3 4 5 
	6 7 8 9 10
	11 12 13 14 15
 */
import java.util.Scanner;

public class Ex06_for연습 {

	public static void main(String[] args) {
		
//		for(int i=1; i<=15; i++) {
//			System.out.print( i +"  ");
//			//5의 배수 라면 개행
//			if(i%5 ==0) {
//				System.out.println();
//			}
//		}
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("문장입력-->");
//		String msg = input.nextLine();
//		int length = msg.length();
//		//for문 구조 잡기
//		for(int i=length-1; i>=0; i-- ) {
//		System.out.print(msg.charAt(i));
//		}
//		// charAt() 이용해서 화면 출력
		
		
		/*
		 * 문제2)  문자열처리하기 
문자 N(a~z, A~Z)를 입력받아 N이 소문자면 a부터 N까지 인쇄하고 
N이 대문자이면 문자 N부터  Z까지 출력하라 
그 밖의 문자가 입력되면 Error 를 출력하라 
입력  출력
f       abcdef
X       XYZ
6       Error 

		 */
		Scanner input = new Scanner(System.in);
		System.out.println("문자 입력-->");
		String a = input.nextLine();
		char alpha = a.charAt();
		if( alpha <= "z" ) {
			for(char c ='a';c<alpha;c++) {
				System.out.println( );
			}
		}
		
	}

}
