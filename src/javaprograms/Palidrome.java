package javaprograms;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int remainder = n%10;
			rev=rev*10 + remainder;
			n=n/10;
		}
		if(temp==rev) {
			System.out.println("is palidrome");
		}
		else
		{
			System.out.println("is not palidrome");
		}
	

	}

}
