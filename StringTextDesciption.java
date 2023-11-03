import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class TextDescription {

	public static void detail(String para){
		int charCount = 0,lineCount = 0,wordcount = 0;

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
			}
		} catch (IOException e){
			e.printStackTrace();
		}

		System.out.println("No. of Characters in given paragraph : " + Integer.toString(charCount));
		System.out.println("No. of words in given paragraph : " + Integer.toString(wordcount));
		System.out.println("No. of lines in given paragraph : " + Integer.toString(lineCount));
	}
}

public class StringTextDesciption{

	public static void main(String[] args) {
		String input = "poem.txt.txt";
		TextDescription.detail(input);
	}
}