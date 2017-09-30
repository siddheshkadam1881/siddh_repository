import java.util.Random;

class RollDie1
 {
	static int n;
	public static void main(String args[])
{
        Random random = new Random();  
        int number= Integer.parseInt(args[0]);
        int mDice[] = new int[number];       
        int Side1 = 0, Side2 = 0, Side3 = 0, Side4 = 0, Side5 = 0, Side6 = 0;
       
        for(int i = 0; i < number-1; i++) 	
          {
             mDice[i] =( random.nextInt(6) + 1);

            	switch (mDice[i]){
                case 1: Side1++;
                        break;
                case 2: Side2++;
                        break;
                case 3: Side3++;
                        break;
                case 4: Side4++;
                        break;
                case 5: Side5++;
                        break;
                case 6: Side6++;
                          break;
   } 
           
		
   }
        double max1=Math.max(Side1,Math.max(Side2,Math.max(Side3,Math.max(Side4,Math.max(Side5,Side6)))));
System.out.println("max Random Number in series: "+ max1);
        
        	}

   	}