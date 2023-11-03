import java.util.Random;

class Password{
	private int passLength;
	private int charNum[];
	/*  Here charNum[0] denotes num. of number, Char[1] denotes number of Small alphabets,
		charNUm[2] denotes num. of capital letter, and char[3] denotes number of special char
		loop runs till all the character are included atleast once.
	*/
	private char special[] = new char[]{'@','#','$','%','&'};;
	private char ans[];

	public Password(){
		initializeValues();
	}

	//function to set random values within specified range
	void initializeValues(){
		Random rand = new Random();
		passLength = rand.nextInt(8,15);
		ans = new char[passLength];
		charNum = new int[4];
	}

	//PasswordGenerator
	String nextPassword(){
		initializeValues();
		Random rand = new Random();
		int k = 0;
		/*loop runs till every character is included and of desired size*/
		while(k < passLength || charNum[0] == 0 || charNum[1] == 0 || charNum[2] == 0 || charNum[3] == 0){
			int i = rand.nextInt(0,passLength-1);
			int charType = rand.nextInt(4);
			//keep adding new characters till char array is filled
			if(k < passLength){

				//Just as linear hashing, here we avoid collision with already present
				//non null values
				while(ans[i] != '\0'){
					i = (i+1)%passLength;
				}
				setValue(i,charType);
				k += 1;
			}
			//in case array is filled but not every character is included then 
			//loop will continue to run
			else{
				int tmp = (int)ans[i];
				if(tmp >= 47 && tmp <= 56)	charNum[0] -= 1;
				else if(tmp >= 97 && tmp <= 122)	charNum[1] -= 1;
				else if(tmp >= 65 && tmp <= 90) charNum[2] -= 1;
				else charNum[3] -= 1;
				setValue(i,charType);
			}
		}

		String str = new String(ans);
		return str;
	}


	private void setValue(int i,int charType){
		Random rand = new Random();
		switch (charType){
					case 0:
						ans[i] = (char)(rand.nextInt(10) + 48);
						charNum[0] += 1;
						break;
					case 1:
						ans[i] = (char)(rand.nextInt(26) + 97);
						charNum[1] += 1;
						break;
					case 2:
						ans[i] = (char)(rand.nextInt(26) + 65);
						charNum[2] += 1;
						break;
					case 3:
						ans[i] = special[rand.nextInt(4)];
						charNum[3] += 1;
					default:
				}
	}
}

public class PasswordGenerator{
	public static void main(String []args){
		Password pass = new Password();
		for(int i = 0; i < 25; i++){
			System.out.println(pass.nextPassword());
		}
	}
}