package chapter2_실습문제;
import java.util.Scanner;
public class Ex12_1_Calculation {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산>>");
		double a = scanner.nextDouble();
		String cal = scanner.next();
		double b = scanner.nextDouble();
		double result = 0;
		if (cal.equals("+")) {
			result = a+b;
			System.out.println(a+cal+b+"의 계산 결과는 "+result);
		}
		else if (cal.equals("-")) {
			result = a-b;
			System.out.println(a+cal+b+"의 계산 결과는 "+result);
		}
		else if (cal.equals("*")) {
			result = a*b;
			System.out.println(a+cal+b+"의 계산 결과는 "+result);
		}
		else if (cal.equals("/")) {
			if (b==0) {
				System.out.println("0으로 나눌 수 없습니다.");
			}
			else {
				result = a/b;
				System.out.println(a+cal+b+"의 계산 결과는 "+result);
			}
		}
		scanner.close();
	}
}