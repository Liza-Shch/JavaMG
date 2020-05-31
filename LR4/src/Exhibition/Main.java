package Exhibition;

import java.util.Date;

import Exhibition.Exhibition.Author;
import Exhibition.Exhibition.Painting;

public class Main {

	public static void main(String[] args) {
		Exhibition exhibition = new Exhibition(new Date());
		Author author = exhibition.new Author("Иван", "Иванов");
		Painting painting = exhibition.new Painting(100, 200, author);
		exhibition.addPainting(painting);
	}

}
