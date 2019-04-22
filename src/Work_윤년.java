
public class Work_윤년 {

	public static void main(String[] args) {
		
		int year=2020;
		
		
		if( year %4==0) {
		}if( year %100==0) {
			if(year%400==0) {
				System.out.println("윤년");
			}
		}else if(year%4>0) {
			System.out.println("평년");
		}else if(year%100>0) {
			System.out.println("윤년");
		}
		


	}

}
