package ArraysandStrings;

import java.util.Arrays;

class Solution {
  public static void main(String[] args) {
    int[][] matrix = new int[][] {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
    Solution sol = new Solution();
    sol.rotate(matrix);
    
  }
  
  public void rotate(int[][] matrix) {

      int m = matrix.length; //Calculating number of rows
      int n = matrix[0].length;  //no. of columns


      // Transpose of the matrix
      for(int i=0; i<m; ++i) {
          for(int j=i; j<n; ++j) {
              int temp = matrix[i][j];   // Swap(matrix[i][j], matrix[j][i]);
              matrix[i][j] = matrix[j][i];
              matrix[j][i] = temp;
          }
      }
//Rotate the matrix
      for(int i=0; i<m; ++i) {
          int l = 0, r=n-1;
          while(l<r) {
              int temp = matrix[i][l];   // Swap
              matrix[i][l] = matrix[i][r];
              matrix[i][r] = temp;
              l += 1;
              r -= 1;
          }
      }
      System.out.println(Arrays.deepToString(matrix)); //To print the contents of a 2D array, you should use Arrays.deepToString() method.
}
}