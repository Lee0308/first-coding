package chapter2_Theory;
import java.util.Scanner;
public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("��, �̸�, ����, ��ȭ��ȣ, SMS���ŵ���, �ּҸ� �Է��Ͻʽÿ�.");
		
		String firstName = scanner.next();
		System.out.println("��: " + firstName + ", ");
		
		String lastName = scanner.next();
		System.out.println("�̸�: " + lastName + ", ");
		
		int age = scanner.nextInt();
		System.out.println("����: " + age + ", ");
		
		long phoneNumber = scanner.nextLong();
		System.out.println("��ȭ��ȣ: " + phoneNumber + ", ");
		
		boolean messageConsent = scanner.nextBoolean();
		System.out.println("SMS���ŵ���: " + messageConsent + ", ");
		
		String address = scanner.nextLine();
		System.out.println("�ּ�: " + address + "�Դϴ�.");
		scanner.close();
	}

}
