import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pr31 {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner xb = new Scanner(new File("pr31.dat"));
		int lines = xb.nextInt();
		xb.nextLine();

		while (lines-- > 0) {
			int count = 0;
			String str = xb.nextLine();			
			String first = str.substring(0, 1);
			for(int i = 0; i < str.length(); i++) {
				if(first.equals((str.substring(i, i + 1)))) {
					count++;
				}
				
			}
			
		
			
			System.out.println(str.charAt(0) + ": " + count);
		}		
		
	}
}
