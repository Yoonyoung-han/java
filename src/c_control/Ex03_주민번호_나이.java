package c_control;
/*
 *  		1 - 정수값 1 (연산가능) 4Byte
 *  		'1'- 문자 1						2Byte
 *  		"1"- 문자열 1
 */
import java.util.*;

public class Ex03_주민번호_나이 {

	public static void main(String[] args) {
		
		String id = "181212-3234567";
		
		String nai1 = id.substring(0,2); // nai1 ="80"
		int nai2 = Integer.parseInt(nai1);// String -> int   ("80" - > 80)
		int age = 0;
		// 주민번호의 7번째 문자를 얻어와서
		// 1이거나 2라면 1900
		// 3 이거나 4 라면 2000
		// Calendar 클래스를 이용해서 년도값을 구해서 년도 지정
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		char sung = id.charAt(7);
		if( sung=='1' || sung == '2') {
		age = year - (1900+ nai2) + 1;
		}else if(sung == '3' || sung =='4') {
			age=year - ( 2000 + nai2)+1;
		}
		
		System.out.println("당신의 나이:"+ age);

	}

}
