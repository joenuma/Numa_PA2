public class Decryption {
	public  String decrypt(String num) {
		String gen = "";
		for(int i=0; i<num.length();i++) {
			int rep =((Integer.parseInt(num.charAt(i)+""))-7);
			if(rep<0) {
				rep +=10;
				gen =gen+rep;
			}
			
		}
	
	String decrypted =gen.charAt(2)+""+gen.charAt(3)+""+gen.charAt(0)+""+gen.charAt(1)+"";
	return decrypted;
	}
	
}