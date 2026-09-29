import java.io.*;
import java.util.*;

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;

    TrieNode() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }
    }
}

class Trie {
    private TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(String key) {
        TrieNode node = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    boolean search(String key) {
        TrieNode node = root;
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i) - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        int N = sc.nextInt();
        sc.nextLine(); 

       
        String[] keys = sc.nextLine().split(",");

       
        String searchWord = sc.nextLine();

        Trie trie = new Trie();

       
        for (String key : keys) {
            trie.insert(key.trim());
        }

       
        if (trie.search(searchWord)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
