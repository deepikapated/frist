package javaprograms;

public class revstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="deepika";
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
System.out.print(str1);
	}

}
