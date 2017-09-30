 
 public class HarmonicNumber

{
	public static void main(String args[])
{
		
       int num=Integer.parseInt(args[0]);
	int i;
		for(i=1;i<=num;i++){
	
			System.out.print("1/"+i);
			if(i<num){
				System.out.print("  +  ");
			}
		}
		
	}
}