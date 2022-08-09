package chapter2_실습문제;
import java.util.Scanner;

public class Ex3_지폐 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하시오>>");
		
		int num = scanner.nextInt();
			System.out.println("오만원권 " + num/50000 + "매");
			num%= 50000; // num = num%50000 (예: 15376=65376%50000)
			System.out.println("만원권 " + num/10000 + "매");
			num%= 10000;
			System.out.println("천원권 " + num/1000 + "매");
			num%= 1000;
			System.out.println("백원 " + num/100 + "매");
			num%= 100;
			System.out.println("오십원 " + num/50 + "매");
			num%= 50;
			System.out.println("십원 " + num/10 + "매");
			num%= 10;
			System.out.println("일원 " + num/1 + "매");
			scanner.close();
	}

}
