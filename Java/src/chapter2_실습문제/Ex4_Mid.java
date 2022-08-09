package chapter2_실습문제;
import java.util.Scanner;

public class Ex4_Mid {
	public static void main(String[] args) {
		
		int A, B, C;
		int Max, Mid, Min;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개 입력>>");
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		
		if(A>B) {
			Max = A;
			Min = B;
			if(Max>C) {
				if(C>Min)
					Mid = C;
				else {
					Mid = Min;
					Min = C;
				}
			}
			else {
				Mid = Max;
				Max = C;
			}
		}
		else {
			Max = B;
			Min = A;
			if(Max>C) {
				if(C>Min)
					Mid = C;
				else {
					Mid = Min;
					Min = C;
				}
			}
			else {
				Mid = Max;
				Max = C;
			}
		}
		System.out.println("중간 값은 " + Mid);
	}
}
