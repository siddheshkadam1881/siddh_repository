public class RepeatedNumber{

   public static void main(String[] args) {
          
          
    int a1[]={10,20,20,30,40,50,60};
           
          
   	 for (int i=1;i<=a1.length;i++)
   	 {
   	 	for (int j=i+1; j<=a1.length-1; j++)
   	 	{
   	 		if(a1[i]==a1[j]) 
   	 		{
   	 			System.out.println("Repeated number is:"+a1[j]);
   	 		}
   	 	}
   	 }
}
}

