package Worker;

public class Engineer implements Worker {
	public String name;
	public String company;
	public boolean isWorkNow = true;
	
	public Engineer(String name, String company) {
		this.name = name;
		this.company = company;
	}
	
	public void work() {
		this.isWorkNow = true;
		System.out.println("Work!");
	}
	
	public void goToWeekend() {
		this.isWorkNow = false;
		System.out.println("Weekend!");
	}
}
