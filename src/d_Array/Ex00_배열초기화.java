package d_Array;

public class Ex00_배열초기화 {

	public static void main(String[] args) {
		int a;// 변수 선언(기본형)-> 메모리 확보
		a = 10; // 값 지정
		int b = 20;//초기화
		//-----------------------------------
		/*int [] arr; // 변수 선언(참조형)->메모리 확보 X
		arr = new int[3]; //객체(heap에 메모리 확보한 경우) 생성(메모리 확보) object= instance
		arr[0]=10;
		arr[1]=19;
		arr[2]=33;
		*/
		int [] arr = new int [] { 3,30,13}; // 배열 초기화
		for(int i =0; i<arr.length ;i++) { // 자바는 자기가 몇개 가지고 있는지 기억함 length를 이용해서 배열의 범위 안의 데이터의 갯수를 계산함
			System.out.println(arr[i]);
		}
	}

}
