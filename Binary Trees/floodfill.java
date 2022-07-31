/*
	Time complexity: O(M * N)
	Space Complexity: O(M * N)
	
	Where M and N are the number of rows and columns in the image, respectively.
*/

public class Solution
{

    public static void floodFillHelper(int[][] image, int i, int j, int oldColor, int newColor)
    {

        // Check if the current coordinates are valid or not.
        if (i < 0 || i >= image.length || j < 0 || j >= image[0].length)
        {
            // Invalid coordinates. So, return.
            return;
        }

        if (image[i][j] != oldColor)
        {
            // Current pixel has a different colour than starting pixel.
            return;
        }

        if (image[i][j] == newColor)
        {
            // Current pixel has already been visited.
            return;
        }

        // Replace the colour of current pixel.
        image[i][j] = newColor;

        // Recur for adjacent pixels.
        floodFillHelper(image, i, j + 1, oldColor, newColor);
        floodFillHelper(image, i, j - 1, oldColor, newColor);
        floodFillHelper(image, i + 1, j, oldColor, newColor);
        floodFillHelper(image, i - 1, j, oldColor, newColor);
    }

    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {

        int oldColor = image[x][y];

        floodFillHelper(image, x, y, oldColor, newColor);

        return image;

    }
}

