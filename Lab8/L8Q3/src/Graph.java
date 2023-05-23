import java.util.ArrayList;
public class Graph<T extends Comparable<T>> {
    Vertex<T> head;
    int size;
    public Graph(){
        head = null;
        size = 0;
    }
    public int getSize(){
        return size;
    }
    public boolean hasVertex(T v){
        if (head == null){
            return false;
        }
        Vertex<T> temp = head;
        while (temp != null){
            if (temp.vertexInfo.compareTo(v) == 0){
                return true;
            }
            temp = temp.nextVertex;
        }
        return false;
    }
    public int getIndeg(T v){
        if (hasVertex(v)){
            Vertex<T> temp = head;
            while (temp != null){
                if (temp.vertexInfo.compareTo(v) == 0){
                    return temp.indeg;
                }
                temp = temp.nextVertex;
            }
        }
        return -1;
    }
    public int getOutdeg(T v){
        if (hasVertex(v)){
            Vertex<T> temp = head;
            while (temp != null){
                if (temp.vertexInfo.compareTo(v) == 0){
                    return temp.outdeg;
                }
                temp = temp.nextVertex;
            }
        }
        return -1;
    }
    public boolean addVertex(T v){
        if (!hasVertex(v)){
            Vertex<T> temp = head;
            Vertex<T> newVertex = new Vertex<>(v,null);
            if (head == null){
                head = newVertex;
            }
            else {
                Vertex<T> previous = head;
                while(temp != null){
                    previous = temp;
                    temp = temp.nextVertex;
                }
                previous.nextVertex = newVertex;
            }
            size++;
            return true;
        }
        return false;
    }
    public int getIndex(T v){
        Vertex<T> temp = head;
        int pos = 0;
        while (temp != null){
            if (temp.vertexInfo.compareTo(v) == 0){
                return pos;
            }
            temp = temp.nextVertex;
            pos++;
        }
        return -1;
    }
    public ArrayList<T> getAllVertexObjects(){
        ArrayList<T> list = new ArrayList<>();
        Vertex<T> temp = head;
        while (temp != null){
            list.add(temp.vertexInfo);
            temp = temp.nextVertex;
        }
        return list;
    }
    public T getVertex(int pos){
        if (pos > size - 1 || pos < 0){
            return null;
        }
        Vertex<T> temp = head;
        for (int i = 0; i < pos; i++){
            temp = temp.nextVertex;
        }
        return temp.vertexInfo;
    }
    public boolean hasEdge(T source, T destination){
        if (head == null){
            return false;
        }
        if (!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        Vertex<T> sourceVertex = head;
        while (sourceVertex != null){
            if (sourceVertex.vertexInfo.compareTo(source) == 0){
                Edge<T> currentEdge = sourceVertex.firstEdge;
                while (currentEdge != null){
                    if (currentEdge.toVertex.vertexInfo.compareTo(destination) == 0){
                        return true;
                    }
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    public boolean addEdge(T source, T destination){
        if (head == null){
            return false;
        }
        if (!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        Vertex<T> sourceVertex = head;
        while (sourceVertex != null){
            if (sourceVertex.vertexInfo.compareTo(source) == 0){
                Vertex<T> destinationVertex = head;
                while (destinationVertex != null){
                    if (destinationVertex.vertexInfo.compareTo(destination) == 0){
                        Edge<T> currentEdge = sourceVertex.firstEdge;
                        Edge<T> newEdge = new Edge<>(destinationVertex,currentEdge);
                        sourceVertex.firstEdge = newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
                    destinationVertex = destinationVertex.nextVertex;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    public boolean addUndirectedEdge(T vertex1, T vertex2){
        return (addEdge(vertex1,vertex2) || addEdge(vertex2,vertex1));
    }
    public boolean removeEdge(T source, T destination){
        if (head == null){
            return false;
        }
        if (!hasVertex(source) || !hasVertex(destination)){
            return false;
        }
        Vertex<T> sourceVertex = head;
        while (sourceVertex != null){
            if (sourceVertex.vertexInfo.compareTo(source) == 0){
                Edge<T> previousEdge = null;
                Edge<T> currentEdge = sourceVertex.firstEdge;
                while (currentEdge != null){
                    if (currentEdge.toVertex.vertexInfo.compareTo(destination) == 0){
                        if (previousEdge == null){
                            sourceVertex.firstEdge = currentEdge.nextEdge;
                        }
                        else {
                            previousEdge.nextEdge = currentEdge.nextEdge;
                        }
                        sourceVertex.indeg--;
                        currentEdge.toVertex.outdeg--;
                        return true;
                    }
                    previousEdge = currentEdge;
                    currentEdge = currentEdge.nextEdge;
                }
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
    public ArrayList<T> getNeighbours(T v){
        if (!hasVertex(v)){
            return null;
        }
        ArrayList<T> list = new ArrayList<>();
        Vertex<T> temp = head;
        while (temp != null){
            if (temp.vertexInfo.compareTo(v) == 0){
                Edge<T> currentEdge = temp.firstEdge;
                while (currentEdge != null){
                    list.add(currentEdge.toVertex.vertexInfo);
                    currentEdge = currentEdge.nextEdge;
                }
            }
            temp = temp.nextVertex;
        }
        return list;
    }
    public void printEdges(){
        Vertex<T> temp = head;
        while (temp != null){
            System.out.print("# " + temp.vertexInfo + " : ");
            Edge<T> currentEdge = temp.firstEdge;
            while(currentEdge != null){
                System.out.print("[" + temp.vertexInfo + "," + currentEdge.toVertex.vertexInfo + "]");
                currentEdge = currentEdge.nextEdge;
            }
            System.out.println();
            temp = temp.nextVertex;
        }
    }
}
