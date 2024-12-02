import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		try {
			//ArrayLists to store both sides of the list
			ArrayList<Integer> LeftSide = new ArrayList<Integer>();
			ArrayList<Integer> RightSide = new ArrayList<Integer>();
			int totalDistance = 0;
			
			File input = new File("/home/retrodev/Documents/input.txt");
			Scanner reader = new Scanner(input);
			
			int i = 0;
			while (reader.hasNextLine()) {
				//Regex searches for whitespace characters
				String regex = "[\s]";
				String[] sides = reader.nextLine().split(regex);
			    LeftSide.add(i, Integer.parseInt(sides[0]));
			    RightSide.add(i, Integer.parseInt(sides[3]));
			    
				i++;
			}
			reader.close();
			
			Collections.sort(LeftSide);
			Collections.sort(RightSide);
			
			int x = 0;
			for(int items : LeftSide) {
				int left = LeftSide.get(x);
				int right = RightSide.get(x);
				
				//Math.abs makes sure the outcome is always a positive integer
				int distance = Math.abs(left - right);
				totalDistance += distance;
				x++;
			}
			
			System.out.println(totalDistance);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
