
class TempaturConversion
{
  public static void main(String[] args)
  {
    float temperatue,celsious;
      
 
     temperatue =Float.parseFloat(args[0]);
 
    celsious = ((temperatue - 32)*5/9);
 
    System.out.println("Temperatue in Celsius = " + celsious);
  }
}