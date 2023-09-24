import java.util.*;

class Graph {
    static void addEdge(ArrayList<ArrayList<Integer>> am, int s, int d) {
        am.get(s).add(d);
        am.get(d).add(s); 
    }

    public static void main(String[] args) {
        int V = 7; // chaning the number of vertices to 7
        ArrayList<ArrayList<Integer>> am = new ArrayList<ArrayList<Integer>>(V);
        for (int i = 0; i < V; i++) {
            am.add(new ArrayList<Integer>());
        }

        addEdge(am, 0, 1);
        addEdge(am, 0, 2);
        addEdge(am, 0, 3);
        addEdge(am, 1, 2);
        addEdge(am, 2, 4); 
        //extra edges
        addEdge(am, 3, 5); 
        addEdge(am, 4, 6); 
        printGraph(am);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> am) {
        for (int i = 0; i < am.size(); i++) {
            System.out.println("\nVertex " + i + ":");
            for (int j = 0; j < am.get(i).size(); j++) {
                System.out.print(" -> " + am.get(i).get(j));
            }
            System.out.println();
        }
    }
}