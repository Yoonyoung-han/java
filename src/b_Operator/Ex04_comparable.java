package b_Operator;
/*
 * 비교연산자 : >	< 		>= 		<=		, == 	!=
 */
public class Ex04_comparable {

	public static void main(String[] args) {
		
		int k= 100, e=100, m=100;
		double avg = (double)(k+e+m)/3;
		System.out.println("평균:" + avg);
		String score ="";
		
		switch((int)(avg/10)) {
		case 10:
		case 9 : score = "A학점"; break;
		case  8: score = "B학점"; break;
		case 7 : score = "C학점"; break;
		default : score= "F학점";
		}
		System.out.println(score);
//		if(avg>=90) {
//			System.out.println("A학점");
//		}else if(avg>=80) {
//			System.out.println("B학점");
//		}else if(avg>=70) {
//			System.out.println("C학점");
//		}
		
		
		
	}

}
