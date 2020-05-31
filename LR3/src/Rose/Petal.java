package Rose;

public class Petal {
	public static enum Colors {
		Red,
		White,
	}

	public Colors color = Petal.Colors.Red;
	public boolean alive = false;
	
	public Petal() {}
	
	public Petal(Petal.Colors color) {
		this.color = color;
	}
	
	public Petal(Petal.Colors color, boolean alive) {
		this.color = color;
		this.alive = alive;
	}
	
	public void bloom() {
		this.alive = true;
	}
	
	public void wilt() {
		this.alive = false;
	}
	
	@Override
	public String toString() {
		return "color: " + this.color +
				"\nalive: " + this.alive + "\n";
	}
	
	@Override
	public boolean equals(Object petal) {
		return this.color == ((Petal) petal).color && this.alive == ((Petal) petal).alive;
	}
	
	@Override
	public int hashCode() {
		return this.color.hashCode() + (this.alive ? 1 : 0);
	}
}
