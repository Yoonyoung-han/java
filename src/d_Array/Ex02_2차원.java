package d_Array;

import java.util.*;

public class Ex02_2차원 {

	public static void main(String[] args) {
		//		int [][]score;
		//		score = new int[3][4];// 3행 4열
		//		
		//		score[1][2]=100;
		//		score[2][3]=100;
		//		for(int i=0; i<3; i++) {
		//			for(int j=0; j<4; j++) {
		//				System.out.print(" "+score[i][j]+" ");
		//			}
		//	System.out.println();	}

		/*
		 * 입력할 학생수를 입력하세요. 4

4명의 국어, 영어, 수학 점수를 받아 결과 출력하기

1째 학생의 성적을 입력 -> 88/77/66
2째 학생의 성적을 입력 -> 50/40/70
3째 학생의 성적을 입력 -> 44/33/22
4째 학생의 성적을 입력 -> 55/50/70


[결과]
1째 학생의 총점 xxx 이고 평균은 ooo 입니다
2째 학생의 총점 xxx 이고 평균은 ooo 입니다
3째 학생의 총점 xxx 이고 평균은 ooo 입니다
4째 학생의 총점 xxx 이고 평균은 ooo 입니다
국어과목  총점 xxx 이고 평균은 ooo 입니다
영어과목  총점 xxx 이고 평균은 ooo 입니다
수학과목  총점 xxx 이고 평균은 ooo 입니다
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("학생수를 입력하세요");
		int stu = input.nextInt();
		int total= 0;
		int avg=0;
		int kor=0;
		int eng=0;
		int math=0;
		int [][]score = new int[stu][3];
		System.out.println("성적을 입력하세요 ex) 99/99/99");
		for(int i =0; i<stu; i++) {
			String allscore = input.next();
			StringTokenizer st = new StringTokenizer(allscore,"/");
			for(int j = 0; j<3; j++) {
				score[i][j] = Integer.parseInt(st.nextToken());		
			} 
		}	
			for(int i=0; i<stu; i++) {
				total=0;
			for(int j=0; j<3;j++) {
				total+=score[i][j];
				if(j==0) {
					kor+=score[i][j];
				}else if(j==1) {
					eng+=score[i][j];
				}else if(j==2) {
					math+=score[i][j];
				}
			}
			avg= total/3;
			System.out.println( (i+1)+"째 학생의 총점" + total+"이고 평균은 "+avg+"입니다.");
		}System.out.println("국어과목  총점 "+kor+" 이고 평균은"+(kor/stu)+ "입니다");
		System.out.println("영어과목  총점 "+eng+" 이고 평균은"+(eng/stu)+ "입니다");
		System.out.println("수학과목  총점 "+math+" 이고 평균은"+(math/stu)+ "입니다");
			
	}
}