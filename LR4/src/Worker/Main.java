package Worker;

public class Main {

	public static void main(String[] args) {
		Leed leed = new Leed("Иван", "Иванов");
		Engineer worker = new Engineer("Петр", "Петров");
		
		leed.work();
		worker.work();
		leed.letGo(worker);

	}

}
