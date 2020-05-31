package Optional;

import java.util.ArrayList;

public class Archive {
	public ArrayList<Mark> marks = new ArrayList<Mark>();
	
	public void addMark(Mark mark) {
		this.marks.add(mark);
	}
}
