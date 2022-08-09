package chapter2_실습문제;
import java.util.Scanner;
public class Ex8_inRectangle {
		
		public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
			if ((x>=rectx1 && x<=rectx2) && (y>=recty1 && y<=recty2))
				return true;
			else
				return false;
		}
		

		public static void main(String[] args) {
			int x1, x2, y1, y2;
			Scanner scanner = new Scanner(System.in);
			System.out.println("점 (x1,y1), (x2,y2)의 좌표를 입력하시오>>");
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y1 = scanner.nextInt();
			y2 = scanner.nextInt();
		
			boolean result;
			if (inRect(x1,y1,100,100,200,200)||inRect(x1,y2,100,100,200,200)||inRect(x2,y1,100,100,200,200)||inRect(x2,y2,100,100,200,200)) {
				result=true; // 점이 하나라도 (100,100),(200,200) 안에 있을 때
			}
			else if (inRect(x1,y1,100,100,200,200)&&inRect(x1,y2,100,100,200,200)&&inRect(x2,y1,100,100,200,200)&&inRect(x2,y2,100,100,200,200)) {
				result=true; // 점 4개가 모두 (100,100),(200,200) 안에 있을 때
			}
			else if (inRect(100,100,x1,y1,x2,y2)&&inRect(100,200,x1,y1,x2,y2)&&inRect(200,100,x1,y1,x2,y2)&&inRect(200,200,x1,y1,x2,y2)) {
				result=true; // 점 (100,100),(200,200)이 (x1,y1),(x2,y2) 안에 있을 때
			}
			else {
				result=false;
			}
			
			if(result) {
				System.out.println("사각형이 겹칩니다.");
			}
			else {
				System.out.println("사각형이 겹치지 않습니다.");
			}
			scanner.close();
				
	}
}
