package chapter2_실습문제;
import java.util.Scanner;
public class Ex10_inCircle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫 번째 원의 중심과 반지름을 입력하시오>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int r1 = scanner.nextInt();
		System.out.println("두 번째 원의 중심과 반지름을 입력하시오>>");
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int r2 = scanner.nextInt();
		
		int d = (x1-x2)*(x1-x2)+(y1-y2)*(y1-y2);
		
		if(Math.sqrt(d)<=r1+r2) {
			System.out.println("두 원은 서로 겹친다.");
		}
		else {
			System.out.println("두 원은 서로 겹치지 않는다.");
		}
		scanner.close();
	}

}
