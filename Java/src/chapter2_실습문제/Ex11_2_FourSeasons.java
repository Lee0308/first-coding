package chapter2_실습문제;
import java.util.Scanner;
public class Ex11_2_FourSeasons {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("달을 입력하세요(1~12)>>");
		int month = scanner.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 0:
		case 1:
			System.out.println("겨울");
			break;
		default:
			System.out.println("잘못 입력");
		}
		scanner.close();
	}

}
