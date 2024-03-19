package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SampleB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> x = new LinkedList<Integer>();
List<String> y = new ArrayList<String>();

x.add(10);
x.add(20);
x.add(30);
 //System.out.println(x);
 
 x.add(3, 40);
 //System.out.println(x);
 
 x.size();
 //System.out.println( x.size());
 
 //System.out.println(x.get(3));
 
 x.set(1,200);
 //System.out.println(x);
 
 
 System.out.println(x.indexOf(30));
	}

}
