package e_Method;
/*
 * 프로그램 흐름 주의해서 보기
 */


public class Ex02_인자와반환 {

	public static void main(String[] args) {
		//데이타 입력받기
		int a = 10, b= 20;
		add(a,b);// 함수호출할 때 a,b(인자) 갖고감

	}
	
	static void add(int a, int b) { // a,b의 메모리 확보해줌(파라미터) , int 면 int / double이면 double 로 잡는다
		//입력받은 데이타의 합을 구해서 출력
		int sum = a + b; // double로 메모리 잡았는데 int로 바꿔야하는 상황이면 여기에 캐스팅을 해준다.
		System.out.println("합 : "+ sum);
	}// 다시 add(); 제어권 넘어감


}
