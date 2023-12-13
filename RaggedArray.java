import java.util.Random;

public class RaggedArray{
	public static void main(String args[]){
		int [][]arr = new int[10][];
		Random rand = new Random();
		for(int i = 0; i < arr.length; i++){
			arr[i] = new int[rand.nextInt(1,9)];
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = rand.nextInt(2);
			}
		}
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}