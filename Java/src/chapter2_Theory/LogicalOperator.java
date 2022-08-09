package chapter2_Theory;

public class LogicalOperator {

	public static void main(String[] args) {
		System.out.println('a'>'b'); // false
		System.out.println(3>6); // false
		System.out.println(544<3052); // true
		System.out.println(3>=3); // true
		System.out.println(4!=4); // false
		System.out.println(!(3>2)); // false
		System.out.println((1!=2) ^ (259==259)); // false
		System.out.println((3!=2)||(-1>0)); // true
		System.out.println((2>-2) && (3<5)); // true
		// System.out.println((1=3) || (1>3)); // 자꾸 이 문장만 에러 뜸
	}

}
