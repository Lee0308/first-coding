package chapter2_�ǽ�����;
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
			System.out.println("�� (x1,y1), (x2,y2)�� ��ǥ�� �Է��Ͻÿ�>>");
			x1 = scanner.nextInt();
			x2 = scanner.nextInt();
			y1 = scanner.nextInt();
			y2 = scanner.nextInt();
		
			boolean result;
			if (inRect(x1,y1,100,100,200,200)||inRect(x1,y2,100,100,200,200)||inRect(x2,y1,100,100,200,200)||inRect(x2,y2,100,100,200,200)) {
				result=true; // ���� �ϳ��� (100,100),(200,200) �ȿ� ���� ��
			}
			else if (inRect(x1,y1,100,100,200,200)&&inRect(x1,y2,100,100,200,200)&&inRect(x2,y1,100,100,200,200)&&inRect(x2,y2,100,100,200,200)) {
				result=true; // �� 4���� ��� (100,100),(200,200) �ȿ� ���� ��
			}
			else if (inRect(100,100,x1,y1,x2,y2)&&inRect(100,200,x1,y1,x2,y2)&&inRect(200,100,x1,y1,x2,y2)&&inRect(200,200,x1,y1,x2,y2)) {
				result=true; // �� (100,100),(200,200)�� (x1,y1),(x2,y2) �ȿ� ���� ��
			}
			else {
				result=false;
			}
			
			if(result) {
				System.out.println("�簢���� ��Ĩ�ϴ�.");
			}
			else {
				System.out.println("�簢���� ��ġ�� �ʽ��ϴ�.");
			}
			scanner.close();
				
	}
}
