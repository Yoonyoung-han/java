package b_Operator;
/*
 * 증가 감소 연산자:  ++, --
 */


public class Ex01_incDec {

	public static void main(String[] args) {
		 
		//int a = 5, b = 7;
		/*System.out.println("A="+ (a +1) +",B="+(b+1)); //먼저 계산할 거를 괄호로 묶어준다
		
		a = a+1;
		b = b-1;
		System.out.println("A="+a+",B="+b);
		
		a++;// 14행과 같은 코딩 =++a
		b--;  //15행과 같은 코딩  =--b
		System.out.println("A="+ a +",B="+b);
		*/
		
//		int result = ++a; 
//		System.out.println("Result"+ result+ ",A="+a); //Result6,A=6
//		
//		int result2 = a++;
//		System.out.println("Result"+ result2+ ",A="+a); //Result6,A=7
//		// ++a는 연산부터 하고 대입, a++은 대입하고 연산
		
		int a= 5, b= 7;
		System.out.println("A="+ ++a +",B="+ --b); //A=6 , B= 6
		System.out.println("A="+ a++ +",B="+ b--); //A=6, B=6
		System.out.println("A="+a+",B="+b); //A=7, B=5
		

		
	}

}
