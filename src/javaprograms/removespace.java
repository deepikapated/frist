package javaprograms;

public class removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="java  is simple program";
		System.out.println("before remove space......"+str);
		str=str.replaceAll("\\s", "");
		System.out.println("after remove space..."+str);

	}

}
