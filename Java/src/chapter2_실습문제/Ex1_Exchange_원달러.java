package chapter2_�ǽ�����;
import java.util.Scanner;

public class Ex1_Exchange_���޷� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ȭ�� �Է��ϼ���(���� ��)>>");
		int won = scanner.nextInt();
		double dollar = won/1100;
		System.out.println(won + "���� $" + dollar + "�Դϴ�.");
		
		scanner.close();
	}

}
