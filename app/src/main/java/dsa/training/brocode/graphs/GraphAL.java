package dsa.training.brocode.graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class GraphAL {

    ArrayList<LinkedList<Node>> aList;

    public GraphAL() {
        aList = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        aList.add(currentList);
    }

    public void addEdge(int src, int dst) {
        LinkedList<Node> currentList = aList.get(src);
        Node dstNode = aList.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> currentList = aList.get(src);
        Node dstNode = aList.get(dst).get(0);
        for (Node node : currentList) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (LinkedList<Node> linkedList : aList) {
            for (Node node : linkedList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }

}
