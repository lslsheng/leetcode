public class Solution {
    public ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(0);
        for (int i = 1; i <= n; i++) {
            for (int j = result.size() - 1; j >= 0; j--) {
                int val = result.get(j);
                result.add(val | (1 << (i - 1)));
            }
        }
        return result;
    }
}
