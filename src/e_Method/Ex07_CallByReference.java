package e_Method;
/*
 * 기본형이면 "값"만 가져오기때문에 원본이 안바뀌고 반환이 됨과 동시에 메모리는 사라진다.
 * 참조형이면 "주소값"을 가져오는 거라서 호출하고 나서 변화를 주는 식을 쓰면 원본의 내용이 바뀌는 거라 반환되고 나서도 바뀐 내용이 나온다.
 */


public class Ex07_CallByReference {

	public static void main(String[] args) {
		StringBuffer a= new StringBuffer("행복하자");
		StringBuffer b= new StringBuffer("짝꿍님");
		add(a,b); // 넘어가는 애가 참조형이라서 원본 자체가 바뀐다. 
		System.out.println("A= "+a+",B= "+b); // A= 행복하자, B=짝꿍님

	}
	static void add(StringBuffer a, StringBuffer b) {
		a.append(b); // a 뒤에 b를 바로 붙인다는 의미
		System.out.println("A= "+a+",B= "+b); // A= 행복하자 짝꿍님 ,B= 짝꿍님
	}
}
