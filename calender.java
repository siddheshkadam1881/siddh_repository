
public class Calender
{
 public static void main(String[] args)
 {
   Daymain  dm1=new Daymain();
   int date = Integer.parseInt(args[0]); 
   int month = Integer.parseInt(args[1]); 
   int year = Integer.parseInt(args[2]); 
   

    int y = year - (14 - month)/12;
    int x = y + (y/4) - (y/100) + (y/400);
    int m = month + 12 * ((14 - month) / 12)-2;
    //Checks the value associated with Day i.e from 0 to 6 
    int day = (date + x + (31 * m)/12)%7;
    //Prints the day
    dm1.dayFunction(day);
    
    String month[]={jan,feb,march,apr,may,june,july,aug,sep,act,nov,dec};
    String day1[]={su,m,t,w,th,f,st};
    
     for(int i=1;i<day1.length;i++)
     {
      System.out.println(day1[i]);
     } 
   }

            
}
}

 class Daymain
{ 
   int dayFunction(int d)
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
 
   
