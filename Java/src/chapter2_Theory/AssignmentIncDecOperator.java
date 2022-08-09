package chapter2_Theory;

public class AssignmentIncDecOperator {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		a += 2; // a=3
		b += 3; // b=5
		c += 4;	// c=7
		System.out.println("a=" + a + ", b= " + b + ", c= " + c);
		
		int d = 1;
		a = d++; // d=2, a=1
		System.out.println("a=" + a + ", d=" + d);
		a = ++d; // d=3, a=3
		System.out.println("a=" + a + ", d=" + d);
		a = d--; // d=2, a=3
		System.out.println("a=" + a + ", d=" + d);
		a = --d; // d=1, a=1 
		System.out.println("a=" + a + ", d=" + d);
	}

}
