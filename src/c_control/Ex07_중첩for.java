package c_control;

public class Ex07_중첩for {

	public static void main(String[] args) {
		//		// *****
		//		for(int j=0; j<5;j++) {
		//		for(int i=4; i>=j;i--) {
		//		System.out.print('*');
		//
		//	}
		//System.out.println();
		//	}
		/*
		 * 문제1
		 */
		//		for(int i =0 ; i <26 ; i++) {
		//			for(char c= 'a'; c<='a'+i;c++) {
		//				System.out.print(c);
		//			}
		//
		//			System.out.println();
		//		}

		/*
		 * 문제2
		 */
		//		for(int i = 0; i<26; i++) {
		//		for(char cha ='a'; cha<='z'-i; cha++) {
		//			System.out.print(cha);
		//		}
		//		System.out.println();
		//	}
		/*
		 * 문제 3
		 */
		//		for(int i= 0; i<26; i++) {
		//			for(char cha= (char)('a'+i) ;cha<='z';cha++) {
		//				System.out.print(cha);
		//			}
		//			System.out.println();
		//		}

		/*
		 * 문제4
		 */
		//		for(int i =0; i<26; i++) {
		//			
		//			for(char cha = 'z'; cha>='z'-i;cha--) { 
		//				System.out.print(cha);
		//			}
		//			
		//			System.out.println();
		//		}
		/*
		 * 문제5
		 */
		for(int i=0; i<26; i++) {
			for(char cha1=0; cha1<=i ; cha1++) {
				System.out.print(' ');
			}
			for(char cha=(char)('a'+i); cha<='z';cha++) {
				System.out.print(cha);
			}
			System.out.println();
		}
	}}
