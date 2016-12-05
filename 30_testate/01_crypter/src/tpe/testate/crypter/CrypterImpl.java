package tpe.testate.crypter;

public class CrypterImpl implements Crypter {
	
	/**
	 * Diese Methode verschlüsselt einen String
	 * @author Fabian
	 * @param input - ist der String, der verschlüsselt werden soll
	 * @exception IllegalArgumentException - soll abfangen wenn ungültige Werte eingegeben werden 
	 * @return convertedString - der verschlüsselte String
	 */
	@Override
	public String encrypt(String input) {
		
		
		input = input.toLowerCase();
		String convertedString = "";
		int index = 0;
		int lengthOfString = input.length();
		char [] changer = new char[lengthOfString];
		while (lengthOfString > 0){
			if(input.charAt(index) == 'e'){
				changer[index] = '3';
				index++;
				lengthOfString--;
			} else if(input.charAt(index) == '3'){
				changer[index] = 'e';
				index++;
				lengthOfString--;
			} else if(input.charAt(index) == 'l'){
				changer[index] = '1';
				index++;
				lengthOfString--;
			} else if(input.charAt(index) == '1'){
				changer[index] = 'l';
				index++;
				lengthOfString--;
			} else if(input.charAt(index) == 'o'){
				changer[index] = '0';
				index++;
				lengthOfString--;
			} else if(input.charAt(index) == '0'){
				changer[index] = 'o';
				index++;
				lengthOfString--;
			} else if(input.charAt(index) == 'a'){
				changer[index] = '4';
				index++;
				lengthOfString--;
			} else if(input.charAt(index) == '4'){
				changer[index] = 'a';
				index++;
				lengthOfString--;
			} else if(input.charAt(index) == 't'){
				changer[index] = '7';
				index++;
				lengthOfString--;
			} else if(input.charAt(index) == '7'){
				changer[index] = 't';
				index++;
				lengthOfString--;
			} else if(input.charAt(index) < 48 & input.charAt(index) > 57 & input.charAt(index) < 97 & input.charAt(index) >122) {
				index++;
				lengthOfString--;
			} else {
				changer[index] = input.charAt(index);
				index++;
				lengthOfString--;
			}
		}
		
		int lengthNew = input.length();
		int index2 = 0;
		while (lengthNew > 0){
			convertedString += changer[index2];
			index2++;
			lengthNew--;
		}
		
		return convertedString;
	}

	/**
	 * Diese Methode entschlüsselt einen String
	 * @author Fabian
	 * @param input - ist der String, der entschlüsselt werden soll
	 * @exception IllegalArgumentException - soll abfangen wenn ungültige Werte eingegeben werden 
	 * @return convertedString - der entschlüsselte String
	 */
	@Override
	public String decrypt(String input) throws IllegalArgumentException {
		int length = input.length();
		
		for(int i = 0; i < length; i++){
			if(input.charAt(i) >= 48 & input.charAt(i) <= 122){
				
			} else {
				throw new IllegalArgumentException();
			}if(input.charAt(i) >= 65 && input.charAt(i) <= 90){
				throw new IllegalArgumentException();
			}
		}
		String convertedString = encrypt(input);
		return convertedString;
		
	}
}

