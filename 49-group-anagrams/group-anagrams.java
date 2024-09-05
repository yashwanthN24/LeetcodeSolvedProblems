class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // List<List<String>> al = new ArrayList<>();

    

        HashMap<String , List<String>>map = new HashMap<>();

        for (String s : strs) {
            char array[] = s.toCharArray();
            Arrays.sort(array);

            String anagram = new String(array);

            if (!map.containsKey(anagram)) {
                map.put(anagram, new ArrayList<>());
            }

            map.get(anagram).add(s);

        }
        
        // System.out.println(map);
        return new ArrayList<>(map.values());
    }
}