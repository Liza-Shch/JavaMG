package Exhibition;

import java.util.ArrayList;
import java.util.Date;

public class Exhibition {
	class Author {
		public String name;
		public String surname;
		
		public Author(String name, String surname) {
			this.name = name;
			this.surname = surname;
		}
	}
	
	class Painting {
		public int width;
		public int height;
		public Author author;
		
		public Painting(int width, int height, Author author) {
			this.width = width;
			this.height = height;
			this.author = author;
		}
	}
	
	public Date date;
	public ArrayList<Painting> paintings = new ArrayList<Painting>();
	
	public Exhibition(Date date) {
		this.date = date;
	}
	
	public void addPainting(Painting painting) {
		this.paintings.add(painting);
	}
}
