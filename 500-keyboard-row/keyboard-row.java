
class Solution {
    public String[] findWords(String[] words) {
        String[] rows = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        return java.util.Arrays.stream(words)
            .filter(w -> {
                String s = w.toLowerCase();
                return java.util.Arrays.stream(rows)
                    .anyMatch(r -> s.chars().allMatch(c -> r.indexOf(c) >= 0));
            }).toArray(String[]::new);
    }
}
