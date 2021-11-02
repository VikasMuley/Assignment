package comparatorAssgn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


class Test4 {
	static Scanner sc=new Scanner(System.in);
	static void display() {
		System.out.println("To check details please follow instructions"+"\n"+"1 for Id"+"\n"+"2 for Name" +"\n" +"3 for Marks"+"\n"+"4 for Age"+"\n");
	}



	public static void main(String[] args) {

		ArrayList<Student4> list= new ArrayList<Student4>();
		list.add(new Student4(23,"Vikas",72,27));
		list.add(new Student4(24,"Shubham",88,24));
		list.add(new Student4(19,"Kunal",76,23));
		list.add(new Student4(18,"Shivam",89,28));
		list.add(new Student4(27,"Arun",66,21));
		list.add(new Student4(16,"Rahul",99,25));

		int n=1;
		while(n>=1&&n<=4) {
			display();
			n= sc.nextInt();
			if(n==1) Collections.sort(list, new Id());
			else if(n==2) Collections.sort(list, new Name());
			else if(n==3) Collections.sort(list, new Marks());
			else Collections.sort(list, new Age());
			for (Student4 student4 : list) {
				System.out.println(student4);
			}
			System.out.println("Do you want to sort again?");
			System.out.println("Type"+" "+"Yes"+"/"+"No");
			String st= sc.next();
			if(st.equals("No")) {
			n=5;
			}

		}

	}

}
