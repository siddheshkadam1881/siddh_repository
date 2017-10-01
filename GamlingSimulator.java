class GamlingSimulator1 
{
		 int win=0;
		 int beat=0;
		 int total_count;
     int bets=0;     
    int stake;
    int goal;
    int trails;
           
	public void gamble(int s,int g,int t)
  {
    int stake=s;
    int goal=g;
    int trails=t;
    
       while(trails!=0)
     {
  	   if(Math.random()>0.5)
       {
        stake--;       
        beat++;
        bets++;
        trails--;
      
       }
   	    else
   	   { 
       stake++;
    	 win++;
       bets++;
       trails--;
       }
	   
     }
     check(stake);
  }
     public void check(int stake)
    {
       if(stake==goal)
        {
         System.out.println("congratulation you meet your goal");
         System.out.println("number of times won="+win);
         System.out.println("amount of stake"+stake);
          System.out.println("number of bets="+bets);
         System.out.println("percentage of toal won="+((win*100)/bets));   

      
        }
    
         else if(stake==0)
        { 
         System.out.println("sorry you lose");
         System.out.println("number of bets="+bets);
        }
         
        if(stake>0)
         {       
          System.out.println("amount of stake"+stake);
          System.out.println("number of times won="+win);
          System.out.println("number of bets="+bets);
          System.out.println("percentage of toal won="+((win*100)/bets));   
         }
    }

 }
     class GamlingSimulator
   {
    public static void main(String args[])
		{
       GamlingSimulator1 g1=new GamlingSimulator1();
			 int stake=Integer.parseInt(args[0]);
			  int goal= Integer.parseInt(args[1]);
			  int trails=Integer.parseInt(args[2]);
       g1.gamble(stake,goal,trails);  
  	}
   
} 

 





   

