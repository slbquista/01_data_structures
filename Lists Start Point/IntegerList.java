package LinkedList;

/**
 *
 * @author kevin.mcdonald
 * @date 24th November 2016
 */
public class IntegerList{
    private IntNode head;
    private IntNode tail;
    
    public IntegerList(){
        head = null;
        tail = null;
    }
    
    public void insertAtFront(int _item){
        if(isEmpty()){
            head = tail = new IntNode(_item);
        }else{
            IntNode temp = new IntNode(_item);
            temp.setNext(head);
            head = temp;
        }
    }
    
    public void insertAtBack(int _item){
        if(isEmpty()){
            head = tail = new IntNode(_item);
        }else{
            IntNode temp = new IntNode(_item);
            tail.setNext(temp);
            tail = temp;
        }
    }
    
    public boolean isEmpty(){
        return head == null;
    }
    
    public void traverse(){
        if(isEmpty()){
            System.out.println("List is empty!");
        }else{
            IntNode temp = head;
            while (temp != null){
                System.out.println(temp.getData());
                temp = temp.getNextNode();
            }
        }
    }
    
    //  Can include other standard list functions like removing items, peek etc.
}
