package com.guineabear.code.data.structure.trie;

import java.util.ArrayList;
import java.util.List;

class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode(' ');
    }

    public void insert(String word) {
        if (search(word) == true)
            return;

        TrieNode current = root;
        TrieNode pre;
        for (char ch : word.toCharArray()) {
            pre = current;
            TrieNode child = current.getChild(ch);
            if (child != null) {
                current = child;
                child.parent = pre;
            } else {
                current.children.add(new TrieNode(ch));
                current = current.getChild(ch);
                current.parent = pre;
            }
        }
        current.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            if (current.getChild(ch) == null)
                return false;
            else {
                current = current.getChild(ch);
            }
        }
        if (current.isEnd == true) {
            return true;
        }
        return false;
    }

    public List autocomplete(String prefix) {
        TrieNode lastNode = root;
        for (int i = 0; i < prefix.length(); i++) {
            lastNode = lastNode.getChild(prefix.charAt(i));
            if (lastNode == null)
                return new ArrayList();
        }

        return lastNode.getWords();
    }
}

public class AutocompleteWithTrie {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("amazon");
        t.insert("amazon prime");
        t.insert("amazing");
        t.insert("amazing spider man");
        t.insert("amazed");
        t.insert("alibaba");
        t.insert("ali express");
        t.insert("ebay");
        t.insert("walmart");
        List a = t.autocomplete("amaz");
        for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
