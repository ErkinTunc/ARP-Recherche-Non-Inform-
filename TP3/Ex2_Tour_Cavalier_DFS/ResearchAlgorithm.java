package Ex2_Tour_Cavalier_DFS;

import java.util.LinkedList;
import java.util.List;

/**
 * This is a uninformed research algorithm implementing a breadth-first search (BFS) strategy
 * Algorithme de recherche non informée implémentant une stratégie de parcours en profondeur (DFS)
 * 
 */
public class ResearchAlgorithm {

    int depthLimit = 10; // Limite de profondeur par défaut

    public static Node search(KnightsTourProblem problem)
    {
        int counter = 0;
        List<Node> frontier = new LinkedList<>();

        Node root = new Node(problem.initialState(), null, null);
        frontier.add(root); // Starts with the root node
        
        while ( ! frontier.isEmpty() )
        {
            Node currentNode = frontier.remove(0);
            counter += 1;
            
            if (problem.isGoalState(currentNode.getState())) // Condition d'arrêt qu'on va exploiter pour faire un tour fermé
            {
                System.out.println("Found a solution after evaluating " + counter + " nodes.");
                return currentNode;
            }


            frontier.addAll(currentNode.expand(problem));  // Exploration des enfants du noeud courant => parcours en largeur
        }
        return null;
    }
}
