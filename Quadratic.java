class Quadratic
  {
     public static void main(String args [])
      {
         double a,b,c;
         double root1,root2;
         double delta;
          a = Double.parseDouble(args [0]);
          b = Double.parseDouble(args [1]);
          c = Double.parseDouble(args [2]);

         System.out.println("The values entered for a,b,c are as follows : "+a+" , "+b+" and "+c+" respectively.");
         System.out.println("The quadratic equation is : "+a+"x^2 + "+b+"x + " +c);
         delta = b*b - 4*a*c;
         System.out.println("The value of delta is : " +delta);

        if(delta>0)
         {
            root1 = -b + (Math.sqrt(delta)/2*a); 
            root2 = -b - (Math.sqrt(delta)/2*a);
           System.out.println("The value of first root of x is : " +root1);
           System.out.println("The value of second root of x is : " +root2); 
         }
        else if(delta == 0)
         {
            System.out.println(" The Roots are real and equal. ");
            root1 = -b + (Math.sqrt(delta)/2*a);
            System.out.println("The value of first root of x is : " +root1);
         }
       else
         {
           System.out.println(" The Roots are imaginery.");
         }
}
}