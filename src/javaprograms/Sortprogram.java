package javaprograms;

public class Sortprogram {

	public static void main(String[] args) {
		int arr[] = {1,2,5,10,3,9,8,4};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[i])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					//System.out.print(temp);
					
				}
				
			}
		}
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+",");
        }

	}

}
