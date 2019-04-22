package e_Method;

public class Ex02_인자와반환3 {

	public static void main(String[] args) {
		int [] arr =add();
		// 합 계산하기
		int sum = arr[0] + arr[1];
		System.out.println("합 : "+ sum);

	}
	static int[] add() {// int 배열 반환할때는 int[]로 써준다
		int a =10, b=20;
		int [] arr = { a,b};
		return arr; // 리턴 입장에서는 데이터 값 한 개임.
	}
}
