package test1;

public class SampleA {
public int x=1;
public static int y=1;


	public static void main(String[] args) {
		System.out.println("start execution");
		System.out.println(y);
		SampleA a=new SampleA();
			a.test();
			
	}
public void test()
{
	System.out.println(this.x+y);
}
}
