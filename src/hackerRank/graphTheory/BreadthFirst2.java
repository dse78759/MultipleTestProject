package hackerRank.graphTheory;

import java.util.*;

public class BreadthFirst2 {

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        int numberOfSets = in.nextInt();
        
        for ( int i=0; i< numberOfSets; i++ ) {
	        int nodes=in.nextInt();
	        int edges=in.nextInt();
	        System.out.printf("nodes %d  edges %d\n", nodes, edges);
	        
	        HashMap<Integer, Node> nodeMap = new HashMap< Integer, Node> ();
	        
	        BreadthFirst2 bf = new BreadthFirst2();
	        
	        // Create that many nodes and put in a map
	        for ( int x=1; x<=nodes; x++ ) {
	        	
	        	BreadthFirst2.Node n = bf.new Node(x);
	        	nodeMap.put ( x, n );
	        	System.out.println("creating node : " + x);
	        }
	        
	        for(int edge_i=0; edge_i < edges; edge_i++){
	        	
	        	// todo : read a line, 
	        	
	        	int node1 = in.nextInt();
	        	int node2 = in.nextInt();
	        	
	        	// get node, add edge to it's list ( next node )
	        	boolean rc=nodeMap.get(node1).edges.add(node2);
	        	if (!rc ) {
	        		System.out.println("already had :" + node1 + " " + node2 );
	        	}
		        System.out.println("edge from "+node1+" to " + node2);

	        }
        
	        // finally, get starting node
	        Integer startingnode = in.nextInt();
	        System.out.println("starting nodes:"+ startingnode );
	        
	        // now parse that sucker
	        System.out.println("nodes:"+ nodes + "  size of map: "+ nodeMap.size() );
	        
	        // 1. start with start node
	        
	        // 2. find all nodes connected to that node ( could have been 
	        
	        
	        // keep distances in order
//	        Map<Integer, Integer> distances = new TreeMap<Integer, Integer>();
	        
//	        // for each node that is not the starting, traverse tree for the distance
//	        for ( int j=1; j<=nodes;j++ ) {
//		        if ( j==startingnode ) {
//		        	continue;
//		        }
//	        
//		        int distance = parseTree ( nodeMap, startingnode, j, null);
//		        if ( distance==0 ) { // not found
//		        	distances.put(j, -1);
//		        }
//		        else {
//		        	distances.put(j, distance);
//		        }
//		        
//		        System.out.printf("%d ", distances.get(j));
//	        }
	        System.out.println("");
	    }
        
        in.close();
       
    }
    
    /**
     * Return the distance between the starting node and the target
     * 
     * @param nodeMap
     * @param startingNo
     * @param targetNode
     * @return
     */
	public static final int parseTree(Map<Integer, Node> nodeMap, int startingNo, int targetNode,
			Set<Integer> alreadySearched) {
    
    	BreadthFirst2.Node startingNode = nodeMap.get(startingNo);
	     
    	//base case!
    	if ( nodeMap.isEmpty() ) {
    		return 0;
    	}
    	
    	// is target in any of the edges of the  passed node?
    	for ( Integer nextNode: startingNode.edges) {
    		if ( nextNode.equals(targetNode)) {
    			return 6;
    		}
    	}
    	
    	if ( alreadySearched==null) {
    		alreadySearched=new HashSet<Integer>();
    	}
		alreadySearched.add(startingNo);

    	// not found in immediate neighbors; recursively call parseTree for the next
    	int subTreeDistance=0;
    	for ( Integer nextNode: startingNode.edges) {
    		
    		if ( alreadySearched.contains(nextNode) ) {
    			System.out.println("Circle!!!!!");
    			continue;
    		}
    		
    		if ( (subTreeDistance = parseTree( nodeMap, nextNode ,targetNode, alreadySearched )) > 0) {
    			return subTreeDistance;
    	
    	}
    	}
    	
    	return 0;
    }
    
    public class Node {
    	public int value;
    	Set<Integer> edges;
    	public boolean visited;
    	public int distance;
    	
		public Node(int v) {
			value = v;
			edges = new HashSet<Integer>();
			distance = -1;
		}
    	
    }
}
