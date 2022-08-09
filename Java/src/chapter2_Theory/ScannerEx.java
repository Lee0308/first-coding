package chapter2_Theory;
import java.util.Scanner;
public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 입력하시오.");
		
		String name = scanner.next();
		System.out.println("이름은 " + name + ", ");
		
		String city = scanner.next();
		System.out.println("도시는 " + city + ", ");
		
		int age = scanner.nextInt();
		System.out.println("나이는 " + age + "세, ");
		
		double weight = scanner.nextDouble();
		System.out.println("체중은 " + weight + "kg, ");

		boolean isSingle = scanner.nextBoolean();
		System.out.println("독신 여부는 " + isSingle + "입니다.");
		scanner.close();
	}

}
