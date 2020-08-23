class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> groupList = new LinkedList<>();

        Map<String, List<String>> map = new HashMap<>();

        for(int i = 0; i < strs.length; i ++){
            String str = strs[i];

            char[] c = str.toCharArray();
            Arrays.sort(c);

            str = new String(c);
            if(map.containsKey(str)){
                List<String> list = map.get(str);
                list.add(strs[i]);
                map.put(str, list);
            }
            else {
                List<String> list = new LinkedList<>();
                list.add(strs[i]);
                map.put(str, list);
            }
        }

        for(List list : map.values()) {
            groupList.add(list);
        }
        return groupList;
    }
}