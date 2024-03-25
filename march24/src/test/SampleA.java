package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;



public class SampleA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> x = new LinkedList<>();

Integer[] y = {1,2,3,4,5,6,7};

x.addAll(Arrays.asList(y));
System.out.println(x);


x.remove(1);
System.out.println(x);

x.removeAll(Arrays.asList(4,5));

x.clear();

System.out.println(x.isEmpty());
System.out.println(x);






	}

}
