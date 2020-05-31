package Numbers;

public class Main {

	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		for (int i = 0; i < 10; i++) {
			numbers.addNumber((int) (Math.random() * (10 * 2 + 1) - 10));
		}
		
		numbers.print();
		System.out.println("\nДобавили число");
		numbers.addNumber(1);
		numbers.print();
		System.out.println("\nУдалили число");
		numbers.remove(1);
		numbers.print();
		System.out.println("\nНашли число");
		System.out.println(numbers.findNearest(-1));
		
	}

}
