package Exhibition;

import java.util.ArrayList;
import java.util.Date;

public class Exhibition {
	class Author {
		public String name;
		public String surname;
		
		public Author(String name, String surname) {
			try {
				this.name = name;
				this.surname = surname;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	class Painting {
		public int width;
		public int height;
		public Author author;
		
		public Painting(int width, int height, Author author) {
			try {
				this.width = width;
				this.height = height;
				this.author = author;
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	}
	
	public Date date;
	public ArrayList<Painting> paintings = new ArrayList<Painting>();
	
	public Exhibition(Date date) {
		try {
			this.date = date;
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void addPainting(Painting painting) {
		try {
			this.paintings.add(painting);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
