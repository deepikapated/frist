package javaprograms;

public class swapnumber {
	public static void main(String[] args) {
		int a=10;
		int b=20;
	/*	int temp;
		System.out.println("before swap"+a+" and"+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println(" after swap"+a+" and"+b);*/
		// with out using thrid varible
		a=a+b;//10+20=30
		b=a-b;//30-20=10
		a=a-b;//30-10=20
		System.out.println("after swaping...."+a+" and"+b);
	}

}