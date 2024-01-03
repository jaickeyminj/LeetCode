class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> st = new ArrayList<>();
        int cnt = 0;

        for (String account : bank) {
            cnt = 0;
            for (int j = 0; j < account.length(); j++) {
                if (account.charAt(j) == '1') {
                    cnt++;
                }
            }
            if (cnt > 0) {
                st.add(cnt);
            }
        }

        int ans = 0;

        if (st.size() == 0 || st.size() == 1) {
            return 0;
        }

        for (int i = 0; i < st.size() - 1; i++) {
            ans += (st.get(i) * st.get(i + 1));
        }

        return ans;
    }
}