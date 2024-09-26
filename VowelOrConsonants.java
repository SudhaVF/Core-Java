class VowelOrConsonants {
	static void vowel_or_consonants(char y){
		if (y == 'a' || y == 'e' || y == 'i' || y == 'o' || y == 'u')
			System.out.println("It is Vowel");
		else
			System.out.println("It is Consonants");
	}
	public static void main(String[] args){
		vowel_or_consonants('b');
	}
}