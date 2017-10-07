 class NoStringFunctions
{
   static boolean isPalindrome(String str1)
      {
            boolean mmPalindrome = false;
            int length1 = str1.length();
            for(int i = 0,j = length1- 1;i < j;i++,j--)
         {
            if(str1.charAt(i) == str1.charAt(j))
            {

                mmPalindrome = true;
                break;
            }
          }
          
             return mmPalindrome;
       }   


         public static void main(String args[])
       {

            String mString1 = args[0];
            String mString2 = args[1];
            boolean mPalindrome = isPalindrome(mString1);

            if (mPalindrome == true)
          {  
            System.out.println("String is Palindrome");
          }
             else
          {
             System.out.println("String is not Palindrome");
          }
    
         
        }
  }