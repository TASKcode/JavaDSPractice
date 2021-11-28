package com.guineabear.code.data.structure.trie;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TrieNode {

    char data;
    LinkedList<TrieNode> children;
    TrieNode parent;
    boolean isEnd;

    public TrieNode(char ch) {
        data = ch;
        children = new LinkedList<TrieNode>();
        isEnd = false;
    }

    public TrieNode getChild(char ch) {
        if (children != null)
            for (TrieNode eachChild : children)
                if (eachChild.data == ch)
                    return eachChild;
        return null;
    }

    protected List<String> getWords() {
        List<String> list = new ArrayList<String>();
        if (isEnd) {
            list.add(toString());
        }
        if (children != null) {
            for (int i = 0; i < children.size(); i++) {
                if (children.get(i) != null) {
                    list.addAll(children.get(i).getWords());
                }
            }
        }
        return list;
    }

    public String toString() {
        if (parent == null) {
            return "";
        } else {
            return parent.toString() + new String(new char[]{data});
        }
    }

}
