package chapter2_Theory;
import java.util.Scanner;

public class Switch_RockPaperScissors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���.");
		
		String chulsu = scanner.next();
		System.out.print("ö�� >> " + chulsu);
		String younghee = scanner.next();
		System.out.println("���� >> " + younghee);
		
		if (chulsu.equals("����")) {
			if (younghee.equals("��"))
				System.out.println("ö���� �̰���ϴ�.");
		}
		scanner.close();
		
	}

}
