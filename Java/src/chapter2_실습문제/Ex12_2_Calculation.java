package chapter2_�ǽ�����;
import java.util.Scanner;
public class Ex12_2_Calculation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���>>");

		double op1 = sc.nextDouble();
		String operator = sc.next();
		double op2 = sc.nextDouble();
		double result = 0;
        
		switch(operator) {
		case "+" : result = op1 + op2; break;
		case "-" : result = op1 - op2; break;
		case "*" : result = op1 * op2; break;
		case "/" : 
			if(op2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�.");
				return;
			}
			result = op1 / op2; break;
		default : System.out.println("���� ��ȣ�� �߸��Ǿ����ϴ�.");
		}
		System.out.println(result);
		
		
		/*
		Scanner scanner = new Scanner(System.in);
		System.out.println("����>>");
		
		double num1 = scanner.nextDouble();
		String cal = scanner.next();
		double num2 = scanner.nextDouble();
		double result = 0;
		
		switch (cal) {
			case "+": result = num1+num2; break;
			case "-": result = num1-num2; break;
			case "*": result = num1*num2; break;
			case "/":
				if (num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�.");
				}
				result = num1/num2; break;
			default:
				System.out.println("���� ��ȣ�� �߸��Ǿ����ϴ�.");
		}
		System.out.println(result);
		*/
	}

}
