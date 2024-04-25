// Class to implement node
public class Node {
    int key;

    // Array to hold pointers to node of different level
    Node[] forward;

    Node(int key, int level)
    {
        this.key = key;

        // Allocate memory to forward
        forward = new Node[level + 1];
    }
}
