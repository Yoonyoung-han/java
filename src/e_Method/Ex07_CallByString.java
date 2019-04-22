package e_Method;
/*
 * 돌연변이다. 내부적으로는 CallByReference가 맞는 거다. CallByString은 String의 특성때문에 특수한 결과가 생기는 것이다.
 * String : 메모리 변경되면 새로운 주소를 잡아버린다. 
 */
public class Ex07_CallByString {

	public static void main(String[] args) {
			String a= new String("행복하자");
			String b= new String("짝꿍님");
			add(a,b); 
			System.out.println("2. A= "+a+",B= "+b); // A= 행복하자, B=짝꿍님

		}
		static void add(String a, String b) {
			a+=b; //String은 메모리 내용이 변경되자마자 메모리를 새로 잡는다=> 새로운 주소가 생김
			System.out.println("1. A= "+a+",B= "+b); // A= 행복하자 짝꿍님 ,B= 짝꿍님
		}// 반환되는 순간 만들어졌던 내용이 사라짐

	}


