package chapter2_Theory;
import java.util.Scanner;

public class Switch_CoffeePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�޴��� �ֹ��ϼ���.");
		String menu = scanner.next();
		int price = 0;
		switch (menu) {
			case "�Ƹ޸�ī��":
				price = 4000; break;
			case "�ٴҶ��":
				price = 5000; break;
			case "�����ڿ��̵�":
				price = 6000; break;
			case "�����":
				price = 6500; break;
			default: System.out.println("�޴��� �����ϴ�.");
		}
		if(price != 0) System.out.println("������ " + price + "���Դϴ�.");
		
		scanner.close();
	}

}
