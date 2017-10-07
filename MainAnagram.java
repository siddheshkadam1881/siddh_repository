import java.util.*;
class AnagramPro
{
   String copyOfs1,copyOfs2;
           void isAnagram(String s1, String s2)
	{
		copyOfs1=s1;
                copyOfs2=s2;
		 copyOfs1 = s1.replaceAll("\\s", "");

		 copyOfs2 = s2.replaceAll("\\s", "");

		boolean status = true;

		if(s1.length() != s2.length())
		{
			

			status = false;
		}
		else
		{
			

			char[] s1Array = s1.toLowerCase().toCharArray();

			char[] s2Array = copyOfs2.toLowerCase().toCharArray();

			Arrays.sort(s1Array);

			Arrays.sort(s2Array);

			status = Arrays.equals(s1Array, s2Array);
		}



		if(status)
		{
			System.out.println(s1+" and "+s2+" are anagrams");
		}
		else
		{
			System.out.println(s1+" and "+s2+" are not anagrams");
		}
	}
}

         class MainAnagram
   {

	public static void main(String[] args)
	{
              String copyOfs1=args[0];
              String copyOfs2= args[1]; 
	      AnagramPro an1=new AnagramPro(); 
              an1.isAnagram(copyOfs1,copyOfs2);

	}
   }