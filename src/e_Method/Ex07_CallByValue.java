package e_Method;

public class Ex07_CallByValue {

	public static void main(String[] args) {
		int a = 10, b = 20;
		add(a,b);
		System.out.println("2. A= "+a+", B= "+ b); // A= 10 , B= 20

	}
	static void add(int a, int b) {
		a+=b; // a= a+b
		System.out.println("1. A= "+a+", B= "+ b); // A=30 B= 20
	}//여기서 계산된거는 반환되는 동시에 메모리가 사라진다.
}
