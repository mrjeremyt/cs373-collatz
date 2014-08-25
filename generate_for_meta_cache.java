import java.io.*;
import java.util.*;
public class generate_for_meta_cache{
	final static int MAX = 13000;
	public static void main(String[] args)throws FileNotFoundException {
		PrintWriter file = new PrintWriter(System.getProperty("user.home") + "/Desktop/cs373-collatz/collatz/meta_cache_lines.txt");

		int c = 1;
		while(c <= MAX){
			file.println(c + " " + c);
			c++;
		}
		file.close();
	}
}