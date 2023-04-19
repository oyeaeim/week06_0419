package test.mesod;

public class class_mathod {

	
		static void printHead(char c,int num) {
			for (int i=0;i<num;i++) {
				System.out.print(c);
			}
			System.out.println();
		}
		public static void main(String[] args) {
			printHead('§',20);
			System.out.println("사용자 정의 메소드를 만들었습니다.");
			printHead('☆',30);
			System.out.println("사용자 정의 메소드를 호출하겠습니다.");
			printHead('○',20);
			System.out.println("사용자 정의 메소드를 만들었습니다.");
			printHead('q',20);
			
		}



}
