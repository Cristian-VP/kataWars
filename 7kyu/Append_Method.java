class Node {

    int data;
    Node next = null;

    Node(final int data) {
        this.data = data;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public static Node push(final Node head, final int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public static Node buildOneTwoThree() {
        Node head = null;
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);
        return head;
    }


    public static Node append(Node listA, Node listB) {
        if(listA == null && listB == null) return null;
        if(listA == null) return listB;
        if(listB == null) return listA;

        Node tailA  = listA;

        while (tailA.next != null){
            tailA = tailA.next;
        }

        tailA.next = listB;


        return listA;
    }
}