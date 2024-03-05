package test;

public class SampleB extends SampleA {

	public static void main(String[] args) {
		SampleB b=new SampleB();
		b.cal(1,1);
		
	}
    @Override
public void cal(int a,int b)
{
	System.out.println((a+a+a)+(b+b+b));
}
}
