package c_control;
/*
 * 우리대학의 학번은 총 10자리로 되어 있습니다.
맨 앞의 4자리는 입학년도이고 5번째 문자는 단과대 번호입니다. ( charAt() 이용)
     1 : 공대
     2 : 사회대
그 뒤의 2자리는 각 학과번호입니다.
  공과대학인 경우는 ( substring() 이용)
     11 : 컴퓨터학과       12 : 소프트웨어학과          13 : 모바일학과
     22 : 자바학과         33 : 서버학과
사회대학인 경우는
  11 : 사회학과         12 : 경영학과          13 : 경제학과
       ex) 2017111001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다
       ex) 2019211001 는 2019년도에 입학한 사회대 사회학과 학생입니다
       ex) 2018133001 는 2018년도에 입학한 공대 서버학과 학생입니다        
 */
public class Ex02_if_학번 {

	public static void main(String[] args) {
		
		String hakbun = "2018133001";
		String hakyeon = hakbun.substring(0,4); //입학년도 구하기
		String major = hakbun.substring(5, 7); //학과 구하기
		char dan = hakbun.charAt(4); //단대 구하기
		String dande= "";//결과값이 비어있어야 결과가 나오는 대로 공대나 사회대가 들어간다
		String hakgwa=""; // major는 데이터값, hakgwa는 출력값 
		
		
		if(dan=='1') {
			dande = "공대";
			System.out.println("공대");
			if( major.equals("11")) {//그냥 ==를 쓰면 주소를 비교하기 때문에 .equals를 쓴다
				hakgwa ="컴퓨터학과";
				System.out.println("컴퓨터학과");
			}else if( major.equals("12")) {
				hakgwa="소프트웨어학과";
				System.out.println("소프트웨어학과");
			}else if( major.equals("13")) {
				hakgwa="모바일학과";
					System.out.println("모바일학과");
				}else if( major.equals("22")) {
					hakgwa ="자바학과";
					System.out.println("자바학과");
				}else if( major.equals("33")) {
					hakgwa ="서버학과";
					System.out.println("서버학과");
				}
			
		}else if(dan == '2') {
			dande = "사회대";
			System.out.println("사회대");
			if( major.equals("11")) {
				hakgwa ="사회학과";
				System.out.println("사회학과");
			}else if( major.equals("12")) {
				hakgwa ="경영학과";
				System.out.println("경영학과");
			}else if( major.equals("13")) {
				hakgwa ="경제학과";
				System.out.println("경제학과");
			}
		}
		
		
		System.out.println(hakbun + "님은 " + hakyeon + "년에 입학한 "+ dande +" "+ hakgwa+ " 학생입니다");
		
		
		
		
	}

}
