package chapter2_�ǽ�����;
import java.util.Scanner;
public class Ex10_inCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù ��° ���� �߽ɰ� �������� �Է��Ͻÿ�>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		System.out.println("�� ��° ���� �߽ɰ� �������� �Է��Ͻÿ�>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int r2 = scanner.nextInt();
		
		int d = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		
		if(Math.sqrt(d)<=r1+r2) {
			System.out.println("�� ���� ���� ��ģ��.");
		}
		else {
			System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");
		}
		scanner.close();
	}

}
