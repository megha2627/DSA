/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) return null;

        Queue<Node> q = new LinkedList<>();
        Map<Node, Node> map = new HashMap<>();

        // Step 1: Clone the first node and add to queue
        map.put(node, new Node(node.val, new ArrayList<>()));
        q.add(node);

        // Step 2: BFS traversal
        while (!q.isEmpty()) {
            Node p = q.poll();

            // Traverse all neighbors
            for (Node p1 : p.neighbors) {

                // If neighbor not cloned yet → clone + enqueue
                if (!map.containsKey(p1)) {
                    map.put(p1, new Node(p1.val, new ArrayList<>()));
                    q.add(p1);
                }

                // Connect current node’s clone with neighbor’s clone
                map.get(p).neighbors.add(map.get(p1));
            }
        }

        // Return clone of starting node
        return map.get(node);
    }
}
