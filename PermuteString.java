/******************************************************************************
 *  Compilation:  javac -d bin PermuteString.java
 *  Execution:    java -cp bin com.bridgelabz.util.PermuteString  s1
 *  
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  siddheshwar kadam
 *  @version 1.0
 *  @since   06-08-2017
 *
 *****************************************************************************/
package com.bridgelabz.util;
class PermuteString
 {
        public static void main(String args[]) 
     {
        String s1=args[0];
        permuteString("", s1);
  
     }
        public static void permuteString(String beginningString, String endingString) 
     {
        if(endingString.length() <= 1)
        System.out.println(beginningString + endingString);
        else
        for (int i = 0; i < endingString.length(); i++)
     {
         try 
        {
          String newString = endingString.substring(0, i) + endingString.substring(i + 1);

          permuteString(beginningString + endingString.charAt(i), newString);
        }
          catch (StringIndexOutOfBoundsException exception)
        {
          exception.printStackTrace();
        }
     }
    }
 }
