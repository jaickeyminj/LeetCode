class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int N = deck.length;
        Deque<Integer> index = new LinkedList();
        for (int i = 0; i < N; ++i)
            index.add(i);

        int[] ans = new int[N];
        // System.out.println(index);
        Arrays.sort(deck);
        for (int card: deck) {
            int x = index.pollFirst();
            // System.out.println(x);
            ans[x] = card;
            if (!index.isEmpty())
                index.add(index.pollFirst());
            // System.out.println(index);
        }
        return ans;
    }
}