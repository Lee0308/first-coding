package chapter2_Theory;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�г��� �Է��ϼ���(1-4): ");
		int year = scanner.nextInt();
		System.out.println("������ �Է��ϼ���(1-100): ");
		int score = scanner.nextInt();
		
		if (score >= 60) {
			if (year != 4)
				System.out.println("�����մϴ�! �հ��߽��ϴ�.");
			else if (score >= 75)
				System.out.println("�����մϴ�! �հ��߽��ϴ�.");
			else if (score < 75)
				System.out.println("���հ��Դϴ�.");
		} else {
			System.out.println("���հ��Դϴ�.");
		}
		
		scanner.close();
	}

}
