package chapter2_�ǽ�����;
import java.util.Scanner;
public class Ex12_1_Calculation {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("����>>");
		double a = scanner.nextDouble();
		String cal = scanner.next();
		double b = scanner.nextDouble();
		double result = 0;
		if (cal.equals("+")) {
			result = a+b;
			System.out.println(a+cal+b+"�� ��� ����� "+result);
		}
		else if (cal.equals("-")) {
			result = a-b;
			System.out.println(a+cal+b+"�� ��� ����� "+result);
		}
		else if (cal.equals("*")) {
			result = a*b;
			System.out.println(a+cal+b+"�� ��� ����� "+result);
		}
		else if (cal.equals("/")) {
			if (b==0) {
				System.out.println("0���� ���� �� �����ϴ�.");
			}
			else {
				result = a/b;
				System.out.println(a+cal+b+"�� ��� ����� "+result);
			}
		}
		scanner.close();
	}
}