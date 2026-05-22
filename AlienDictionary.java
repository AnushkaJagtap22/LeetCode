public class AlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {

        // Store alien character order
        int[] rank = new int[26];

        for (int i = 0; i < order.length(); i++) {

            rank[order.charAt(i) - 'a'] = i;
        }

        // Compare adjacent words
        for (int i = 0; i < words.length - 1; i++) {

            String word1 = words[i];
            String word2 = words[i + 1];

            // Compare characters
            int minLength = Math.min(word1.length(), word2.length());

            boolean differentFound = false;

            for (int j = 0; j < minLength; j++) {

                char c1 = word1.charAt(j);
                char c2 = word2.charAt(j);

                // If characters differ
                if (c1 != c2) {

                    // Check alien order
                    if (rank[c1 - 'a'] > rank[c2 - 'a']) {

                        return false;
                    }

                    differentFound = true;
                    break;
                }
            }

            // Prefix case
            if (!differentFound &&
                word1.length() > word2.length()) {

                return false;
            }
        }

        return true;
}
    public static void main(String[] args) {
        AlienDictionary ad = new AlienDictionary();
        String[] words = {"hello", "leetcode"};
        String order = "hlabcdefgijkmnopqrstuvwxyz";
        boolean result = ad.isAlienSorted(words, order);
        System.out.println("Are the words sorted in the alien language? " + result);
    }
}
