public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void addLast(int data){
        Node newNode=new Node(data);
        if(head == null)
        {
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void prirnt()
    {
        Node temp=head;
        if(head ==  null)
        {
            System.out.println("Empty !");
        }
        while(temp != null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.prirnt();
        System.out.println();
    }
}
