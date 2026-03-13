import java.lang.String;
class check_equal
{
	public static void main(String args[])
	{
	   String s1 = "Hello";
	   String s2 = new String("Hello");
	   String s3 = "Hello";
	   String s4 = "HELLO";
	   String s5 = new String(s1);
	   System.out.println(s1.equals(s2));//true checks only the content!   
	   System.out.println(s1.equals(s3));//truea
	   System.out.println(s1.equals(s4));//false
	   System.out.println(s1.equals(s5));//true
       System.out.println("\n\n");//
	   System.out.println(s1==s2);
	   System.out.println(s1==s3);
	   System.out.println(s1==s4);
	   System.out.println(s1==s5);
	   System.out.println(s1.equalsIgnoreCase(s4));//TRUE
	}
}