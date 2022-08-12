package javaprograms;

public class Countevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23456;
		int even=0;
		int odd=0;
		while(n>0) {
			int sum=n%10;
			if(sum%2==0) {
				even++;
			}
			else
			{
				odd++;
			}
			n=n/10;
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
