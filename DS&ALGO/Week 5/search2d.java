class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;

        while(left <=right ){
            int mid = left + (right-left)/2;
            int val = matrix[mid/col][mid%col];
            if(val == target)
                return true;
            if(val > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }

        return false;
    }
} 
