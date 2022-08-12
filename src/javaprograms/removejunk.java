package javaprograms;

public class removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="https://www.google.com/search?q=j";
		str=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str);
	}

}
