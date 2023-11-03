import java.io.FileReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class readCSV{
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("emp.csv"))){
			String line;
			while((line = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(line,",");
				while(st.hasMoreTokens())
					System.out.print(st.nextToken()+"\t");
				System.out.println();
			}
		} catch(IOException e){
			e.printStackTrace();
		}
	}
}