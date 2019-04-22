import java.util.Scanner;
/*
 * 세개 숫자 중엣두번째로 큰 수 구하기
 */

public class Work {

	
	public static void main(String[] args) {
	
//		Scanner input = new Scanner(System.in);
//		System.out.println("첫번째 수를 입력하세요");
//		int a = input.nextInt();
//		System.out.println("두번째 수를 입력하세요");
//		int b = input.nextInt();
//		System.out.println("세번째 수를 입력하세요");
//		int c = input.nextInt();
//	
//	int second =((a>=b && b>=c && a>=c) ||(c>=b&& b>=a && c>=a))? b : 
//				((b>=a && a>=c && b>=c)||(c>=a && a>=b && c>=b))? a : c;
//	
//	System.out.println("두번째로 큰 수:"+second);
//	
	
		/*
		 * 주사위 합
		 */
	//입력값
		Scanner input =new Scanner(System.in);
System.out.println("수를 입력하세요");
int enter = input.nextInt();

		//1. 첫번째 주사위의 수
		for(int i= 1; i<=6;i++) {
			//2. 두번째 주사위의 수
			for(int j=1; j<=6; j++) {
				if(enter == i+j) {
					System.out.println(i+" "+j);
				}
			}
		}
		
	}
}
