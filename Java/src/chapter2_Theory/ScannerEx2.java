package chapter2_Theory;
import java.util.Scanner;
public class ScannerEx2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("성, 이름, 연령, 전화번호, SMS수신동의, 주소를 입력하십시오.");
		
		String firstName = scanner.next();
		System.out.println("성: " + firstName + ", ");
		
		String lastName = scanner.next();
		System.out.println("이름: " + lastName + ", ");
		
		int age = scanner.nextInt();
		System.out.println("연령: " + age + ", ");
		
		long phoneNumber = scanner.nextLong();
		System.out.println("전화번호: " + phoneNumber + ", ");
		
		boolean messageConsent = scanner.nextBoolean();
		System.out.println("SMS수신동의: " + messageConsent + ", ");
		
		String address = scanner.nextLine();
		System.out.println("주소: " + address + "입니다.");
		scanner.close();
	}

}
