package chapter2_�ǽ�����;
import java.util.Scanner;
public class Ex11_2_FourSeasons {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���(1~12)>>");
		int month = scanner.nextInt();
		
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;
		case 12:
		case 0:
		case 1:
			System.out.println("�ܿ�");
			break;
		default:
			System.out.println("�߸� �Է�");
		}
		scanner.close();
	}

}
