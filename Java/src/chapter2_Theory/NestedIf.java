package chapter2_Theory;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학년을 입력하세요(1-4): ");
		int year = scanner.nextInt();
		System.out.println("점수를 입력하세요(1-100): ");
		int score = scanner.nextInt();
		
		if (score >= 60) {
			if (year != 4)
				System.out.println("축하합니다! 합격했습니다.");
			else if (score >= 75)
				System.out.println("축하합니다! 합격했습니다.");
			else if (score < 75)
				System.out.println("불합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		scanner.close();
	}

}
