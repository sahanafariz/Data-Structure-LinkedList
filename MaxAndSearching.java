package LinkedList;
import java.util.Scanner;

class ListNode {  // Renamed from 'Node'
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
    }
}

class CustomLinkedList {  // Renamed from 'LinkedList'
    ListNode head;

    // Insert at the end of the list
    public void insert(int data) {
        if (head == null) {
            head = new ListNode(data);
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(data);
        }
    }

    // Find the maximum element
    public int findMax() {
        int max = head.data;
        for (ListNode temp = head; temp != null; temp = temp.next) {
            max = Math.max(max, temp.data);
        }
        return max;
    }

    // Search for an element
    public boolean search(int key) {
        for (ListNode temp = head; temp != null; temp = temp.next) {
            if (temp.data == key) return true;
        }
        return false;
    }
}

public class MaxAndSearching {
    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();  // Using renamed class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            list.insert(scanner.nextInt());
        }

        System.out.println("Maximum element: " + list.findMax());

        System.out.println("Enter the element to search:");
        int key = scanner.nextInt();
        System.out.println(list.search(key) ? "Element found!" : "Element not found!");

        scanner.close();
    }
}
