package comparatorAssgn;

import java.util.Comparator;

public class Marks implements Comparator<Student4>{

	@Override
	public int compare(Student4 o1, Student4 o2) {
		return o1.marks-o2.marks;
	}

}
