package chapter2_Theory;
import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� �Է��Ͻÿ�.");
		
		String name = scanner.next();
		System.out.println("�̸��� " + name + ", ");
		
		String city = scanner.next();
		System.out.println("���ô� " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.println("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble();
		System.out.println("ü���� " + weight + "kg, ");

		boolean isSingle = scanner.nextBoolean();
		System.out.println("���� ���δ� " + isSingle + "�Դϴ�.");
		scanner.close();
	}

}
