package chapter2_실습문제;
import java.util.Scanner;

public class Ex2_AssignmentOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2자리 정수 입력(10~99)>>");
		int a = scanner.nextInt();
		if (a/10 == a%10) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		scanner.close();
		
	}

}
