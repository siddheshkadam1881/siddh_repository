class NoSuchMethodErrorException extends Exception
{
  public NoSuchMethodErrorException()
      {}
  public NoSuchMethodErrorException(String s)
   { super(s);}
}
public class MethodError
{
   public static void main(String[] arg)
{
 int age=Integer.parseInt(arg[0]);

     try
         {

         if(age<18)
         {
        throw new NoSuchMethodErrorException("enter valid age");
          }
      }
     
   catch(Exception e)
   {
     System.out.println(e);
   }
    
}
}
       
