
package LinkedList;
import java.util.Scanner;

// Node class to represent each element in the list
class Node {
    int data;
    Node next;
    
    // Constructor to initialize node data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// List class to manage linked list operations
class List {
    Node Head = null;  // Head of the list

    // Method to insert a new node at the end of the list
    public void Insert_end(int data) {
        Node newNode = new Node(data);
        if (Head == null) {  // If list is empty, new node becomes the head
            Head = newNode;
        } else {  // Traverse to the end of the list and insert the new node
            Node temp = Head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Recursive method to print the list in reverse order
    public void Reverse_Print(Node node) {
        if (node == null) {
            return;
        }
        Reverse_Print(node.next);
        System.out.print(node.data + " ");
    }

    // Method to display the list from the head to the end
    public void Display() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

public class SLL2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num;
        List l1 = new List();  // Create an instance of the List class
        
        // Input loop to read numbers until -1 is entered
        while (true) {
            num = inp.nextInt();
            if (num == -1)  // Break the loop if -1 is entered
                break;
            l1.Insert_end(num);  // Insert number at the end of the list
        }
        
        // Print the list in reverse order
        l1.Reverse_Print(l1.Head);
        System.out.println();  // Print a newline after reverse printing
        
        // Display the list in normal order
        l1.Display();
    }
}
