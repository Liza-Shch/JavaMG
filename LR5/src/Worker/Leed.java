package Worker;

public class Leed extends Engineer {

	public Leed(String name, String company) {
		super(name, company);
	}
	
	public void letGo(Engineer worker) {
		System.out.println("Go!");
		worker.goToWeekend();
	}
}
