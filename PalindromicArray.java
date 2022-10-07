// driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
           

    {

     for(int i=0;i<n;i++){

         int ans=0;

         int result=0;

         int p=a[i];

         while(p!=0){

             ans=p%10;

             result=result*10+ans;

             p=p/10;

         }

         if(a[i]!=result){

             return 0;

         }

     }

     return 1;

    }

};