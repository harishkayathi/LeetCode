class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(nums, 0, new ArrayList<>(), res);
        return res;
    }
    void dfs(int[] nums, int l, List<Integer> curr, List<List<Integer>> res) {
        if (l == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[l]);
        dfs(nums, l + 1, curr, res);
        curr.remove(curr.size() - 1);
        dfs(nums, l + 1, curr, res);
    }
}