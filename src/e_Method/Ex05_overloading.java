package e_Method;
/*
 * overloading
 * 		: 동일한 이름의 메소드들
 * 		- 인자의 자료형과 갯수 달라야함
 * 
 *  [주의할점] add(1,2)
 *  	int 			add(int a , int b ) { }
 *  	double	 	add(int x , int b) { } ===> 컴파일 오류
 *  
 *  리턴형만 다르면 컴파일 오류 발생
 */

public class Ex05_overloading {
	static void addIntDouble(int c , double d) {
		System.out.println(c+d);		
	}// method가 앞에 있든 뒤에 있든 상관없다, 어차피 소환하면 되는 부분이므로.
	public static void main(String[] args) {
		int a=5, b=7;
		addInt(a,b); //Method의 첫글자는 소문자로 쓰는 것을 권장, 두번째 나오는 영단어의 첫글자는 대문자를 권장한다.(카멜표기법)
		int c =3;
		double d= 3.6;
		addIntDouble(c,d);
	}
	static void addInt(int a, int b) {
		System.out.println(a+b);
	}

}

// 여기서 addInt 와 addIntDouble 함수를 add로 통합해서 적어도 관계없다. 단, 인자의 자료형(ex, int or double)과 갯수는 달라야한다.
