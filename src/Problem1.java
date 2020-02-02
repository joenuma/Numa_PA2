/*Three step problem 
 * steps can be done in any order 
 * step 1 to encrypt the digits entered by the user and display it 
 * step 2 is to decrypt the digits and print it to the screen 
 * last check if at least 4 digits where entered  */

import java.util.Scanner;
public class Problem1{
	
public static void main(String[] args){
		System.out.print("Please Enter Four Digits to be encrypted : ");
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		if(num.length()!=4) {
			System.out.println("4 digits where not entered please try again: ");
			String num1 = scan.nextLine();
			
	}
		 Encryption encrypter = new Encryption();
	       
	       String encrypt = encrypter.encrypt(num);
	       System.out.println( "Encrypted value : "+encrypt);
	       Decryption decrypt = new Decryption();
	       String decrpt = decrypt.decrypt(encrypt);
	       System.out.println("Decrypted value : "+decrpt);
		
 }
}