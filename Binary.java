public class Binary{
     
     public static void main(String[] args) {
            
          
      int  binarynum =Integer.parseInt(args[0]);
      int binary=binarynum;
            
    int decimal = 0;
    int power = 0;
     
    while(true){
     
     if(binary == 0){
     
            break;
     
     } else {
     
       int tmp = binary%10;
       decimal += tmp*Math.pow(2, power);
       binary = binary/10;
       power++;
     
     }
    }
            System.out.println("Binarynum="+binarynum+" Decimal="+decimal); ;
    }
     
}