public class Trail{
    
    Node head;
    private int size;
    Trail(){
        
    }
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public int size(){
        return size;
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
            newNode = head;
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
    public void deleteIdx(int n){
        Node currNode = head;
        if(n > size){
            System.out.println("input is greater than list size");
        }
        else{
            int b = 1;
            while(b < n-1){
                currNode = currNode.next;
                b++;
            }
            currNode.next = currNode.next.next;
        }
    }
    public void printIdx(String data , int n){
        Node tempNode = new Node(data);
        Node currNode = head;
        if(n > size){
            System.out.println("input is greater than list size");
        }
        else{
            int b = 1;
            while(b < n-1){
                currNode = currNode.next;
                b++;
            }
            currNode.next = tempNode;
            tempNode.next = currNode.next.next;
        }
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

    public static void main(String[] args) {
        Trail List = new Trail();
        List.addFirst("saurabh");
        List.addLast("is");
        List.addLast("a");
        List.addLast("handsome");
        List.addLast("guy");
        List.printlist();
        List.deleteIdx(4);
        List.printlist();
        List.printIdx("gay", 2);
        List.printlist();
    }
}