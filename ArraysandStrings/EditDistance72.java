
public class EditDistance {
  
  public static void main(String[] args) {
    String word1 = "horse";
    String word2 = "ros";
    System.out.println(minDistance(word1, word2));
}


  public static int minDistance(String word1, String word2) {

      int m = word1.length();
      int n = word2.length();

       int[][] matrix = new int[m+1][n+1];

       for(int i=0; i<m; i++) matrix[i][0] = i;
       for(int j=0; j<n; j++) matrix[0][j] = j;
      


      for(int i=1; i<=m; ++i) 
          for(int j=1; j<=n; ++j)

      //same characters
      if (word1.charAt(i - 1) == word2.charAt(j - 1))
        // Copy from top left
        matrix[i][j] = matrix[i - 1][j - 1];
      else {
        // Get minimum of all 3 neighbors
        int topLeft = matrix[i - 1][j - 1];
        int top = matrix[i - 1][j];
        int left = matrix[i][j - 1];
        matrix[i][j] = Math.min(topLeft, Math.min(top, left)) + 1;
      }

  return matrix[m][n];
      }
      
    }
