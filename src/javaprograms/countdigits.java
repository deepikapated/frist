package javaprograms;

public class countdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2354678;
	int	count=0;

	while(n>0) {
		 n=n/10;
		count++;
	}
	System.out.println(count);
	}

}
