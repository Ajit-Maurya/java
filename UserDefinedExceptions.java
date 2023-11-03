import java.lang.Exception;
import java.util.Scanner;

class InvalidDayException extends Exception{
	public String toString(){
		return "Invalid Day";
	}
	public InvalidDayException(){
		super();
	}
}


class InvalidYearException extends Exception{
	public String toString(){
		return "Invalid year";
	}
	public InvalidYearException(){
		super();
	}
}



public class UserDefinedExceptions {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		try{
			validateDate(input);
		}	catch(InvalidDayException e){
				System.out.println(e);
				e.printStackTrace();
		}	catch(InvalidYearException e){
			System.out.println(e);
			
		}
		finally{
			sc.close();
		}
	}

	static void validateDate(String date) throws InvalidDayException,InvalidYearException{
		String tarik[] = date.split("-");
		int year = Integer.parseInt(tarik[2]);
		int day = Integer.parseInt(tarik[0]);

		if(year > 23 || year < 21)
			throw new InvalidYearException();
		if(day >12 || day < 9)
			throw new InvalidDayException();
	}


}