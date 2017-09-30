


public class PowerOf2{
public static void main(String args[]){
//read in one command line argument
	int n=Integer.parseInt(args[0]);
	int i=0;
 	int power=1;
//repeat until i equals n
	 while(i<=n){
	System.out.println("2^"+i+"="+power); //print out the power of two 
		power=(power*2);	     //double to get the next
		i++;
		}
}
}
