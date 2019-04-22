package d_Array;

public class Ex06_동적배열 {

	public static void main(String[] args) {
//		char [][] star = new char[4][];
//		
//		//값지정
//		for (int i = 0; i < star.length; i++) {
//			star[i] = new char[i+1]; // 빈 메모리가 없게 값을 설정한다.
//			for (int j = 0; j < i+1; j++) {//i+1을 star[i].length로 바꾸면 **** **** **** **** 이런식으로 나온다.
//				star[i][j]='*';
//			}
//		}
//		//출력
//		for (int i = 0; i < star.length; i++) {
//			for (int j = 0; j < star[i].length; j++) {
//			  System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
		/*
[문제] 
동적크기로 합이 가장 큰 행을 출력하기
  int a[][]=new int[][]{{3,-5, 12 }, {-2, 11, 2, -7}, {21, -21, -35, -93, -11}, {9, 14, 39, -98}};
결과 : 0행
		 */
		  char [][] star = new char[4][]; 
		  // 값지정
		  for (int i = 0; i < star.length; i++) {
		   star[i] = new char[i+1];
		   for (int j = 0; j < i+1; j++) {
		    star[i][j]='*';
		   }
		  }
		  // 출력

		  
		  for (int i = 0; i < star.length; i++) {
		   for (int j = 0; j < star[i].length; j++) {
		    System.out.print(star[i][j]);
		   }
		   System.out.println();
		  }

		
		
		/*
		 [ 문제 ]: 합이 가장 큰 행과 열 
 다음 배열 a에서 합이 가장 큰 행과 열의 번호를 각각 출력하기
 int a[][]=new int[][]{{3,-5, 12, 3, -21}, {-2, 11, 2, -7, -11}, {21, -21, -35, -93, -11}, {9, 14, 39, -98, -1}};
 결과 : 2 1

		 */
		
	}

}
