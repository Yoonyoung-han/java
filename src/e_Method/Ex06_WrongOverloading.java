package e_Method;

public class Ex06_WrongOverloading {

	public static void main(String[] args) {
		String msg = "안녕";
		output1(msg);
		String result = output2(msg);
		System.out.println(result);// output2에서 "맛점"+msg를 result로 받은 상황

	}
	static void output1(String msg) {// overloading이 되지 않는 상황이다. output1 output2 이런식으로 이름을 달리 지정해줘야한다.
		System.out.println(msg);
	}
	static String output2(String msg) {
		String result = "맛점" +msg;
		return result;
		}
}
