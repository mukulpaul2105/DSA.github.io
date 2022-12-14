package Easy;

public class CheckIfTheSentenceIsPangram1832 {

	public static boolean checkIfPangram(String sentence) {
		
		int[] freqArr = new int[26];
		
        if(sentence.length() < 26) {
            return false;
        }
        
        for(char x : sentence.toCharArray()) {
            freqArr[x - 'a']++;
        }
        
        for(int i = 0; i < 26; i++) {
            if(freqArr[i] == 0) {
                return false;
            }
        }
        return true;
	}
	
	public static void main(String[] args) {
		String str = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(str));
	}
	
}
