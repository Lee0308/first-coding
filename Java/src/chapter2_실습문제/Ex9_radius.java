package chapter2_�ǽ�����;
import java.util.Scanner;
public class Ex9_radius {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �߽�(rx,ry)�� �������� �Է��Ͻÿ�>>");
		double rx = scanner.nextDouble();
		double ry = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.println("��(x,y)�� �Է��Ͻÿ�>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		double d = (rx-x)*(rx-x)+(ry-y)*(ry-y);
		if(r*r>=d) {
			System.out.println("�� (" +x+","+y+")�� �� �ȿ� �ִ�.");
		}
		else {
			System.out.println("�� (" +x+","+y+")�� �� �ȿ� ����.");
		}
		scanner.close();
	}

}
