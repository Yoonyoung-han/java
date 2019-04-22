package c_control;
/*
 *  for( 초기값; 조건문; 증가식)
 *  {
 *  		반복할 문장들
 *  }
 */
public class Ex05_for개념 {

	public static void main(String[] args) {
//		int sum =0;
//		for(int i=1; i<=10; i++) {
//			sum += i; // sum= sum +i;
//		}
//		System.out.println("결과: "+sum);
		
		//{연습} 1~100까지의 홀수의 합과 짝수의 합
//		int sum1 =0;
//		int sum2 =0;
//	
//		for( int i=1; i<=100; i++  ) {
//			if( i%2==0) {
//				sum1 +=i;
//				}else if(i%2 ==1) {				// if(i%2 ==1) 빼고 적어도 수행된다
//					sum2 +=i;}
//			
//			}
//		System.out.println("짝수 결과 :"+ sum1);
//		System.out.println("홀수 결과 :"+ sum2);
//		}
//	}
//			int even=0, odd=0;
//			for( int i=1; i<=100; i+=2) {
//				odd+=i;
//						even+=(i+1);
//			}
//			System.out.println("짝수 결과 :"+ even);
//	        System.out.println("홀수 결과 :"+ odd);
		
		//A~Z 출력
//		for(char c='A'; c<='Z' ;c+=2) {
//			System.out.println(c);
//		}
//		
		//Z~A 출력
		
		for(char c='Z'; c>='A' ; c--) {
			System.out.println(c);
		}
		}
	}
	

