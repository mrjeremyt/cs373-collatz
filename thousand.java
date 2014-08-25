import java.io.*;
import java.util.*;

public class thousand {
	

	public static void main(String[] args) throws FileNotFoundException{

		final int MAX_VALUE = 997;
		final int FULL_VALUE = 999999;

		int[] range = new int[]{100000, 200000, 300000, 400000, 500000, 600000, 700000, 800000, 900000, 999999};

		PrintWriter file = new PrintWriter(System.getProperty("user.home") + "/Desktop/cs373-collatz/collatz/jmt2939-RunCollatz.in");

		int count = 0;


		//i > j
		file.println("100 50");
		count++;

		//i == j
		file.print("500000 500000");
		count++;

		Random rand = new Random();
		

		for(int j = 0; j < range.length; j++){

			for(int i = 0; i < 99; i++){

				int alpha = rand.nextInt(range[j]) + 1;
				int bravo = rand.nextInt(range[j]) + 1;

				file.println();

				file.print(bravo + " " + alpha);
				count++;
			}
		}

		while(count < 999){
			int alpha = rand.nextInt(FULL_VALUE) + 1;
			int bravo = rand.nextInt(FULL_VALUE) + 1;
			file.println();

			file.print(bravo + " " + alpha);
			count++;
			//System.out.println(count);
		}
		file.println();
		file.print("1 999999");

		file.close();
	}
}