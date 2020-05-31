package Worker;

public class Main {

	public static void main(String[] args) {
		try {
			Leed leed = new Leed("Иван", "Иванов");
			Engineer worker = new Engineer("Петр", "Петров");
		
			leed.work();
			worker.work();
			leed.letGo(worker);
		} catch(OutOfMemoryError e) {
			System.out.println(e.getMessage());
		} catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

	}

}
