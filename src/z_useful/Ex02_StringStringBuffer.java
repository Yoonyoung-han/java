package z_useful;
/*
 * 자바에서 문자열 처리하는 클래스
 * 		1. String
 * 		2. StringBuffer
 * 		3. StringBuilder = StringBuffer (99% 동일-1% 다른점)
 */
public class Ex02_StringStringBuffer {

	public static void main(String[] args) {
	 
		String s = "안녕";// 쓰레기 메모리가 내용을 변경할 때마다 생겨난다.
		s+="하세요";
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer("반갑");// 메모리 자체의 내용을 수정해버린다.
		sb.append("습니다");
		System.out.println(sb);
	}

}
