class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Base case: A prefix sum of 0 has appeared 1 time
        map.put(0, 1);
        
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
            int rs = sum - k;
            // If (sum - k) happened before, add its frequency to our total count
            if (map.containsKey(rs)) {
                count += map.get(rs);
            }
            
            // Put the current sum into the map or update its frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        
        return count;
    }
}