package test;

import java.util.LinkedList;
import java.util.List;

public class SampleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> x = new LinkedList<>();

x.add(10);
x.add(29);
x.add(22);
System.out.println(x);

x.add(1, 40);
System.out.println(x);

System.out.println(x.size(3));

	}

}
