package LinkedList;

/**
 *
 * @author kevin.mcdonald
 * @date 24th November 2016
 */
public class IntNode {
    private final int data;
    private IntNode next;
    
    public IntNode (int _data){
        data = _data;
        next = null;
    }
    
    public int getData(){
        return data;
    }
    
    public IntNode getNextNode(){
        return next;
    }
    
    public void setNext(IntNode _next){
        next = _next;
    }
}
