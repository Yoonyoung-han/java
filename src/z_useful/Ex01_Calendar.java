package z_useful;

import java.util.*; //import java. util. calendar; 도 된다.


public class Ex01_Calendar {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();//객체=object=instance//달력값을 가져온다
		System.out.println(c.get(Calendar.YEAR)+"년");
		System.out.println(c.get(Calendar.MONTH)+1+"월");//월+1
		System.out.println(c.get(Calendar.DATE)+"일");
		//요일(일요일 =1, 월요일=2,.....)
		//System.out.println(c.get(Calendar.DAY_OF_WEEK)+"요일");
		String []str= new String[] {"일","월","화","수","목","금","토"};
		int yoil = c.get(Calendar.DAY_OF_WEEK);
		System.out.println(str[yoil-1]+"요일");
		
		
		
		
		// 시, 분, 초 출력
		System.out.println(c.get(Calendar.HOUR)+"시");
		System.out.println(c.get(Calendar.MINUTE)+"분");
		System.out.println(c.get(Calendar.SECOND)+"초");

		//그외 정보
		System.out.println("그 해의" + c.get(Calendar.DAY_OF_YEAR)+" 일입니다.");
		// 그 해의 몇 번째 주인지 : WEEK_OF_YEAR
		System.out.println("그 해의" + c.get(Calendar.WEEK_OF_YEAR)+" 주입니다.");
		// 이 달의 몇 번째 주인지 : WEEK_OF_MONTH
		System.out.println("이 달의" + c.get(Calendar.WEEK_OF_MONTH)+" 주입니다.");
	}

}
