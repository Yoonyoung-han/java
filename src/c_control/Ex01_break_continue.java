package c_control;
/*
 * 			break - 블럭을 벗어나는 명령
 * 			continue - 블럭의 끝의 안으로 가라는 명령
 */
public class Ex01_break_continue {

	public static void main(String[] args) {
		END ://벗어나길 원하는 라벨 지정하기(대문자 지향)
		for(int i= 0; i<2; i++) {
			for(int j=0; j<3; j++) {
				if(j==1) continue END;//break END; 이렇게 적으면 해당되는 블럭을 벗어난다. 첫번째 j가 1이되는 순간 다 벗어남
				System.out.println("<"+i+","+j+">");
			}
			System.out.println("데이타");
	}//continue END; 는 다시 첫번째 for문으로 돌아가서 i가 1인경우를 다시 수행한다.
	}

}
