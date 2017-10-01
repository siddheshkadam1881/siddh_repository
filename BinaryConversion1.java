class BinaryConversion1
{
 public static void main(String args[])
 {  
   
   int n=Integer.parseInt(args[0]);

  int arr[]=new int[32];
  
 for(int i=arr.length-1;i>0;i--)
  {
    arr[i]=0;
  }
 for(int i=arr.length-1;i>0;i--)
 {
  if(n%2==0)
   {
     arr[i]=0; 
     n=n/2;
   }
   else
     {
     arr[i]=1;
     n=n/2;
     }
   if(n<=0)
     {
      break;
     }
  }  
        for(int i=0;i<arr.length;i++)
       {
         if(i%4==0)
          {
             System.out.print(" ");
             System.out.print(arr[i]);
          }
           else
          {
            System.out.print(arr[i]);     
          }
       }
       System.out.println();
}
}
       

    
