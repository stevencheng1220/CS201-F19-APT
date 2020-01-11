import java.util.*;

public class Ograph {
    private Map<String, Set<String>> myGraph;
    private Set<String> nodes;

    public int[] components(String[] data) {
        buildGraph(data);
        nodes = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(String v : myGraph.keySet()) {
            if (! nodes.contains(v)) {
                Set<String> connected = dfs(v);
                nodes.addAll(connected);
                list.add(connected.size());
            }
        }
        int[] res = new int[list.size()];
        for (int k = 0; k < list.size(); k += 1) {
            res[k] = list.get(k);
        }
        Arrays.sort(res);
        return res;
    }

    private void buildGraph(String[] data) {
        myGraph = new TreeMap<>();
        for (int k = 0; k < data.length; k++) {
            String s = data[k];
            String v = "" + k;
            String[] adj = s.split(" ");

            for (String a : adj) {
                myGraph.putIfAbsent(v, new TreeSet<>());
                myGraph.putIfAbsent(a, new TreeSet<>());
                myGraph.get(v).add(a);
                myGraph.get(a).add(v);
            }
        }
    }

    private Set<String> dfs(String start){
        Set<String> visited = new TreeSet<>();
        Stack<String> st = new Stack<>();
        st.add(start);
        visited.add(start);
        while(st.size() > 0){
            String v = st.pop();
            for (String adj : myGraph.get(v)){
                if (! visited.contains(adj)){
                    st.push(adj);
                    visited.add(adj);
                }
            }
        }
        return visited;
    }
}

// First buildGraph by initializing required TreeSets.
// Then, we do depth-first-search (stacks) on the initialized graph to see the breadth (size) of each connected nodes.
// Add each connected node into an ArrayList, then sort the list and return.