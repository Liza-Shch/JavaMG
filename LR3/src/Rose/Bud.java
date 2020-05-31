package Rose;

public class Bud {
	public Petal[] petals;
	
	public Bud(int petalsCount) {
		this.petals = new Petal[petalsCount];
		for (int i = 0; i < petalsCount; i++) {
			this.petals[i] = new Petal();
		}
	}
	
	public Bud(int petalsCount, Petal.Colors color) {
		this.petals = new Petal[petalsCount];
		for (int i = 0; i < petalsCount; i++) {
			this.petals[i] = new Petal(color);
		}
	}
	
	public void bloom() {
		for (int i = 0; i < this.petals.length; i++) {
			this.petals[i].bloom();
		}
	}
	
	public void wilt() {
		for (int i = 0; i < this.petals.length; i++) {
			this.petals[i].wilt();
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < this.petals.length; i++) {
			result += this.petals[i].toString();
		}
		
		return result;
	}
	
	@Override
	public boolean equals(Object o) {
		Bud bud = (Bud) o;
		boolean isEqualCount = this.petals.length == bud.petals.length;
		if (!isEqualCount) {
			return false;
		}
		
		boolean isEqual = true;
		for (int i = 0; (i < this.petals.length) && isEqual; i++) {
			isEqual = this.petals[i].equals(bud.petals[i]);
		}
		
		return isEqual;
	}
	
	@Override
	public int hashCode() {
		int result = 0;
		for (int i = 0; i < this.petals.length; i++) {
			result += this.petals[i].hashCode();
		}
		
		return result;
	}
}
