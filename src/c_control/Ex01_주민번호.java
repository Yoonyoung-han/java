package c_control;

public class Ex01_주민번호 {

	public static void main(String[] args) {

			String id = "190101-4234567";
			char sung = id.charAt(7);
			// 1이거나 3이거나 9이면 남자를 출력
			
			if(sung == '1' | sung == '3' | sung== '9') {
				System.out.println("남자");
			}else if(sung =='2' | sung == '4'| sung == '8') {
				System.out.println("여자");
			}
			
		// 2이거나 4이거나 8이면 여자를 출력
			
	}

}
