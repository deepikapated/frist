package javaprograms;

import java.util.Scanner;

public class countsthewords {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string ");
		String str= sc.nextLine();
		
		int cout=1;// deepika c
		for(int i=0;i<str.length()-1;i++) {
			if((str.charAt(i)==' ')&&(str.charAt(i+1)!=' ')) {
				cout++;
			}
		}
		System.out.println(cout);
		// TODO Auto-generated method stub

	}

}
