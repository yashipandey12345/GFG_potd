/*
class Node {
    int data;
    Node next, random;

    Node(int d)
    {
        data = d;
        next = random = null;

    }
}*/


class Solution {
    Node copyList(Node head) {
        if (head == null) return null;

        // Step 1: Weave the original list with copied nodes
        Node current = head;
        while (current != null) {
            Node copy = new Node(current.data);
            copy.next = current.next; // link the copied node
            current.next = copy; // link the original node to the copied node
            current = copy.next; // move to the next original node
        }

        // Step 2: Set the random pointers for the copied nodes
        current = head;
        while (current != null) {
            if (current.random != null) {
                current.next.random = current.random.next; // link copied random pointer
            }
            current = current.next.next; // move to the next original node
        }

        // Step 3: Separate the two lists
        Node original = head;
        Node copyHead = head.next; // the head of the copied list
        Node copyCurrent = copyHead;

        while (original != null) {
            original.next = original.next.next; // restore original list
            if (copyCurrent.next != null) {
                copyCurrent.next = copyCurrent.next.next; // link copied nodes
            }
            original = original.next;
            copyCurrent = copyCurrent.next;
        }

        return copyHead; // return the head of the copied list
    }
}
