class Flip 
  {
  
     public static void main( String[] args)
         { 
           int flipTimes;
           int headTimes=0;
            int tailTimes=0;
            int headsPercent;
            int tailsPercent;
            int totalTimes=0;
            int ctr;
           flipTimes=Integer.parseInt(args[0]);
           
         for(ctr=1;ctr<=flipTimes;ctr++)
          {
             if(Math.random()<0.5) 
              {
                headTimes++;
	          }
            else
               {
                 tailTimes++;
               }
                 totalTimes++;
          }
                   System.out.println("number of times the coin is flipped is="+totalTimes);
                   System.out.println("number of  heads appeared is=" +headTimes); 
		   System.out.println("where number of tails are= " +tailTimes);

                   headsPercent=(headTimes*100)/totalTimes;
                   tailsPercent=(tailTimes*100)/totalTimes;

                   System.out.println("percent of the heads appear is" +headsPercent);

			System.out.println("where as percent of tails appear is" +tailsPercent);
	         }
          }  
   

