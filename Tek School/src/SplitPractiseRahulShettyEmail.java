
public class SplitPractiseRahulShettyEmail {

	public static void main(String[] args) {
		
//		String str="Please email us at mentor@rahulshettyacademy.com with below template to receive response";
//		
//		String[] split= str.split("at");
//		String string=split[1];
//		System.out.println(string);
//		String[] split2= string.split("with");
//		String string2=split2[0];
//		System.out.println(string2.trim());

		
		//or we can do it like below since above code has many line of codes
		
		String str1="Please email us at mentor@rahulshettyacademy.com with below template to receive response".split("at")[1].split("with")[0].trim();
	    System.out.println(str1);
	}

}
