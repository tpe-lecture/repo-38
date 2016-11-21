package tpe.testate.crypter;

public class CrypterImpl implements Crypter {
	
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
}

