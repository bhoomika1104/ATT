class ListNode{
    int data;
    ListNode next;
    ListNode(int d){
        data = d;
        this.next = null;
    }
}


class SLL{
    ListNode head;
    SLL(){
    head = null;
}
void insertAtHead(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
}
void insertAtTail(int data){
        ListNode temp=null;
        temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode newNode1 = new ListNode(data);
        if(head==null){
            head = newNode1;
            return;
        }
        temp.next = newNode1;

}
int size(ListNode head){
        int count=0;
        ListNode temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
}
void insertAtIndex(int data, int index){
        if(head==null ||index==1||index==0){
            insertAtHead(data);
            return;
        }
        int size = size(head);
        if(index<0 ||size<index)
            System.out.println("Index out of bounds");

        ListNode newNode = new ListNode(data);
        ListNode temp = head;
        while(index!= 2){
            index--;
            temp=temp.next;

        }
        ListNode next = temp.next;
        temp.next = newNode;
        newNode.next = next;
}
void printList(){
        ListNode temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
}
//void deleteAtIndex(int index){
//        ListNode temp = head;
//        while(index !=1){
//            index--;
//            temp=temp.next;
//        }
//        temp= temp.next.next;
//}
//void deleteByVal(int value){
//        if(head==null ){
//            System.out.println("Index out of bounds");
//        }
//        else if(size(head)==1){
//            head=head.next;
//        }
//        ListNode temp = head;
//        int count =0;
//        while(temp.data!=value){
//            count++;
//            temp=temp.next;}
//        if(temp.data==value) {
//            deleteAtIndex(count);
//
//        }
//
//        }

    void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (index < 0) {
            System.out.println("Index out of bounds");
            return;
        }
        if (index == 0) {

            head = head.next;
            return;
        }

        ListNode temp = head;
       
        for (int i = 0; i < index - 1; i++) {
            if (temp == null || temp.next == null) {
                System.out.println("Index out of bounds");
                return;
            }
            temp = temp.next;
        }


        if (temp.next != null) {
            temp.next = temp.next.next;
        } else {
            System.out.println("Index out of bounds");
        }
    }

    void deleteByVal(int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        ListNode temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Value not found");
        } else {

            temp.next = temp.next.next;
        }
    }


int deleteAtHead(ListNode head){
    ListNode temp = head;
        if(head==null||head.next==null){
            System.out.println("invalid");
        }

        else{
            temp= temp.next;
            head.next=null;
            head=temp;
        }
    return 1;
}}
class Main
{


    public static void main(String[] args)
    {

    SLL obj = new SLL();
    obj.insertAtHead(1);
    obj.insertAtHead(2);
    obj.insertAtHead(3);
    obj.insertAtTail(4);
    obj.insertAtTail(5);
    obj.insertAtTail(6);
    obj.insertAtIndex(7, 2);
    obj.insertAtIndex(7, 0);
    obj.insertAtIndex(7, 9);
    obj.deleteByVal(7);
    obj.printList();
    }
}
