package d_Array;
import java.util.*; // Scanner를 통해 입력값을 받을 것이기 때문에 먼저 써준다
public class Ex07_baseball {

	public static void main(String[] args) {
		int baseball[]= new int[3]; // 지정 숫자 3개를 설정한다.
		for (int i = 0; i <baseball.length; i++) {//랜덤 생성을 위해 반복문 사용
			baseball[i]=(int)(Math.random()*10); // 각 자리마다 0~9까지의 숫자가 지정되어야하기 때문에 10을 곱해준다
			for(int k=0; k<i;k++) { // 값이 동일할 경우에는 다시 랜덤으로 숫자를 지정해야하기 때문에 또다른 반복문을 입력한다.
				if(baseball[k]==baseball[i]) { //값이 동일할 경우라면~
					i--;// 다음 수를 뽑지 않고 다시 처음 반복문으로 돌아간다.
				}
			}
		}
		int answer[]= new int[3]; // 입력값 3개를 받아야하기 때문에 변수를 선언한다.
		LABEL: // 라벨을 지정해서 10번 이상 입력하게 되면 break;로 빠져나올 수 있게 설정한다.
			for (int n =0; n<10 ;n++) { // 10번까지만 입력이 가능하게 설정한다.
				Scanner input = new Scanner(System.in); 
				System.out.println("숫자를 입력하세요");
				for(int i=0; i<3; i++) { //입력값도 3개를 받는다
					answer[i] =input.nextInt(); // 입력값을 변수에 담아준다
				}		
				int strike=0, ball=0; // 각 케이스 별로 결과값을 입력하기 위해 변수를 설정+초기화한다.
				for(int i =0 ; i <baseball.length; i++) { //랜덤값과 입력값을 비교하기위해 반복문 사용
					for(int j=0; j<answer.length;j++) {// 랜덤값에 맞는 입력값을 비교하기 위해 반복문 사용
						if(answer[j]==baseball[i]) {// 만약에 입력값과 랜덤값이 같다면~
							if(j==i) {// 위치도 같을 경우
								strike++;// 스트라이크가 1 올라간다
							}else {//그게아닌 (값은 같지만 위치는 다를 경우)
								ball++;// 볼이 1 올라간다
							}

						}
						if(strike==3) {// 스트라이크 값이 3번이 된다면
							System.out.println("THREE 스트라이크!!!!!!!!!!!!!!!"); // THREE 스트라이크를 출력한다
							break LABEL; // THREE 스트라이크가 나오면 게임이 종료될 수 있도록 라벨을 설정하고, 블럭 밖으로 빠져나올수있게 설정한다
						}
					}			
				}
				if(strike==0&&ball==0) {// 스트라이크 값과 볼 값이 0일 경우(맞는 값이 없는 경우)
					System.out.println("OUT!!!!!!!!!!!!!!!!!!!!!!");// 아웃을 출력한다
				}else {//그게 아닌 경우(맞는 값이 있을 경우)
					System.out.println(strike+" 스트라이크 "+ball+"볼");// 각각 스트라이크와 볼값을 출력한다.
				}
			}
	}
}

