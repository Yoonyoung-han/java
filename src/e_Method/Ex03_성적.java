package e_Method;

import java.util.*;

public class Ex03_성적 {

	public static void main(String[] args) {
		int [] arr=input();
		int [] arr2 =calc( arr );
		output(arr2);
	}
	static int[] input() {
		//국영수 점수를 입력받기
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		int kor = input.nextInt();
		System.out.println("영어점수를 입력하세요");
		int eng = input.nextInt();
		System.out.println("수학점수를 입력하세요");
		int math = input.nextInt();
		int [] arr= { kor, eng, math };
		return arr;
	}
	static int[] calc(int [] arr) {
		// input() 에서 입력받은 점수들의 합과 평균을 구하기
		int sum= arr[0] +arr[1]+ arr[2];
		int avg= sum/3;
		int [] arr2 = { sum, avg};
		return arr2;
	}
	static void output(int [] arr2) {
		// calc() 구한 합과 평균을 출력
		System.out.println("합 : "+ arr2 [0]+" 평균 : "+ arr2[1]);
	}

}
//package e_method;
//
//import java.util.Scanner;
//
//public class Ex03_성적 {
//
// static int[]grades;
// static int sum;
// static double avg;
// 
// public static void main(String[] args) {
//
//  input();
//  calc();
//  output();
// }
//
// static void input() {
//  // 국영수 점수를 입력받기
//  Scanner sc = new Scanner(System.in);
//  System.out.println("점수입력 (국어 영어 수학): ");
//  grades = new int[3];
//  for(int i = 0; i < 3; i++) {
//   grades[i] = sc.nextInt();
//  }
// }
// 
// static void calc() {
//  // input() 에서 입력받은 점수들의 합과 평균을 구하기
//  sum = 0;
//  for(int i = 0; i < grades.length; i++) {
//   sum += grades[i];
//  }
//  avg = (double)sum / grades.length;
// }
// 
// static void output() {
//  // calc() 에서 구한 합과 평균을 출력
//  System.out.println("합: " + sum + " 평균: " + avg);
// }
//}
