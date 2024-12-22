import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TrieNode {
    List<String> data;
    TrieNode[] children;
    boolean isEnd;

    TrieNode() {
        data = new ArrayList<>();
        children = new TrieNode[26];
        isEnd = false;
    }
}

public class GroupAnagramsTogether {
    private TrieNode root;
    private List<List<String>> ans;

    public GroupAnagramsTogether() {
        root = new TrieNode();
    }

    public List<List<String>> groupAnagrams(String[] args) {
        ans = new ArrayList<>();
        for (String word : args) {
            build(word);
        }
        dfs(root);
        return ans;
    }

    private void build(String s) {
        TrieNode temp = root;
        char[] word = s.toCharArray();
        Arrays.sort(word); // Sorting the characters of the string
        for (char c : word) {
            if (temp.children[c - 'a'] == null) {
                temp.children[c - 'a'] = new TrieNode();
            }
            temp = temp.children[c - 'a'];
        }
        temp.isEnd = true;
        temp.data.add(s);
    }

    private void dfs(TrieNode rt) {
        if (rt.isEnd) {
            ans.add(rt.data);
        }
        for (int i = 0; i < 26; i++) {
            if (rt.children[i] != null) {
                dfs(rt.children[i]);
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        GroupAnagramsTogether solution = new GroupAnagramsTogether();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(input);
        System.out.println(result);
    }
}