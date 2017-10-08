public class DayofStatic
{	
 public static void main(String[] args)
 {
   int date = Integer.parseInt(args[0]); 
   int month = Integer.parseInt(args[1]); 
   int year = Integer.parseInt(args[2]); 
   

    int y = year - (14 - month)/12;
    int x = y + (y/4) - (y/100) + (y/400);
    int m = month + 12 * ((14 - month) / 12)-2;
 //Checks the value associated with Day i.e from 0 to 6 
   int day = (date + x + (31 * m)/12)%7;
  //Prints the day
    daymain.dayFunction(day);            
}
}

 class daymain
{ 
   static int dayFunction(int d)
{
     int day=d;
     if (d == 1)
   { 
     System.out.println("The day is Monday");
   }
     else if (d== 2)
   {
    System.out.println("The day is Tuesday");
   }
      else if (d== 3)
   {
   	System.out.println("The day is Wednesday");
   }
     else if (d== 4)	
   {	
        System.out.println("The day is Thrusday");
   }
    else if (d== 5)
    {
       System.out.println("The day is Friday");
    }	 
       else if (d== 6)
    {		
       System.out.println("The day is Saturday");
    }
        else
        System.out.println("The day is Sunday");
        return d; 
}
}
