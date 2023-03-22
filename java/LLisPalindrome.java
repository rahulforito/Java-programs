import java.util.Currency;

public class LLisPalindrome {
    private int size;
    LLisPalindrome(){
        size = 0;
    }
    Node head;
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = next;
        }
    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            size++;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
        size++;
    }
    public void printlist(){
        if(head == null){
            System.out.println("the string is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public Node getMiddle(Node head){
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = head.next;
            fast = head.next.next;
        }
        return slow;
    }
    public Node reverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prevNode = null;
        Node curNode = head;
        while(curNode != null){
            Node nextNode = curNode.next;
            curNode.next = prevNode;
            //update
            prevNode = curNode;
            curNode = nextNode;
        }
        return prevNode;
    }
    public boolean isPalindrome(){
        if(head == null || head.next == null){
            return true;
        }
        Node FirsthalfEnd = getMiddle(head);
        Node secoundHalfStart = reverse(FirsthalfEnd.next);
        Node FirsthalfStart = head;

        while(secoundHalfStart != null){
            if(FirsthalfStart.data != secoundHalfStart.data){
                return false;
            }
            secoundHalfStart = secoundHalfStart.next;
            FirsthalfStart = FirsthalfStart.next;
        }
        return true;
    }
    public static void main(String[] args) {
        LLisPalindrome list = new LLisPalindrome();
        list.addFirst("it");
        list.addFirst("is");
        list.addFirst("a");
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("it");
        list.printlist();
        list.addFirst("yo");
        list.printlist();
        System.out.println(list.isPalindrome());
    }
}
