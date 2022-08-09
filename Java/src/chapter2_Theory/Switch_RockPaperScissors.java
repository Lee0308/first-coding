package chapter2_Theory;
import java.util.Scanner;

public class Switch_RockPaperScissors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요.");
		
		String chulsu = scanner.next();
		System.out.print("철수 >> " + chulsu);
		String younghee = scanner.next();
		System.out.println("영희 >> " + younghee);
		
		if (chulsu.equals("가위")) {
			if (younghee.equals("보"))
				System.out.println("철수가 이겼습니다.");
		}
		scanner.close();
		
	}

}
