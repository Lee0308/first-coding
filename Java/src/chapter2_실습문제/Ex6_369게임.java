package chapter2_�ǽ�����;
import java.util.Scanner;

public class Ex6_369���� {
	public static void main(String[] args) {
		int a;
		int ten;
		int one;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�>>");
		a = scanner.nextInt();
		
		ten = a/10;
		one = a%10;
		if ((ten%3) == 0) {
			if ((one%3) == 0)
				System.out.println("�ڼ�¦¦");
			else
				System.out.println("�ڼ�¦");
		}
		else if ((one%3) == 0)
			System.out.println("�ڼ�¦");
			
	}

}
