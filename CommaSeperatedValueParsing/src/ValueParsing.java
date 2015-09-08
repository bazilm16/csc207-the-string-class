

public class ValueParsing {

	public static String parseName(String s){
		int pos = s.indexOf(',');
		String name = s.substring(pos + 1, s.length() - 1) + " " + s.substring(0,pos);
		return name.replace(',', ' ');
		
	}//ValueParsing
	
	public static void main(String[] args) {
		System.out.println(parseName("Turing,Alan,Mathison"));

	}//main

}
