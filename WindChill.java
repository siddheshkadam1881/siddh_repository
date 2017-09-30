public class WindChill

{
   public static void main(String args[]){

 
		double mTemp=Double.parseDouble(args[0]);
		double mVelocity=Double.parseDouble(args[1]);
		double windchill ;

	
                 if(mTemp<=50&&(mVelocity<120 || 3< mVelocity))
                  {
                 double w=((35.74+0.6215)+((0.4275*mTemp-35.75)*Math.pow(mVelocity,0.16)));
			System.out.println("answer is"+w);
		}
		else
		System.out.println("temperature is greater than 50"); 	
		}
}

