package chapter2_Theory;
import java.util.Scanner;
public class ScannerEx3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("a의 값과 b의 값을 입력하십시오.");
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		var c = a + b;
		System.out.println(c);
		scanner.close();
	}

}
