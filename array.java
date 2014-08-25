import java.io.*;
import java.util.*;

public class array{
	public static void main(String[] args) throws FileNotFoundException{
		File in = new File(System.getProperty("user.home") + "/Desktop/cs373-collatz/collatz/meta_cache_results.txt");
		PrintWriter out = new PrintWriter(System.getProperty("user.home") + "/Desktop/cs373-collatz/collatz/array.txt");

		Scanner sc = new Scanner(in);

		while(sc.hasNextLine()){
			String s = sc.nextLine();
			String delim = "[ ]+";
			String[] tokens = s.split(delim);
			out.print(tokens[2] + ",");
		}

		out.close();
	}
}