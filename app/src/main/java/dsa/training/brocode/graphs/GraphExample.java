package dsa.training.brocode.graphs;

public class GraphExample {

    /*
     * Adjacency Matrix = A 2D array to ostore 1's/ 0's to represent edges
     * # of rows = # of unique nodes
     * # of columns = # of unique nodes
     * runtime complexity to check an Edge: O(1)
     * space complexity: O(v^2)
     */
    public static void adjacencyMatrix() {
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        // FOR A
        graph.addEdge(0, 1);

        // FOR B
        graph.addEdge(1, 2);

        // FOR C
        graph.addEdge(2, 3);

        // FOR D
        graph.addEdge(2, 4);

        // FOR E
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

        System.out.println(graph.checkEdge(1, 2));

    }

    /*
     * An array/arraylist of linkedlist
     * Each linkedlist has a unique node at the head
     * All adjacent neighbors to that node are added to that node's linkedlist
     * 
     * @note runtime complexity to check an Edge: O(v)
     * space complexity: O(v + e)
     */
    public static void adjacencyList() {

        GraphAL graphAL = new GraphAL();
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

    }

}
