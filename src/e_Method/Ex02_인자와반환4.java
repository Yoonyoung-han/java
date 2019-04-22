package e_Method;
/*
 * 여러곳에서 참조할거면 멤버변수 사용
 * 단점은 메모리 차지가 크다.
 * 일반적으로는 지역변수를 써서 메모리를 빨리빨리 반환해주는 게 좋다.
 */

public class Ex02_인자와반환4 {

	static int a , b; //멤버변수 : 메인과 add 둘다에서 공통된 변수를 공유하고 싶을때, static은 static만 접근가능하므로 앞에 붙여준다
	static int sum;
	public static void main(String[] args) {
		a = 10;
		b= 20;
		add();
		System.out.println("합 : "+ sum);
	}
	static void add() {
		sum = a + b;		
	}

}// 멤버변수를 설정할 경우 끝까지 메모리가 살아있다.
