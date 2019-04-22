package c_control;

/*
 *  while(false){
 *  	명령문
 *  }
 *  
 *  do{
 *  	명령문
 *  }while(false);
 *  
 *  조건이 false면 while은 실행하지 X, do-while은 한번은 실행 ㅇ
 */
import java.util.*;
public class Ex10_dowhile {

	public static void main(String[] args) {
//		char result = '\0';// 원래는 '\u0000' 이지만 '\0'로 쓴다 
//		do {
//			Scanner input = new Scanner(System.in);
//			System.out.println("구구단 수를 입력하세요");
//			int gugudan = input.nextInt();
//			int i = 1;
//			while(i<=9) {
//				System.out.printf("%d * %d= %d \n", gugudan, i, gugudan*i);
//				i++;
//				
//			}
//		System.out.println("다시할래?(y|Y)");
//		result = input.next().charAt(0);// nextLine()을 쓰면 구구단 수 받고나서 엔터도 인식해서 다시할래 안물어봄
//	}while(result== 'Y' | result =='y'); //조건을 비교하는 위치를 바꿔주는게 do-while
		
		      int  x = 1;
		      while(  x++ < 3 ) 
		           System.out.println(x);

}
}
