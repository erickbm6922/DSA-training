package dsa.training.brocode.searchs;

import dsa.training.brocode.graphs.Graph;
import dsa.training.brocode.graphs.Node;

/*
 * BFS = a search algorithm for traversing a tree or graph data structure.
 * this is done one "level" at a time, rather than one "branch" at a time
 * @note Breadth FS = traverse a graph level by level, Utilizes a Queue. 
 *                    Better if destination is on average close to start
 *                    Siblings are visited before children
 * 
 *       Depth FS = Traverse a graph branch by branch, Utilizes a Stack.
 *                  Better if destination is on average far from the start
 *                  Children are visited before siblings
 *                  More popular for games/puzzles
 */
public class BreadthFirstSearchExample {
    public static void nodesExample(int nodeIndex) {
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
        graphAL.breadthFirstSearch(nodeIndex);

    }
}
