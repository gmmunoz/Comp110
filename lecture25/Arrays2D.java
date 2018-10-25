package comp110.lecture25;

public class Arrays2D {

	public static void main(String[] args) {

		// Declare a 2D Array
		int[][] a;

		// Initialize a 2D Array
		a = new int[4][3];

		// Assign a value to an element
		a[1][1] = 110;

		// Read a value from an element
		System.out.println(a[0][0]);
		System.out.println(a[1][1]);

		// Find the length of the 1st dimension - # of columns
		System.out.println(a.length);
		int columns = a.length;
		System.out.println(columns);

		// Find the length of the 2nd dimension- # of rows
		System.out.println(a[0].length);
		int[] firstColumn = a[0];
		int rows = firstColumn.length;

		// Iterate through an entire 2D array
		// row-by-row
		for (int row = 0; row < rows; row++) {
			for (int column = 0; column < columns; column++) {
				a[column][row] = column * row;

			}
		}
		// column-by-column
		for (int column = 0; column < columns; column++) {
			for (int row = 0; row < rows; row++) {
				System.out.print(a[column][row] + " ");
			}
			System.out.println(" ");
		}
	}
}