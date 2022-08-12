package javaprograms;

public class resverstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="this is deeepika";
		String[] word =str.split(" ");
		String strrev="";
		
		for(String w: word) {
			String revword="";
			for(int i=w.length()-1;i>=0;i--) {
	revword=revword+w.charAt(i);			
			}
			strrev= strrev+revword+" ";
		//System.out.print(strrev);
		
		}
		System.out.print(strrev);
	}

}
