package e_Method;

public class Ex08_Main {
	/*
	 * Test.java -> Test.class
	 * 		(1) 컴파일 : javac Test. java
	 * 		(2) 실행 : java  Test		192.168.0.1 scott tiger 
	 */

	public static void main(String[] args) { 
		/*
		 * 메소드명: main
		 * 인자: String[] args
		 * 리턴형: void //자바의 메인은 void로 고정되어있다.
		 */
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

	}

}
