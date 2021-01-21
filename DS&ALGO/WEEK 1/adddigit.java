import java.io.*; 
class Solution {
    public int addDigits(int num) {
     return num!=0?(num%9!=0?num%9:9):0;
    }
}
