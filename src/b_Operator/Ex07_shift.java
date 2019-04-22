package b_Operator;
/*
 *  shift : 모든 비트의 값을 이동하는 연산자
 *  
 *  >> : 오른쪽이동
 *  << : 왼쪽이동
 *  >>> : 오른쪽이동 (부호가 0)
 */
public class Ex07_shift {

	public static void main(String[] args) {
		
		
		int a  = -4;
		System.out.println( a>>2); 
		System.out.println( a<<1);
		System.out.println( a>>>1);

	}

}
