package chapter2_실습문제;
import java.util.Scanner;

public class Ex7_rectangle {
	public static void main(String[] args) {
		int x,y;
		Scanner scanner = new Scanner(System.in);
		System.out.println("점 (x,y)의 좌표를 입력하시오>>");
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		if ((100<=x) && (x<=200)) {
			if ((100<=y) && (y<=200))
				System.out.println("(" + x + "," + y + ")는 사각형 안에 있습니다.");
			else
				System.out.println("(" + x + "," + y + ")는 사각형 안에 없습니다.");
		}
		else
			System.out.println("(" + x + "," + y + ")는 사각형 안에 없습니다.");
	}

}
