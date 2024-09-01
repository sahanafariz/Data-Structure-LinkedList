package LinkedList;
import java.util.Scanner;

class LinkNode{
    int data;
    LinkNode next;

    LinkNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class List {
    LinkNode head;

	    // Function to insert a new node at the end of the list
    public void insert(int data) {
        LinkNode newNode = new LinkNode(data);
        if (head == null) {
            head = newNode;
        } else {
        	LinkNode temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	    }

	    // Function to count the total number of nodes in the list
	    public int count() {
	        int count = 0;
	        LinkNode temp = head;
	        while (temp != null) {
	            count++;
	            temp = temp.next;
	        }
	        return count;
	    }

	    // Function to sum all the elements in the list
	    public int sumEle() {
	        int sum = 0;
	        LinkNode temp = head;
	        while (temp != null) {
	            sum += temp.data;
	            temp = temp.next;
	        }
	        return sum;
	    }
	}

	public class CountAndSum {
	    public static void main(String[] args) {
	        List list = new List();
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        for (int i = 0; i < n; i++) {
	            int element = scanner.nextInt();
	            list.insert(element);
	        }

	        int nodeCount = list.count();
	        int sum = list.sumEle();

	        System.out.println("Count: " + nodeCount);
	        System.out.println("Sum of elements: " + sum);

	        scanner.close();
	    }
	}
