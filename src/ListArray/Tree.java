package ListArray;

public class Tree {

	public static void main(String[] args) {
		int lineCount =4;
		int spaceCount = lineCount/2 +1;
		int starCount =1;
		
		for(int i=0; i<lineCount; i++) {
			for(int j =0; j<spaceCount; j++) {
				System.out.print(" ");
			} for(int j=0; j<starCount; j++) {
				System.out.print("*");
			} for(int j =0; j<spaceCount; j++) {
				System.out.print(" ");
			}
			spaceCount -=1;
			starCount +=2;
			System.out.println();
		}
		
		lineCount -= 1;
		spaceCount +=1;
		starCount -=2;
		
		for(int i=0; i<lineCount; i++) {
			spaceCount +=1;
			starCount -=2;
			for(int j =0; j<spaceCount; j++) {
				System.out.print(" ");
			} for(int j=0; j<starCount; j++) {
				System.out.print("*");
			} for(int j =0; j<spaceCount; j++) {
				System.out.print(" ");
			}

			System.out.println();
		}
		
	}

}
