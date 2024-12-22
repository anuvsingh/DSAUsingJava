public class LongestWordInDictionary {
    private static class Node {
        private String word;
        private boolean isEnd;
        private Node[] children;

        public Node() {
            this.word = null;
            this.isEnd = false;
            this.children = new Node[26];
        }
    }

    private Node root = new Node();
    private String ans = "";

    private void insert(String word) {
        Node curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            int childIdx = word.charAt(i) - 'a';
            if (curr.children[childIdx] == null) {
                curr.children[childIdx] = new Node();
            }
            curr = curr.children[childIdx];
        }
        curr.isEnd = true;
        curr.word = word;
    }

    public String longestWord(String[] words) {
        for (String word : words) {
            insert(word);
        }
        dfs(root);
        return ans;
    }

    private void dfs(Node node) {
        if (node == null) {
            return;
        }

        if (node.word != null) {
            if (node.word.length() > ans.length() || 
                (node.word.length() == ans.length() && node.word.compareTo(ans) < 0)) {
                ans = node.word;
            }
        }

        for (Node child : node.children) {
            if (child != null && child.word != null) {
                dfs(child);
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        LongestWordInDictionary solution = new LongestWordInDictionary();
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        //Both "apply" & "apple" can be built from other words in the dictionary. However, "apple" is lexicographically smaller than "apply".
        System.out.println(solution.longestWord(words)); // Output: "world"
    }
}