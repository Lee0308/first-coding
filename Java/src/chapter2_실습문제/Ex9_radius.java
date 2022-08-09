package chapter2_실습문제;
import java.util.Scanner;
public class Ex9_radius {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원의 중심(rx,ry)과 반지름을 입력하시오>>");
		double rx = scanner.nextDouble();
		double ry = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.println("점(x,y)을 입력하시오>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		double d = (rx-x)*(rx-x)+(ry-y)*(ry-y);
		if(r*r>=d) {
			System.out.println("점 (" +x+","+y+")는 원 안에 있다.");
		}
		else {
			System.out.println("점 (" +x+","+y+")는 원 안에 없다.");
		}
		scanner.close();
	}

}
