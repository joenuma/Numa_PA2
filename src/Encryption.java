public class Encryption {
	public static String encrypt(String num) {
		String gen ="";
		for(int i=0; i<num.length();i++) {
			int rep = ((Integer.parseInt(num.charAt(i)+""))+7)%10;
			gen = gen + rep;
		}
		String encrypt = gen.charAt(2)+""+gen.charAt(3)+""+gen.charAt(0)+""+gen.charAt(1)+"";
		
		
		return encrypt;
		
	}
}
