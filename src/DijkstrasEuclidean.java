

import java.util.*;
/**
 *
 * @author Thisura Sagara
 */

public class DijkstrasEuclidean {
    
    
    EuclideanTest pfosg=new EuclideanTest();
    Euclidean euclidean=new Euclidean();
            

    Node start;
    Node end;
    Node[][] gridArea;

   
    /**
     *
     * @param matrix The boolean matrix from the framework given
     * @param si start x value
     * @param sj start y value
     * @param ei end x value
     * @param ej end x value
     * @return The path nodes
     */
    ArrayList<Node> distance(boolean[][] matrix, int si, int sj, int ei, int ej) {

        int size = matrix.length;

        start = new Node(si, sj);
        end = new Node(ei, ej);
        // The grid that is used to store nodes
        gridArea = new Node[size][size];

        // Creating nodes and finding blocked cells in matrix and mapping accordingly to our grid
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                gridArea[i][j] = new Node(i, j);
                if (matrix[i][j] == false) {
                    gridArea[i][j].blocked = true;
                }
            }
        }

        // setting start distance to 0. 
        // All other nodes will have infinity distance at the beginning
        start.distance =0;
        double totCost = 0;

        // a comparator object to deal with Priority Queue
        Comparator<Node> adjacencyComparator = (left, right) -> {
            if (left.distance > (right.distance)) {
                return 1;
            }
            return -1;
        };

        // Queue to store visiting nodes
        Queue<Node> queueB = new PriorityQueue(size, adjacencyComparator);

        queueB.add(start);

        while (queueB.size() > 0) {
            Node current = queueB.remove();
            Node t;

            // Top
            if (current.x - 1 >= 0) {

              

                // Top Left
                if (current.y - 1 > 0) {
                    t = gridArea[current.x - 1][current.y - 1];
                    if (!t.visited && !t.blocked && t.distance > current.distance + euclidean.getdDistance()) {
                        t.distance = current.distance + euclidean.getdDistance();
                        t.parent = current;
                        queueB.add(t);
                    }
                }

                // Top Right
                if (current.y + 1 < size) {
                    t = gridArea[current.x - 1][current.y + 1];
                    if (!t.visited && !t.blocked && t.distance > current.distance + euclidean.getdDistance()) {
                        t.distance = current.distance + euclidean.getdDistance();
                        t.parent = current;
                        queueB.add(t);
                    }
                }
            }

            

            
            // Down
            if (current.x + 1 < size) {

                

                // Down Left
                if (current.y - 1 >= 0) {
                    t = gridArea[current.x + 1][current.y - 1];
                    if (!t.visited && !t.blocked && t.distance > current.distance + euclidean.getdDistance()) {
                        t.distance = current.distance + euclidean.getdDistance();
                        t.parent = current;
                        queueB.add(t);
                    }
                }

                // Down Right
                if (current.y + 1 < size) {
                    t = gridArea[current.x + 1][current.y + 1];
                    if (!t.visited && !t.blocked && t.distance > current.distance + euclidean.getdDistance()) {
                        t.distance = current.distance + euclidean.getdDistance();
                        t.parent = current;
                        queueB.add(t);
                    }
                }
            }
            current.visited = true;
            totCost= start.distance+current.distance;
            //System.out.println("Total Cost :"+current.distance);
        }
        
        System.out.println("Total Cost of Euclidean :"+totCost); 
       
        ArrayList<Node> path = new ArrayList<>();

        // Checking if a path exists
        if (!(gridArea[end.x][end.y].distance == Integer.MAX_VALUE)) {
            //Trace back the path
            Node current = gridArea[end.x][end.y];

            while (current.parent != null) {
                path.add(current);
                path.add(current.parent);
                current = current.parent;
                System.out.print("["+current.x+","+current.y+"]");
                
            }
        } else System.out.println("No possible path");

        return path;
    }
    
    class Node {
        int x;
        int y;
        double distance = Integer.MAX_VALUE;
        Node parent = null;
        boolean visited;
        boolean blocked;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
 
    


    
    
     
        
    
}



        
