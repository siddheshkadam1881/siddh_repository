public class Trig {
    public static void main(String[] args) {
       
       double degrees=Double.parseDouble(args[0]);      
       double radians=Math.toRadians(degrees);
       
      
       double s=Math.sin(radians);
     
       System.out.println("sin("+degrees+")="+s);
       
       double c=Math.cos(radians);
       
       System.out.println("cos("+degrees+")="+c);
       
       double t=Math.tan(radians);
     
       System.out.println("tan("+degrees+")="+t);
       System.out.println("s/c="+s/c);
       
       Double r=s*s+c*c;
       //prints the result.
       System.out.println(s*s+"+"+c*c+"="+r);
  


    }

}