package Rose;

import Rose.Rose;

public class Main {

	public static void main(String[] args) {
		int roseCount = 5;
		
		Rose rose = new Rose(roseCount);
		System.out.println(rose.toString());
		
		rose.bloom();
		System.out.println(rose.toString());
		
		rose.wilt();
		System.out.println(rose.toString());
		
		Rose redRose = new Rose(roseCount, Petal.Colors.Red);
		System.out.println(rose.equals(redRose));
		
		System.out.println(redRose.hashCode());
	}

}
