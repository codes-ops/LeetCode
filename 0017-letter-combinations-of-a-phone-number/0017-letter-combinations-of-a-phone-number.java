class Solution {
    public void func(int i, List<String> ans, String temp, String digits, HashMap<Integer, String> map) {
        if (i >= digits.length()) {
            ans.add(temp);
            return;
        }
        int digit = digits.charAt(i) - '0';
        String str = map.get(digit);
        for (int j = 0; j < str.length(); j++) {
            temp += str.charAt(j);
            func(i + 1, ans, temp, digits, map);
            temp = temp.substring(0, temp.length() - 1);
        }
    }

    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        HashMap<Integer, String> map = new HashMap<>();

        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        func(0, ans, "", digits, map);

        return ans;
    }
}