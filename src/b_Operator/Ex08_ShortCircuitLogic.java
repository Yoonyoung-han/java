package b_Operator;
/*
 *  숏서킷로직 : 일반논리에 적용
 */
public class Ex08_ShortCircuitLogic {

	public static void main(String[] args) {
		
		
		int a =3;
		if( a >3 && ++a>3) {
			System.out.println("조건만족"); //
		}
		System.out.println("A="+a); // if의 전자 조건이 false로 결과가 나와서 뒤의 연산은 아예 수행하지 않는다. 따라서 답이 3

		if( a>1 || ++a>3) {
			System.out.println("조건만족2");//
		}
		System.out.println("A="+a); // if의 전자 조건이 만족했음으로 결과가 이미 나와서 뒤의 연산은 수행하지 않는다.
	}
// 이렇게 일반논리를 써서 원하는 결과값이 안나올 때 이진논리( &  | )로 쓰면 후자의 조건도 연산된 결과로 나온다.
}
