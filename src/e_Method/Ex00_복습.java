package e_Method;

public class Ex00_복습 {

	public static void main(String[] args) {

			   System.out.println("A");
			   test();
			   System.out.println("B");
			 }
			 static void test() {
			   System.out.println("C");
			   sample();
			   imsi();
			   System.out.println("D");   
			 } 
			 static void sample() {
			  System.out.println("E"); 
			 }
			 static void imsi() {
			  System.out.println("F"); 
			 }

	}
// 용어 알고 있기!!
//LIFO: stack = 나중에 들어간 애를 먼저 꺼내는 경우(Last In First Out)
//FIFO: Queue= 먼저 들어간 애를 먼저 꺼내는 경우(First in First Out)


