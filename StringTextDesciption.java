import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class TextDescription {

	public static void detail(String para){
		int charCount = 0,lineCount = 0,wordcount = 0;

		StringBuilder sentenceCase = new StringBuilder();
		StringBuilder reversedSentence = new StringBuilder();
		StringBuilder reversedWords = new StringBuilder();

		try(BufferedReader br = new BufferedReader(new FileReader(para))){
			String line;
			while((line = br.readLine()) != null){
				lineCount += 1;	//number of lines
				//splitting string into string array
				String words[] = line.split("[\\s,\\.]");
				for(String word : words){
					wordcount += 1;
					charCount += word.length();
				}

				String updatedline = convertToSentenceCase(words);
				sentenceCase.append(updatedline);

				words = updatedline.split("[\\s,\\.]");
				updatedline = reverseSentence(words);
				reversedSentence.append(updatedline);

				words = updatedline.split("[\\s,\\.]");
				updatedline = reverseWords(words);
				reversedWords.append(updatedline);
			}
		} catch (IOException e){
			e.printStackTrace();
		}

		System.out.println("No. of Characters in given paragraph : " + Integer.toString(charCount));
		System.out.println("No. of words in given paragraph : " + Integer.toString(wordcount));
		System.out.println("No. of lines in given paragraph : " + Integer.toString(lineCount));
		System.out.println("After sentence case conversion\n" + sentenceCase.toString());
		System.out.println("After reversing the sentence\n" + reversedSentence.toString());
		System.out.println("After reversing each word\n" + reversedWords.toString());
	}

	private static String convertToSentenceCase(String[] words){
		StringBuilder sentenceCase = new StringBuilder();
		for(int i = 0; i < words.length; i++){
			String word = words[i];

			if(i==0){
				sentenceCase.append(word.substring(0,1).toUpperCase());
				sentenceCase.append(word.substring(1).toLowerCase());
			}
			else{
				sentenceCase.append(word.toLowerCase());
			}

			if(i < words.length - 1)	sentenceCase.append(" ");
			else sentenceCase.append(".\n");
		}

		return sentenceCase.toString();
	}

	private static String reverseSentence(String words[]){
		StringBuilder sentence = new StringBuilder();
		for(int i = words.length - 1; i >= 0; i--){
			sentence.append(words[i]);
			if(i > 0)	sentence.append(" ");
			else sentence.append(".\n");
		}

		return sentence.toString();
	}

	private static String reverseWords(String words[]){
		StringBuilder sentence = new StringBuilder();
		for(int i = 0; i < words.length; i++){
			StringBuilder sb = new StringBuilder(words[i]);
			sentence.append(sb.reverse());
			if(i < words.length - 1)	sentence.append(" ");
			else sentence.append(".\n");
		}

		return sentence.toString();
	}
}

public class StringTextDesciption{

	public static void main(String[] args) {
		String input = "poem.txt.txt";
		TextDescription.detail(input);
	}
}