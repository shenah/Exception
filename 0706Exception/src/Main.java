
public class Main {

	public static void main(String[] args) {
		int [] ar = {10, 30, 70, 40, 15};
		int length = ar.length;
		int i = 0;
		int max = i;
		for(i=0; i<length-1; i=i+1)
		{
			
			if(ar[max]<ar[i+1])
			{
				max = i + 1;
			}
			else
				max = i;
		}
		System.out.println(max);
		
		/*int max = ar[0];
		int idx = 0;
		int size = ar.length;
		int i;
		for(i=1; i<length-1; i=i+1)
		{
			
			if(max<ar[i])
			{
				max = a[i];
				idx = i;
			}
		}
		System.out.println(idx);*/
		
		int idx = 50;
		int compare, min;
		for(i=0;i<length; i=i+1)
		{
			if(ar[i]<idx){
				compare = idx - ar[i];
			}
			else {
				compare = idx - ar[i];
			}
				
		}
	}


}
