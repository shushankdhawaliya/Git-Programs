public class maxProductOfStringArray {
    public static void main(String[] args) {
        String str[] = {"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println(maxProduct(str));
    }
    public static int maxProduct(String[] words) {
        int n = words.length;
        int[] mask = new int[n];
        int[] length = new int[n];
        
        for (int i = 0; i < n; i++) {
            int m = 0;
            for (char c : words[i].toCharArray()) {
                m |= 1 << (c - 'a');
            }
            mask[i] = m;
            length[i] = words[i].length();
        }

        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((mask[i] & mask[j]) == 0) {
                    max = Math.max(max, length[i] * length[j]);
                }
            }
        }

        return max;
    }
}
