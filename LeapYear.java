
public class LeapYear
{
    public static void main(String[] args)
 {  
    
    int year =Integer.parseInt(args[0]); 
    if (year > 1582)
    {

    if (((year%4)== 0) && ((year%100)==0) && ((year%400)==0)) {
        System.out.print("That year was a leap year");
    }
    else if (((year%4)== 0) && ((year%100)==0) && ((year%400)!=0)){
        System.out.println("This year was not a leap year");
    }
    else if ((year%4)== 0){
        System.out.print("This year was a leap year");
    }
    else 
        System.out.print("This year was not a leap year");
    }
    else 
       System.out.print ("Please enter a year after 1582");
    }
}