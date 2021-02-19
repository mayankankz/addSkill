class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<T.length;i++){
            while(!stack.isEmpty() && T[i]>T[stack.peek()]){
                int idx = stack.pop();
                res[idx]=i-idx;
            }
            stack.push(i);
        }
        return res;
    }
}
