
 
public class Stats5
 {
    public static void main(String a[])
  {  
 
     double r1= Math.random();
     double r2= Math.random();
     double r3= Math.random();
     double r4= Math.random();
      double r5= Math.random();  
     System.out.println("Random Number in Java: "+ r1);
System.out.println("Random Number in Java: "+ r2);
System.out.println("Random Number in Java: "+ r3);
System.out.println("Random Number in Java: "+ r4);
System.out.println("Random Number in Java: "+ r5);
 System.out.println("avg="+(r1+r2+r3+r4+r5)/5);
   double min=Math.min(r1,Math.min(r2,Math.min(r3,Math.min(r4,r5))));
System.out.println("min Random Number in series: "+ min);
double max=Math.max(r1,Math.max(r2,Math.max(r3,Math.max(r4,r5))));
System.out.println("max Random Number in series: "+ max);

  }
       
  
}

