package a_datatype;

/*
 * 데이타 타입(자료형)
 * 1. 기본형(Primitive)
 * 			논리형 : boolean
 * 			문자형 : char
 * 			정수형 : int / long
 * 			실수형 : double
 * 
 * 2. 참조형(Reference) : 클래스, 배열
 * 			-> new 연산자를 이용해서 메모리 할당(확보) 반드시 써야한다
 * 
 * 			ex) String(예외): new를 쓰는 게 원칙이나 생략가능, 하지만 쓰는게 더 정확하다
*/


public class Ex02_Caution {

	public static void main(String[] args) {
		
		// 실수형
		//float f; //4Byte
		double f; //8Byte
		f = 3.6;
		System.out.println("실수;"+f);
		
		// 문자형+정수형
		char ch;
		ch = 65;
		System.out.println("ch값;"+ch);
		
		//int i;
		//i = 'a';
		int i = 'a';
		System.out.println("i값:"+i);
		
		long l = 10000000000L;
		System.out.println("l값:"+ l);
		//int i2 = 10000000000L;
		
		//형변환 - casting  값과 공간크기를 맞추는 작업, 메모리 큰데에 작은 값 넣을 때는 필요없다
		double db = (double)100;
		System.out.println("db값:"+db);
		
		int in = (int)100.1;
		System.out.println("in값:"+in);
	}

}
