package schleifenUndArrays;

public class ForSchleifeMit2DArray {

	public static void main(String[] args) {
		
		String [][] Text = {
				{"Dieser", "Text", "ist"},
				{"so", "Sinnvoll,", "dass"},
				{"es", "weh", "tut"}
							};
		
		for (int i = 0; i<Text.length; i++) {
			for (int j = 0; j<Text[i].length; j++) {
				System.out.println(Text[i][j] + " ");
			}
		}
	}
}
