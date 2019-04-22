package e_Method;

public class Ex02_인자와반환2 {

	public static void main(String[] args) {
		 int sum =add(); // 메모리 할당해주기 , 변수면 맞추지 않아도 괜찮지만, 헷갈리니까 맞추도록 하자
		 System.out.println("합 : "+ sum);

	}
	static int add() { // void 라고 쓰면 반환할 게 없다는 거, int를 반환할거면 void 자리에 int 쓰기
		int a =10, b=20;
		int sum = a + b;
		return sum;
	}

}
// return : 흐름반환
// return 값: 호출한 곳으로 딱 하나의 값을 반환