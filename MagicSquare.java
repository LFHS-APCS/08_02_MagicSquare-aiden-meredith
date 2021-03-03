
/**
 * @author 
 * @version 
 */

public class MagicSquare
{
    /** The magic square array data */
    private int[][] array;

    /**
     * Constructs a MagicSquare object.
     * @param input the magic square array data.
     */
    public MagicSquare(int[][] input)
    {
        array = input;
    }

    /**
     * Tests to see if array is indeed a magic square
     * @return true if array is a magic square
     * @return false if the array is not a magic square
     */
    public boolean isMagicSquare()
    {
      for(int row=0; row<array.length;row++){
        if(array[row].length!=array.length)
          return false;
      }

    int constant = 0;
    for (int i = 0; i < array[0].length; i++)
       constant += array[0][i];
       
    for (int[] row : array){
      int rowSum = 0;
      for (int j = 0; j < row.length; j ++) {
         rowSum += row[j]; 
      }
      if (rowSum != constant)
         return false;
   }

   //check columns 
  for(int col = 0; col < array[0].length; col++){
     int colSum = 0;
      for (int row = 0; row < array.length; row++) {
         colSum += array[row][col]; 
      }
      if (colSum != constant)
         return false;
  }

  int sum=0;
  for(int i=0;i<array.length;i++){
    sum+=array[i][i];

  }
  if (sum != constant)
     return false;

       int sum2=0;
  int col = array.length-1;
  for(int i=0;i<array.length;i++){
    sum2+=array[i][col];
    col--;
  }
  if (sum2 != constant)
     return false;









return true;     
  }

    /**
     * Returns a String which represents the array.
     */
    public String toString()
    {
        String result = "";
        for(int r = 0; r < array.length; r++)
        {
            for(int c = 0; c <array[r].length; c++)
            {
                result += array[r][c];
                result += "\t";
            }
            result += "\n";
        }
        return result;
    }
}
