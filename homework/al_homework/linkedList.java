package al_homework;

//ListNode代表一个节点
class ListNode{
    public int val;
    public ListNode next;

    //构造函数
    public ListNode(int a){
        this.val = a;
    }
}

public class linkedList {
    public static void main(String []args){
        MyLinkedList mylinkedlist = new MyLinkedList();
        mylinkedlist.creatList();
        System.out.println(countList(mylinkedlist.head));
    }
    public static int countList(ListNode myList){
        if(myList.next==null) return 1;
        else return countList(myList.next)+1;
    }
    public static class MyLinkedList {

        public ListNode head;//链表的头

        public void creatList() {
            ListNode listNode1 = new ListNode(11);
            ListNode listNode2 = new ListNode(22);
            ListNode listNode3 = new ListNode(33);
            ListNode listNode4 = new ListNode(44);
            ListNode listNode5 = new ListNode(55);

            this.head = listNode1;

            listNode1.next = listNode2;
            listNode2.next = listNode3;
            listNode3.next = listNode4;
            listNode4.next = listNode5;

        }
    }
}
