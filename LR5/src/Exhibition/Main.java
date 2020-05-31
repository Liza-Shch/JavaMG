package Exhibition;

import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

import Exhibition.Exhibition.Author;
import Exhibition.Exhibition.Painting;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int width = 0;
		int height = 0;
		
		try {
			width = scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Width must be int");
		}
		
		try {
			height = scanner.nextInt();
		} catch(InputMismatchException e) {
			System.out.println("Height must be int");
		}
		
		try {
			Exhibition exhibition = new Exhibition(new Date());
			Author author = exhibition.new Author("Иван", "Иванов");
			Painting painting = exhibition.new Painting(width, height, author);
			exhibition.addPainting(painting);
		} catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		} catch (OutOfMemoryError e) {
			System.out.println(e.getMessage());
		}
	}

}
