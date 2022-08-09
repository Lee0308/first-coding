package chapter2_Theory;
import java.util.Scanner;

public class Switch_CoffeePrice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("메뉴를 주문하세요.");
		String menu = scanner.next();
		int price = 0;
		switch (menu) {
			case "아메리카노":
				price = 4000; break;
			case "바닐라라떼":
				price = 5000; break;
			case "오미자에이드":
				price = 6000; break;
			case "딸기라떼":
				price = 6500; break;
			default: System.out.println("메뉴에 없습니다.");
		}
		if(price != 0) System.out.println("가격은 " + price + "원입니다.");
		
		scanner.close();
	}

}
