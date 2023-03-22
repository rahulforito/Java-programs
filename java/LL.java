class LL {
    private static final LL.Node Node = null;
    private int size;
    LL(){
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
    public void printFirst(String data){
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
    public void printLast(String data){
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
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty nothing to be delete");
        }
        head = head.next;
        size--;
    }
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty nothing to be delete");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int printSize(){
        return size;
    }
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update 
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public Node reverseRecursive(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        Node newNode = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;

    }

    public static void main(String[] args) {
        LL list = new LL();
        list.printFirst("a");
        list.printFirst("is");
        list.printFirst("This");
        list.printlist();
        list.printLast("list");
        list.printlist();
        list.deleteLast();
        list.printlist();
        list.deleteFirst();
        list.printFirst("this");
        
        list.printLast("list");
        list.printlist();
        System.out.println(list.printSize());
        list.head = list.reverseRecursive(list.Node);
        list.printlist();
        
    }
}
