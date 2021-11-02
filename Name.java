package comparatorAssgn;

import java.util.Comparator;

 class Name implements Comparator<Student4>{

	@Override
	public int compare(Student4 o1, Student4 o2) {
		return o1.name.compareTo(o2.name);
	}
	

}
