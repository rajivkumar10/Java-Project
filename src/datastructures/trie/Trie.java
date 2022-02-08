package datastructures.trie;

//Used to store words in tree datastructure format
public class Trie {

    private Node root;

    public Trie() {
        root = new Node('\0'); // empty character
    }

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new Node(c);
            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true; //Last character of word makes words so marking it to true.
    }

    public boolean search(String word) {
        Node node = getNode(word);
        return node != null && node.isWord;
    }

    public boolean startsWith(String prefix) {
          return  getNode(prefix) != null;
    }

    //returns last node of a word
    private Node getNode(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (curr.children[c - 'a'] == null) return null;
            curr = curr.children[c - 'a'];
        }
        return curr;
    }

    class Node {
        public char c;
        public boolean isWord;
        Node[] children;

        public Node(char c) {
            this.c = c;
            isWord = false;
            children = new Node[26]; // stores characters from a to z only.
        }
    }

    public static void main(String[] arr) {
        String word1 = "cats";
        String word2 = "cape";
        Trie trie = new Trie();
        trie.insert(word1);
        trie.insert(word2);
        System.out.println("'cats' is present? " + trie.search(word1));
        System.out.println("'cape' is present? " + trie.search(word2));
        System.out.println("'call' is present? " + trie.search("call"));
        System.out.println("Word starts with 'ca'? " + trie.startsWith("ca"));
        System.out.println("Word starts with 'co'? " + trie.startsWith("co"));
    }

}
