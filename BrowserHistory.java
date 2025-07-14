public class BrowserHistory{

    static Node head = null;
    static Node tail = null;
    static class Node{
        String data;
        Node next;
        Node prev;
        public Node(String data){
            this.data = data;
            next = prev = null;
        }
    }
    public static Node createNode(String data){
        return new Node(data);
    }
    public  void append(String data){
            Node newNode = createNode(data);
            if (head == null){
                head = tail = newNode;
            }else{
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
    }
    public static void updateHead(Node curr){
        if (curr == head) return; // already at head

        // Detach curr from its current position
        if (curr.prev != null) {
            curr.prev.next = curr.next;
            // a b c
        }
        if (curr.next != null) {
            curr.next.prev = curr.prev;
        }
        if (curr == tail) {
            tail = curr.prev;
        }

        // Insert curr at head
        curr.prev = null;
        curr.next = head;
        if (head != null) {
            head.prev = curr;
        }
        head = curr;
    }

    public static void searchHistory(String data){
        Node forward = head;
        Node backward = tail;
        Node currVisited = null;
        while (forward != null && backward != null && forward.prev != backward && forward != backward){
            if (forward.data.equals(data)){
                currVisited = forward;
                break;
            }
            if (backward.data.equals(data)){
                currVisited = backward;
                break;
            }
            forward = forward.next;
            backward = backward.prev;
        }
        // Check middle node if forward == backward
        if (forward == backward && forward != null && forward.data == data) {
            currVisited = forward;
        }

        if (currVisited != null) {
            System.out.println("Visited: " + data);
            updateHead(currVisited);
        } else {
            System.out.println("Not found: " + data);
        }
    }

    public static void printList(){
        Node temp = head;
        System.out.print("null < - > ");
        while(temp != null){
            System.out.print(temp.data + " < - > ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        BrowserHistory list = new BrowserHistory();
        list.append("google.com");
        list.append("linkedin.com");
        list.append("youtube.com");
        printList();
        searchHistory("linkedin.com");
        searchHistory("youtube.com");
        printList();
    }
}