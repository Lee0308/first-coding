package chapter2_�ǽ�����;
import java.util.Scanner;

public class Ex5_triangle_�ﰢ�����Ǳ��� {
	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ�>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if (((a+b)>c)==true && ((b+c)>a) == true && ((c+a)>b) == true) {
			System.out.println("�ﰢ���� �˴ϴ�.");
		} else {
			System.out.println("�ﰢ���� ���� �ʽ��ϴ�.");
		}
	}

}
