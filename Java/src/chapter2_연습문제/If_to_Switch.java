package chapter2_��������;

public class If_to_Switch {
	
	public static void main(String[] args) {
		if(in.equals("����")) 
			System.out.println(1);
		else if(in.equals("����"))
			System.out.println(2);
		else if(in.equals("��"))
			System.out.println(3);
		else
			System.out.println(0);
		
		String in = scanner.next();
		switch(in) {
		 case "����": System.out.println(1); break;
		 case "����": System.out.println(2); break;
		 case "��": System.out.println(3); break;
		 default: System.out.println(0); break;
		}
	}

}
