 public class PrimeRange 
{
     static int input1,input2;
     static int flag=0, i,j;
      
       public static void main ( String[] args) {    
            
      input1=Integer.parseInt(args[0]);

       input2=Integer.parseInt(args[1]); 
       for(i=input1; i<=input2; i++)
        {
                  for(j=2; j<i;j++)
                   {
                     if(i%j==0)
                     {
                        flag=0;
                        break;
                     }
                   else
                    {
                        flag=1;
                    }
           }
           if(flag==1)
            {
             System.out.println(i);
               }
            }
        }
}
    
