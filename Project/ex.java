import java.util.*;
import java.lang.*;
class ex
{
	public static void main(String args[])
	{
		int arr[]={5,6,5,2,1,7,9,7,2,5};
		ArrayList<Integer>ar=new ArrayList<>();
		//ar.add(arr[0]);
		for(int i=0;i<10;i++)
		{
			ar.add(arr[i]);
		}
		for(int i=1;i<9;i++)
		{
			if(arr[i-1]%2==0 && arr[i+1]%2==0)
			{
				int chng=(arr[i-1]+arr[i+1])/2;
				ar.add(i,chng);
			}
		}
		System.out.println(ar);
		int i=0;
		int j=9;
		int sum1=0,sum2=0;
		while(i<=j)
		{
			sum1+=ar.get(i);
			sum2+=ar.get(j);
			i++;
			j--;
		}
		System.out.println(Math.abs(sum1-sum2));
			
	}
}