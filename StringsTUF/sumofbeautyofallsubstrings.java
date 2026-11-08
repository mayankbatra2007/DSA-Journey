package StringsTUF;

public class sumofbeautyofallsubstrings {
    public static void main(String[] args) {
        
    }
    public int beautySum(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            int maxFreq = 0;

            for (int j = i; j < s.length(); j++) {
                int idx = s.charAt(j) - 'a';
                freq[idx]++;

                maxFreq = Math.max(maxFreq, freq[idx]);

                int minFreq = Integer.MAX_VALUE;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        minFreq = Math.min(minFreq, freq[k]);
                    }
                }

                ans += maxFreq - minFreq;
            }
        }

        return ans;
    }
}
