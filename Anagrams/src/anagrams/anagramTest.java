package anagrams;
import java.util.Scanner;
public class anagramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word1 = sc.nextLine();
		String word2 = sc.nextLine();
		sc.close();

		boolean isAnagram = true;
		String copyWord2 = word2;
		int lengthWord1 = word1.length();

		for (int i = 0; i < lengthWord1; i++){
		char charInWord1 = word1.charAt(i);
		if (charInWord1 >= 'a' && charInWord1 <= 'z'
		|| charInWord1 >= 'A' && charInWord1 <= 'Z'){
		int positionInWord2 = copyWord2.indexOf(charInWord1);
		if (positionInWord2 == -1){
		isAnagram = false;
		break;
		}else {
		copyWord2 = copyWord2.substring(0, positionInWord2)
		+ copyWord2.substring(positionInWord2 + 1);

		}
		}
		}
		if (isAnagram){
		int charsLeftWord2 = copyWord2.length();
		for (int i = 0; i < charsLeftWord2; i++){
		char currentChar = copyWord2.charAt(i);
		  if (currentChar >= 'a' && currentChar <= 'z'
		 || currentChar >= 'A' && currentChar <= 'Z') {
		 isAnagram = false;
		 break;
		  }
		}
		}
		System.out.println(isAnagram ? "is anagram" : "is not an anagram");
		}

		}
