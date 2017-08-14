package hackerRank.graphTheory;

import java.util.*;
import java.util.Map.Entry;

public class BreadthFirst3 {

	public static void sout (String s) { System.out.println(s); }
	
    public static void mainRoutine(String[] args) {
    	
    	Date d = new Date();
		
		sout ("start = " +  d.getTime() );
		long start = d.getTime();
		
        Scanner in = new Scanner(System.in);
        int numberOfSets = in.nextInt();
        
        for ( int i=0; i< numberOfSets; i++ ) {
        	System.out.println("round:"+i+"========================================================");
	        int nodes=in.nextInt();
	        int edges=in.nextInt();
	        System.out.printf("nodes %d  edges %d\n", nodes, edges);
	        
	        HashMap<Integer, Node> nodeMap = new HashMap< Integer, Node> ();
	        
	        BreadthFirst3 bf = new BreadthFirst3();
	        
	        // Create that many nodes and put in a map
	        for ( int x=1; x<=nodes; x++ ) {
	        	
	        	BreadthFirst3.Node n = bf.new Node(x);
	        	
	        	nodeMap.put ( x, n );
	        	System.out.println("creating node : " + x);
	        }
	        
	        for(int edge_i=0; edge_i < edges; edge_i++){
	        	
	        	// todo : read a line, 
        		System.out.println("in loop:"  );
	        	
	        	int node1 = in.nextInt();
        		System.out.println("node 1  :" + node1  );
	        	int node2 = in.nextInt();
        		System.out.println("node 2 :" + node2 );
	        	
	        	// get node, add edge to it's list ( next node )
	        	boolean rc=nodeMap.get(node1).edges.add(node2);
	        	if (!rc ) {
//	        		System.out.println("already had :" + node1 + " " + node2 );
	        	}
	        	rc = nodeMap.get(node2).edges.add(node1);
	        	
//		        System.out.println("edge from "+node1+" to " + node2);

	        }
        
	        // finally, get starting node
	        Integer startingnode = in.nextInt();
	        System.out.println("starting nodes:"+ startingnode );
	        
	        // now parse that sucker
	        System.out.println("nodes:"+ nodes + "  size of map: "+ nodeMap.size() );
	        
	        // keep distances in order
	        Map<Integer, Integer> distances = new TreeMap<Integer, Integer>();
	        
	      //  printNodes(nodeMap);
	        
	        // initialize distances map
	        for ( int j=1; j<=nodes;j++ ) {
	        	distances.put(j, -1);
	        
	        }

	        parseNode(nodeMap, startingnode, distances, 0);
	        
	        for ( Map.Entry<Integer, Integer> e: distances.entrySet()) {
				if ( e.getKey()==startingnode ) continue;
	        	System.out.print(e.getValue() +" ");
			}
	        
//	        oldParseGraph(nodes, nodeMap, startingnode, distances);
	        System.out.println("");
	    }
        
        in.close();
       
        Date end = new Date();
        sout (" end="+end);
        sout (" diff=" + (end.getTime()-start));
    }

	public static void oldParseGraph(int nodes, HashMap<Integer, Node> nodeMap, Integer startingnode,
			Map<Integer, Integer> distances) {
		// for each node that is not the starting, traverse tree for the distance
		for ( int j=1; j<=nodes;j++ ) {
		    if ( j==startingnode ) {
		    	continue;
		    }
		
		    int distance = parseTree ( nodeMap, startingnode, j, null);
		    if ( distance==0 ) { // not found
		    	distances.put(j, -1);
		    }
		    else {
		    	System.out.println("for key " + j + " distance found : " +distance);
		    	if ( !distances.containsKey(j) || ( distances.containsKey(j) && distance < distances.get(j) ) ) {
		    		distances.put(j, distance);
		    	}
		    }
		    
		    //System.out.printf("%d ", distances.get(j));
		}
	}
    
	public static final void printNodes(Map<Integer, Node> nodeMap ) {
    
		for ( Entry<Integer,Node> curr : nodeMap.entrySet()) {
			
			System.out.println( "node:" + curr.getKey()  );
			
			Node n = curr.getValue();
			
			for ( Integer e : n.edges ) {
				System.out.println( "	edge :" + e );
					
			}
		}
	}
    
	public static void parseNode ( Map<Integer, Node> nodeMap, int startingNode, Map<Integer, Integer> dist , int depthSoFar ) {
		
		depthSoFar+=6;
		
		Node n = nodeMap.get(startingNode);
		
		// loop through neighbor nodes 
		for ( Integer i : n.edges ) {
			if ( dist.get(i)==-1 || dist.get(i) > depthSoFar) {
				dist.put(i, depthSoFar);
				// we've found a new or shorter path. Descend further
				parseNode ( nodeMap, i, dist, depthSoFar);
			}
			
		}
	}
	
    public static void main(String[] args) {
//    	test1();
    	
    	 mainRoutine(args);
    }
    
	public static void test1 () {
	System.out.println("test1");
		Map<Integer, Node> nodes = new HashMap<Integer, BreadthFirst3.Node>();
		
		BreadthFirst3 bf = new BreadthFirst3();
	       
		Node n1 = bf.new Node(1);
		n1.edges.add(2);
		nodes.put (Integer.valueOf(1), n1 );

		Node n2 = bf.new Node(2);
		n1.edges.add(2);
		nodes.put (Integer.valueOf(2), n2 );

		Node n3 = bf.new Node(3);
		nodes.put (Integer.valueOf(3), n3);
		
		Map<Integer, Integer> dist = new HashMap<Integer, Integer>();
		dist.put(1, -1);
		dist.put(2, -1);
		dist.put(3, -1);

		parseNode ( nodes, 1, dist, 0);

		for ( Map.Entry<Integer, Integer> e: dist.entrySet()) {
			System.out.println(e);
		}
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
    
    	BreadthFirst3.Node startingNode = nodeMap.get(startingNo);
	     
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
    			//System.out.println("Circle!!!!!");
    			continue;
    		}
    		
    		if ( (subTreeDistance = parseTree( nodeMap, nextNode ,targetNode, alreadySearched )) > 0) {
    			return subTreeDistance + 6;
    		}
    	}
    	
    	return 0;
    }
    
    public class Node {
    	public int value;
    	Set<Integer> edges;
    	public boolean visited;
    	
		public Node(int v) {
			value = v;
			edges = new HashSet<Integer>();
		}
    	
    }
}
