package chapter2_실습문제;
import java.util.Scanner;
public class Ex11_1_FourSeasons {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12)>>");
		int month = scanner.nextInt();
		
		if (month>=3 && month<=5) {
			System.out.println("봄");
		}
		else if (month>=6 && month<=8) {
			System.out.println("여름");
		}
		else if (month>=9 && month<=11) {
			System.out.println("가을");
		}
		else if (month==12 || month==0 || month==1) {
			System.out.println("겨울");
		}
		else {
			System.out.println("잘못 입력");
		}
			
		scanner.close();
	}

}
