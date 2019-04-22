package d_Array;

public class Ex03_큰값구하기 {

	public static void main(String[] args) {
		int []arr = {22,15,13,7,35,25};
		//이 중에서 가장 큰 값을 추출해서 출력
		/*
		 우선 임의의 변수를 정의하고 예를 들어 max 라 하자. 
1. 이 변수에 배열의 첫번째 값을 입력한다. 
2. 이 값이 가장 크다고 가정하고 다음번 방에 있는 데이타와 비교를 한다. 
3. 이 변수에 저장된 값보다 큰 값이 들어오면 더 큰 값으로 바꿔치기를 한다. 
4. 이 과정을 배열이 끝날때 까지 반복하면 된다. 
		 */
		int max=arr[0];
		for(int i =0 ; i<arr.length; i++) {
			if(arr[i]>max) { //기존 max 값보다 큰 수를 만났을 경우에 max값을 변경해준다, 작은 수를 만났을 경우에는 그냥 지나가면 된다.
				max=arr[i]; //스와핑 할 필요없이 그냥 큰 값을 max에 덮어씌우면 끝난다.
			}
		}
		System.out.println(max);

	}

}
