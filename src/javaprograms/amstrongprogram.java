package javaprograms;

public class amstrongprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int remainder = n%10;//153%10=3/15%10=5/1
			rev=rev + remainder*remainder*remainder;//0+18=18//+75//+1=153
			
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println(" is amstrong");
		}
		else
		{
			System.out.println(" is not amstrong");
		}

	}

}
