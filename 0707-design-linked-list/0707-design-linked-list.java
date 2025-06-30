class Node{
    int data;
    Node next;
    Node (int val){
        this.data=val;
        this.next=null;
    }
}

class MyLinkedList {
    Node head;
    public MyLinkedList() {
        head=null;
    }
    
    public int get(int index) {
        Node temp=head;
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        if(index<0 || index>=s) return -1;
        temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node newNode=new Node(val);
        newNode.next=head;
        head=newNode;
    }
    
    public void addAtTail(int val) {
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }
        else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    
    public void addAtIndex(int index, int val) {
        Node temp=head;
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        if(index<0 || index>s)return ;
        if(index==0){
            addAtHead(val);
            return;
        }
        if(index==s){
            addAtTail(val);
            return ;
        }
        Node newNode=new Node(val);
        temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    
    public void deleteAtIndex(int index) {
        int ss=0;
        Node temp=head;
        while(temp!=null){
            ss++;
            temp=temp.next;
        }
        if (index < 0 || index >= ss || head == null) return;
        if (index == 0) {
            head = head.next;
            return;
        }
        temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

