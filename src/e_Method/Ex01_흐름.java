package e_Method;

public class Ex01_흐름 {

	public static void main(String[] args) {
		System.out.println("main 시작");
		method();// method 로 제어권을 넘긴다
		System.out.println("main 끝");

	} //<-프로그램이 끝나는 시점
	static void method() { // static method 에서는 static만 접근가능
		System.out.println("method 실행");
	}//method라인으로 제어권 반환
}
