package chapter2_�ǽ�����;
import java.util.Scanner;

public class Ex2_AssignmentOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2�ڸ� ���� �Է�(10~99)>>");
		int a = scanner.nextInt();
		if (a/10 == a%10) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		} else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		scanner.close();
		
	}

}
