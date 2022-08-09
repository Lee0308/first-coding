package chapter2_연습문제;

public class If_to_Switch {
	
	public static void main(String[] args) {
		if(in.equals("가위")) 
			System.out.println(1);
		else if(in.equals("바위"))
			System.out.println(2);
		else if(in.equals("보"))
			System.out.println(3);
		else
			System.out.println(0);
		
		String in = scanner.next();
		switch(in) {
		 case "가위": System.out.println(1); break;
		 case "바위": System.out.println(2); break;
		 case "보": System.out.println(3); break;
		 default: System.out.println(0); break;
		}
	}

}
