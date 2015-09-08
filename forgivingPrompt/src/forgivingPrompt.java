import java.util.Scanner;

public class forgivingPrompt {

	public static boolean questionaire(String question){
		System.out.println(question);
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		response = response.toLowerCase();
		
		while(!(response.equals("y") || response.equals("yes") || response.equals("yep") 
				|| response.equals("n") || response.equals("no") || response.equals("nope"))){
			System.out.println(question);
			response = in.nextLine();
			response = response.toLowerCase();
		}
		
		if(response.equals("n") || response.equals("no") || response.equals("nope")){
			in.close();
			return false;
		}
		else if(response.equals("y") || response.equals("yes") || response.equals("yep")){
			in.close();
			return true;
			}
		in.close();
		return false;
		}//questionaire
		
	
	public static void main(String[] args) {
		if(questionaire("Are you male?")){
			System.out.println("I am true");
		}else{
			System.out.println("I am false");
		}

	}

}
