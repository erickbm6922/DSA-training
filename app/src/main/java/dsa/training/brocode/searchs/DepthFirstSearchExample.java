package dsa.training.brocode.searchs;

import dsa.training.brocode.graphs.Graph;
import dsa.training.brocode.graphs.Node;

/*
 * Depth first search =  pick a route keep going. if you reach a dead end, or an already visited node,
 * bracktrack to a previous node with unvisited adjacent neighbors
 */
public class DepthFirstSearchExample {

    public static void aNodeExample(int nodeIndex) {
        Graph graphAL = new Graph(5);
        graphAL.addNode(new Node('A'));
        graphAL.addNode(new Node('B'));
        graphAL.addNode(new Node('C'));
        graphAL.addNode(new Node('D'));
        graphAL.addNode(new Node('E'));

        graphAL.addEdge(0, 1);
        graphAL.addEdge(1, 2);
        graphAL.addEdge(1, 4);
        graphAL.addEdge(2, 3);
        graphAL.addEdge(2, 4);
        graphAL.addEdge(4, 0);
        graphAL.addEdge(4, 2);

        graphAL.print();
        graphAL.depthFirstSearch(nodeIndex);

    }
}
