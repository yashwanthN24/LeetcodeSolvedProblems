class Solution {
    public int[] singleNumber(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        // Count frequency of each number
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> ans = new ArrayList<>();
        
        // Collect numbers that appear only once
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                ans.add(num);
            }
        }

        int answer[] = new int[ans.size()];

        for(int i =0 ; i<ans.size() ; i++){
            answer[i] = ans.get(i);
        }


        return answer;
    
    }
}