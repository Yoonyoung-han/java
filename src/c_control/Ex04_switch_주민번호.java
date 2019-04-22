package c_control;
/*
 *  switch 문 : 분기문
 *  
 *  switch(____)
 *  {
 *  		case A : 명령어A;  break;
 *  		case B : 명령어B;  break;
 *  		case C : 명령어C;  break;
 *  		default: 그외 명령어 => 일반적으로 제일 마지막으로 쓰는 경향이 있어서 break는 안쓰지만 첫째줄로 오면 당연 써야함
 *  }
 *  	***____: 정수형/문자형/ String(1.5버전이후)
 */
public class Ex04_switch_주민번호 {

	public static void main(String[] args) {
		
//		String id = "801212-1234567";
//		char chul = id.charAt(8);
//		String home="";
//		switch(chul) {
//		case '0' : home="서울"; break;
//		case '1' : home="인천/부산"; break;
//		case '2' : home="경기"; break;
//		case '3' : home="제주"; break;
//		default : home ="한국인";
//		}
//		System.out.println("출신지 : "+ home);
		
		String hakbun= "2018133001";
		String major = hakbun.substring(5, 7);
		char dan = hakbun.charAt(4); 
		String dande= "";
		String hakgwa="";
		
		
		
		if(dan=='1') {
			dande = "공대";
			System.out.println("공대");
			switch(major) {
			case "11" : hakgwa ="컴퓨터학과"; break;
			case "12" : hakgwa ="소프트웨어학과"; break;
			case "13" : hakgwa ="모바일학과"; break;
			case "22" : hakgwa ="자바학과 "; break;
			case "33" : hakgwa ="서버학과";
			}
		}else if(dan == '2') {
				dande = "사회대";
				System.out.println("사회대");
				switch(major) {
				case "11" : hakgwa ="사회학과"; break;
				case "12" : hakgwa ="경영학과"; break;
				case "13" : hakgwa ="경제학과"; 
				}
	}
		System.out.println(hakbun + "님은 " + dande +" "+ hakgwa+ " 학생입니다");
	}
	
	}
