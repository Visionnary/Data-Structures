import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException {

		File myObj = new File(/*"C:\\Users\\ultra\\eclipse-workspace\\DataStructures_FateGO\\src\\"*/ "ServantDatabase.csv");
		Scanner myReader = new Scanner(myObj);
		Scanner input = new Scanner(System.in);

		System.out.println("Input characteristics");
		
		String space = " ";
		String Name = input.nextLine();
		String Class = input.nextLine();
		String Rank = input.nextLine();
		String NP = input.nextLine();
		Double AttackValue = input.nextDouble();
		
		System.out.println("Press 1 to enter servant into database, press 2 to identify servant, press 3 to see servant attack value, "
				+ "press 4 to see servant database, press 5 to clear database");
		
		int user = input.nextInt();
		Servant servant = new Servant(Name, Class, Rank, NP);
		Identify type = new Identify(Name, Class, Rank, NP);
		Attack attackValue = new Attack(Name, Class, Rank, NP, AttackValue);		

		
		
		if(user == 1) {	
			try(BufferedWriter writer = new BufferedWriter(new FileWriter(/*"C:\\Users\\ultra\\eclipse-workspace\\DataStructures_FateGO\\"
					+  "src\\*/"ServantDatabase.csv", true));
					BufferedWriter bw = new BufferedWriter(writer);
					PrintWriter output = new PrintWriter(bw))
			{
				
				output.println(servant.toCsv());
				output.println(" ");
				
			}
			catch (IOException e)
			{
				System.out.println("Exception ");
			}
		}
		else if(user == 2) {

			System.out.println(type);
		}
		else if (user == 3) {
			System.out.println(attackValue);
		}
		else if(user == 4) {
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();	
		}
		else if(user == 5) {
			BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\ultra\\eclipse-workspace\\DataStructures_FateGO\\"
					+ "src\\ServantDatabase.csv", false));
			writer.append("");
				
			}
		}
	

	private static char[] Servant(String name, String class1, String rank, String nP) {
		return null;
	}
}

