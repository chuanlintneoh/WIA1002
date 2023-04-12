public class Node<ValueType> {
    private ValueType value;
    private String edgeName1;
    private String edgeName2;
    private Node<ValueType> edgeNode1;
    private Node<ValueType> edgeNode2;
    public Node(){
        this(null);
    }
    public Node(ValueType value){
        this.value = value;
        this.edgeName1 = null;
        this.edgeName2 = null;
        this.edgeNode1 = null;
        this.edgeNode2 = null;
    }
    public void setEdge1(String edgeName, Node<ValueType> node){
        edgeName1 = edgeName;
        edgeNode1 = node;
    }
    public void setEdge2(String edgeName, Node<ValueType> node){
        edgeName2 = edgeName;
        edgeNode2 = node;
    }
    public ValueType getValue(){
        return value;
    }
    public void printEdgesAndNodes(){
        System.out.println("------------------------------");
        System.out.printf("%s\n",value);
        System.out.printf("\t:%s=>\n",edgeName1);
        System.out.printf("\t %s\n",edgeNode1.getValue());
        System.out.printf("\t:%s=>\n",edgeName2);
        System.out.printf("\t %s\n",edgeNode2.getValue());
        System.out.println("------------------------------");
        System.out.println();
    }
    public Node<ValueType> traverse(String edgeName){
        if (edgeName.equals(edgeName1)){
            return edgeNode1;
        }
        else if(edgeName.equals(edgeName2)){
            return edgeNode2;
        }
        else {
            return null;
        }
    }
}
