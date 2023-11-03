import java.util.StringTokenizer;
public class Tokenizer{
	public static void main(String[] args) {
		String s = "hava/c++/python";
		StringTokenizer st = new StringTokenizer(s,"/");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}