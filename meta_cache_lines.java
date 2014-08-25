import java.io.*;
import java.util.*;

public class meta_cache_lines {

	public static void main(String[] args) throws FileNotFoundException{
		
		PrintWriter file = new PrintWriter(System.getProperty("user.home") + "/Desktop/cs373-collatz/collatz/meta-cache_lines.txt");

		int count = 0;

		while(count < 1000000){
			file.print(count + " ");
			count += 99;
			file.println(count);
			count += 1;
		}
		file.close();

	}
}