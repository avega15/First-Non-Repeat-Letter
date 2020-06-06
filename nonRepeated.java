import java.util.HashMap;


//This program finds the first non repeated character in a word
public class nonRepeated{
	public static void main(String[] args) {
		//Filler words
		String[] words = {
			"Apple", 
			"Dad", 
			"Tarantula",
			"Abara"
			};
			
		//Iterating through words and applying our method across each.
		for(int i = 0; i < words.length; i++){
			System.out.println("The first non-repeated character is: " + firstNonRepeatedCharacter(words[i]));
		}
	}
	
	
	public static Character firstNonRepeatedCharacter(String str) {
		//We can easily keep count of each letter using a hashmap.
		//The letter is the key and the value is the count.
		HashMap<Character, Integer> map = new HashMap<>();		
		
		//Iterates through each letter in the passed in word.
		for(int i = 0; i < str.length(); i++){
			char letter = str.charAt(i);
			
			//If the map contains the letter then add 1 to its count
			if(map.containsKey(letter)){
				map.put(letter, map.get(letter) + 1);
				
			//If there is no letter in the map then add it to the map.
			}else{
				map.put(letter, 1);
			}
		}
		
		//Iterates through the letters in the word
		for(int i = 0; i < str.length(); i++){
			char letter = str.charAt(i);
			//If the value of the letter is 1 then return it.
			if(map.get(letter) == 1){
				return letter;
			}
		}
		//If there are no non-repeated letters then return null.
		return null;

	}
	
}

