class Solution {
    // Function to reverse a circular linked list
    Node reverse(Node head) {
        if (head == null || head.next == head) {
            return head;
        }

        Node prev = null;
        Node curr = head;
        Node nextNode = null;

        Node tail = head;
        do {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        } while (curr != head);

        // Now, prev is the new head, and tail (which was the old head) should point to it.
        head.next = prev;
        return prev; // new head
    }

    // Function to delete a node from the circular linked list
    Node deleteNode(Node head, int key) {
        if (head == null) return null;

        Node curr = head;
        Node prev = null;

        // Case 1: If the head itself holds the key to be deleted
        if (head.data == key) {
            // Find the last node to update its next to the new head
            Node tail = head;
            while (tail.next != head) {
                tail = tail.next;
            }
            
            // If head is the only node in the list
            if (head.next == head) {
                return null; // Empty list after deletion
            }
            
            // Update the head
            tail.next = head.next;
            head = head.next; // Move head to the next node
            return head;
        }

        // Case 2: Deleting any node except head
        do {
            prev = curr;
            curr = curr.next;
            if (curr.data == key) {
                prev.next = curr.next;
                return head;
            }
        } while (curr != head);

        return head; // If key was not found, return the unchanged list
    }
}
