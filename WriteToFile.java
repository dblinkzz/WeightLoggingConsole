import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class WriteToFile {
	public static void inclinePress(double barbell) throws Exception {
		File dataFile = new File("/home/dblinkzz/StuffWithJava/JuanLifts/InclinePress_barbell.txt");
		PrintWriter fileWriter = new PrintWriter(dataFile);
		fileWriter.printf("%.2f", barbell);
		fileWriter.flush();
	}

	public static void main(String[] args) throws Exception {
		GearConstants barbell = new GearConstants();
		//Scanner systemIn = new Scanner(System.in); 
		double constant1 = barbell.getBarbell();
		WriteToFile.inclinePress(constant1);
	}

} 

