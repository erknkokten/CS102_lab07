public class Node {
    String data;
    Node next;
    Node tail;

    public Node(String data, Node next){
        this.next = next;
        this.data = data;
    }

    public Node(String data){
        this.data = data;
        next = null;
        tail = null;
    }

    public String getValue(){
        return  data;
    }

    public void setValue(String str){
        data = str;
    }

    public void setNext(Node node){
        next = node;
    }

    public Node getTail(){
        return tail;
    }
    public void setTail(Node node){
        tail = node;
    }

    public Node getNext(){
        return next;
    }
    public String toString(){
        if (this != null)
            return "Node value: " + getValue();
        return "Node value: " + null;
    }
}
