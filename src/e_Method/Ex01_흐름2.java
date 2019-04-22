package e_Method;


// static 빼고 수행하는 방법
public class Ex01_흐름2 {

	public static void main(String[] args) {
		System.out.println("main 시작");
		Ex01_흐름2 ex = new  Ex01_흐름2(); // class 안에 있는 메소드를 소환하겠다는 뜻(객체 생성식으로 하는 방법이다)
		ex.method();
		System.out.println("main 끝");

	} //<-프로그램이 끝나는 시점
	void method() { 
		System.out.println("method 실행");
	}
}
