package Numbers;

import java.util.ArrayList;

public class Numbers {
	public ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public void remove(int number) {
		int index = this.numbers.indexOf(number);
		this.numbers.remove(index);
	}
	
	public void addNumber(int number) {
		this.numbers.add(number);
	}
	
	public int findNearest(int number) {
		int minDiff = Integer.MAX_VALUE;
		int result = 0;
		for (int _number: this.numbers) {
			final int diff = Math.abs(number - _number);
        	if (diff < minDiff) {
        		minDiff = diff;
        		result = _number;
        	}
		}
        
        return result;
	}
	
	public void print() {
		for (int number: this.numbers) {
			System.out.println(number);
		}
	}
}
