package hackerRank.graphTheory.blindingLights;

import java.util.*;
import java.util.Map.Entry;

public class BlindingLights {

	public static void sout (String s) {
		System.out.println(s); 
		}
	
	List < Map<Integer, Integer>> distances ;
	
	/**
	 *  Adds a tuple < from, to, distance> to distances - adding structures 
	 *  	as needed.
	 *  If the distance passed is shorter that what is stored, it will be replaced.
	 *  
	 * @param fromNode
	 * @param toNode
	 * @param distance
	 */
	public void addToDistances ( int fromNode, int toNode , int distance) {
		Map <Integer, Integer> tempMap;
		
		// didn't have an entry . add one
		if ( distances.get(fromNode)==null) {
			tempMap=new HashMap <Integer, Integer>();
			tempMap.put(toNode, distance);
			distances.set(fromNode, tempMap);
		} else {
			tempMap=distances.get(fromNode);
			if ( tempMap.containsKey(toNode)) {
				if ( tempMap.get(toNode)>distance ) {
					tempMap.put(toNode, distance);
				}
			} else {
				tempMap.put(toNode, distance);
			}
			
		}
		
	}
	
	/**
	 * return a previously found distance from the distance structure.
	 * 
	 * return -1 if not found
	 * 
	 * @param fromNode
	 * @param toNode
	 * @return
	 */
	public int getDistance ( int fromNode, int toNode ) {

		if ( distances.get(fromNode)!=null) {
			Map<Integer, Integer> distMap = distances.get(fromNode);
			if ( distMap.containsKey(toNode)) {
				return distMap.get(toNode);
			}
		}
		return -1;
	}
	
    public  void mainRoutine(String[] args) {
    	
    	Date d = new Date();
		
		sout ("start = " +  d.getTime() );
		long start = d.getTime();
		
        Scanner in = new Scanner(System.in);
        
        int nodes=in.nextInt();
        int edges=in.nextInt();

        sout ("nodes   edges "+ nodes+ edges);
	        
        distances= new ArrayList<Map<Integer,Integer>>(nodes+1);
        initializeList(nodes+1);
        
	    HashMap<Integer, Node> nodeMap = new HashMap< Integer, Node> ();
	        
        // Create that many nodes and put in a map
        for ( int x=1; x<=nodes; x++ ) {
        	
        	Node n = new Node(x);
        	
        	nodeMap.put ( x, n );
        	sout("creating node : " + x);
        }
	        
	    for(int edge_i=0; edge_i < edges; edge_i++){
	        	
        	int node1 = in.nextInt();
//        		System.out.println("node 1  :" + node1  );
        	int node2 = in.nextInt();
//        		System.out.println("node 2 :" + node2 );

        	int distance = in.nextInt();
        	
        	// get node, add edge to it's list ( next node )
        	Integer prevValue= nodeMap.get(node1).edges.put(node2, distance);
	    
        	sout ( " added edge from " + node1 + " to "+ node2 + " costing " + distance);
        	if (prevValue==null) {
//	        		System.out.println("already had :" + node1 + " " + node2 );
	        }
	
	   }
       
	    sout ( "size of nodes :"+ nodeMap.size() );
	    
	    Integer numQuestions = in.nextInt();
	    sout ( "num questions : " + numQuestions );
	    
	    for ( int ques=0; ques < numQuestions; ques++ ) {
	        // finally, get starting node
	        Integer startingnode = in.nextInt();
	        Integer endNode = in.nextInt();
	        
	        sout("starting / ending nodes:"+ startingnode + " " + endNode);
	      
	        int dist= parseNode(nodeMap, startingnode, endNode,  0);
	        
	        System.out.println(dist+"");
	    }
        
        in.close();
       
        Date end = new Date();
        sout (" end="+end);
        sout (" diff=" + (end.getTime()-start));
    }
    
	public  int parseNode ( Map<Integer, Node> nodeMap, 
			int startingNode, int endNode, int depthSoFar ) {
		
		sout ("starting at "+ startingNode+ " with depthso Far of " + depthSoFar);
		
		if ( startingNode==endNode ) {
			return 0;
		}
		
		Node n = nodeMap.get(startingNode);
		
		int minDistance=-1;
		// loop through neighbor nodes 
		for ( Map.Entry<Integer, Integer> i : n.edges.entrySet() ) {
			sout ( "checking edge to node "+ i.getKey() + " with cost "+ i.getValue() );
		
			int neighborDist=-1;
			if ( i.getKey()==endNode) {
				
				 neighborDist= depthSoFar+i.getValue();
				
			} else {
				neighborDist = parseNode ( nodeMap,  i.getKey(), endNode, i.getValue()+depthSoFar);
				if ( neighborDist ==-1 ) continue;
			}
		
			if ( minDistance==-1 ) minDistance=neighborDist;
			else if ( neighborDist < minDistance ) minDistance=neighborDist;
	
		}
		
		// the 'starting' node was a leaf that didn't match the target left; return -1 for not found
		return minDistance;
	}
	
	void initializeList ( int xx ) {
//		distances.
		for ( int i=1; i<=xx; i++) {
			distances.add( null);
		}
		sout ( "size = " + distances.size());
		
	}
	
	void testRoutine() {
		sout("sadfa");
		distances=new ArrayList<>(7);
		initializeList(7);
		
		addToDistances(1, 2, 10);
		int t = getDistance(2, 4);
		sout ( "" + t);
		t = getDistance(1, 2);
		sout ( "" + t);
		t = getDistance(2, 1);
		sout ( "" + t);

	}
	
    public static void main(String[] args) {

    	BlindingLights bf = new BlindingLights();
  	   
    	//bf.mainRoutine(args);
    	bf.testRoutine();
    }
        
    
    public class Node {
    	public int value;
    	
    	// directional edges and their distance; key is node, value is distance
    	Map<Integer, Integer> edges;
    	public boolean visited;
    	
		public Node(int v) {
			value = v;
			edges = new HashMap<Integer, Integer>();
		}
    	
    }
}
