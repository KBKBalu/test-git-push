package sample;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a={1,2,3};
		int i,k=0,temp;
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	i=0;
	k=a.length-1;
		 while(i<k)
	       {
	           temp = a[i];
	           a[i] = a[k];
	           a[k] = temp;
	           i++;
	           k--;
	       }

for(k=0;k<a.length;k++)
{
	System.out.println(a[k]);
}
}
}
