import java.lang.*;

public class linklist{
Node head;

    static class Node{
        int data;
        Node next;

    public Node(int data){
        this.data=data;
        next=null;
        }
    }
    void insert(int data){
        Node toAdd=new Node(data);
        toAdd.next = head;
        head = toAdd;
    }

    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void main(String args[]){
        linklist li = new linklist();
        li.insert(1);
        li.print();
    }
}