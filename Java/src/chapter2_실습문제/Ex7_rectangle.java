package chapter2_�ǽ�����;
import java.util.Scanner;

public class Ex7_rectangle {
	public static void main(String[] args) {
		int x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if ((100<=x) && (x<=200)) {
			if ((100<=y) && (y<=200))
				System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �ֽ��ϴ�.");
			else
				System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �����ϴ�.");
		}
		else
			System.out.println("(" + x + "," + y + ")�� �簢�� �ȿ� �����ϴ�.");
	}

}
