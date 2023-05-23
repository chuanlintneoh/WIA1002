public class tester {
    public static void main(String[] args) {
        Graph<String,Integer> tutorial8 = new Graph<>();
        String[] vertices = {"A","B","C","D","E","F","G","H","I"};
        for (String vertex: vertices){
            tutorial8.addVertex(vertex);
        }
        tutorial8.addEdge("A","C",1);
        tutorial8.addEdge("A","D",1);
        tutorial8.addEdge("B","D",1);
        tutorial8.addEdge("C","E",1);
        tutorial8.addEdge("C","F",1);
        tutorial8.addEdge("D","E",1);
        tutorial8.addEdge("E","G",1);
        tutorial8.addEdge("F","H",1);
        tutorial8.addEdge("G","H",1);
        tutorial8.addEdge("H","I",1);

        tutorial8.printEdges();
    }
}
