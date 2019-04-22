package a_datatype;

import java.util.Scanner;

public class Ex05_Scanner {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//학생명을 입력받아
		System.out.println("학생명:");
		String name = input.nextLine();
		System.out.println("국어점수=>");
		int kor = input.nextInt();
		System.out.println("영어점수=>");
		int eng = input.nextInt();
		System.out.println("수학점수=>");
		int math = input.nextInt();
		
		// 총점을 구해서 출력
		int total = kor + eng + math;
		System.out.println("총점:"+total);
		
		// 평균을 구해서 출력
		double average = (double)total/3;
				System.out.println("평균:"+average);

	}

}
