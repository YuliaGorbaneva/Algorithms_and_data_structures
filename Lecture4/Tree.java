package Lecture4;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    Node root;

    public class Node()
    {
            int valeu;
            List<Node> children;
        }

        public boolean exist(int valeu) {
            if (root != null) {
                Node node = find(root, valeu);
                if (node != null) {
                    return true;
                }
            }
            return false;
        }

        private Node find(Node node, int valeu) {
            if (node.valeu == valeu) {
                return node;
            } else {
                for (Node child : node.children) {
                    Node result = find(child, valeu);
                    if (result != null) {
                        return result;
                    }
                }
            }
        }

    private Node find (int valeu){
        List<Node> line = new ArrayList<>(){
            line.add(root);
            while (line.size() > 0){
                List<Node> nextLine = new ArrayList<>();
                for (Node node : line) {
                    if (node.value == valeu){
                        return node;
                    }
                    nextLine.addAll(node.children);
                }
                line = nextLine;
            }
            return null;
        }
    }
}
