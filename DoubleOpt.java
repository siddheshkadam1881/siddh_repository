class DoubleOpt
{
  public static void main(String args[])
{
  double a=Double.parseDouble(args[0]);
  double b=Double.parseDouble(args[1]);
  double c=Double.parseDouble(args[2]);
    Double d= a+(b*c);
   System.out.println("calculation of 1:"+ d); 
    Double e=(a*b)+c;
   System.out.println("calculation of 2:"+ e); 
    Double f=c+(a/b);
   System.out.println("calculation of 3:"+ f);
    Double g=(a%b)+c;
   System.out.println("calculation of 4:"+ g);
      
}
}
    

      