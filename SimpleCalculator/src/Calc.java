import java.lang.Integer;

public class Calc {

	public static int add (String line){
		line.replace(" ","");
		String[] arr = line.split("\\+");
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += Integer.parseInt(arr[i]);
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println(add("0+31+4+81+9+10"));

	}

}
