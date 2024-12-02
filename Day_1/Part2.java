import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Part2 {

	public static void main(String[] args) {
		try {
			//ArrayLists to store both sides of the list
			ArrayList<Integer> LeftSide = new ArrayList<Integer>();
			ArrayList<Integer> RightSide = new ArrayList<Integer>();
			int totalSame = 0;
			
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
				
				int y = 0;
				int same = 0;
				for(int objects : RightSide) {
					int right = RightSide.get(y);
					if (left == right) {
						same += 1;
					}
					else {}
					y++;
				}
				int similarity = LeftSide.get(x) * same;
				totalSame += similarity;
				x++;
			}
			
			System.out.println(totalSame);
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
