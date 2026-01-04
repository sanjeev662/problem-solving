class Solution {
    public String reorganizeString(String s) {

        // Step 1: Frequency map
        Map<Character, Integer> mp = new HashMap<>();
        for (char c : s.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        // Step 2: Max-heap by frequency
        PriorityQueue<Map.Entry<Character, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        pq.addAll(mp.entrySet());

        StringBuilder sb = new StringBuilder();

        // Step 3: Greedy process
        while (pq.size() > 1) {
            Map.Entry<Character, Integer> e1 = pq.poll();
            Map.Entry<Character, Integer> e2 = pq.poll();

            // place two different characters
            sb.append(e1.getKey());
            sb.append(e2.getKey());

            // decrease frequency
            e1.setValue(e1.getValue() - 1);
            e2.setValue(e2.getValue() - 1);

            if (e1.getValue() > 0) pq.offer(e1);
            if (e2.getValue() > 0) pq.offer(e2);
        }

        // Step 4: Handle last character (if any)
        if (!pq.isEmpty()) {
            Map.Entry<Character, Integer> last = pq.poll();
            if (last.getValue() > 1) return "";
            sb.append(last.getKey());
        }

        return sb.toString();
    }
}
