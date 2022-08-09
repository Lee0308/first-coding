package chapter2_실습문제;
import java.util.Scanner;

public class Ex5_triangle_삼각형번의길이 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하시오>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if (((a+b)>c)==true && ((b+c)>a) == true && ((c+a)>b) == true) {
			System.out.println("삼각형이 됩니다.");
		} else {
			System.out.println("삼각형이 되지 않습니다.");
		}
	}

}
