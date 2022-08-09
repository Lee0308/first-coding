package chapter2_실습문제;
import java.util.Scanner;

public class Ex6_369게임 {
	public static void main(String[] args) {
		int a;
		int ten;
		int one;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하시오>>");
		a = scanner.nextInt();
		
		ten = a/10;
		one = a%10;
		if ((ten%3) == 0) {
			if ((one%3) == 0)
				System.out.println("박수짝짝");
			else
				System.out.println("박수짝");
		}
		else if ((one%3) == 0)
			System.out.println("박수짝");
			
	}

}
