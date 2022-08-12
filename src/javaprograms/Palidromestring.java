package javaprograms;

public class Palidromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="mam";
		String str2=str;
		String str1="";
		for(int i=str.length()-1;i>=0;i--) {
			str1=str1+str.charAt(i);
		}
if(str2.equals(str1)) {
	System.out.println("is palidrome");
}
else
{
	System.out.println("is not palidrome ");
}
	}
	}


