import java.util.ArrayList;

public class SimpleLinkedList {
    Node head;
    public SimpleLinkedList(){
        head = new Node(null);
        head.setTail(null);
        head.setNext(null);

    }
    public void addToTail(String data){
        Node temp = head;
        while(temp.getTail() != null) {
            temp = temp.getTail();
        }
        Node newNode = new Node(data);
        newNode.setNext(temp);
        temp.setTail(newNode);

    }
    public String removeFromHead(){
        String str;

        if(head.getTail()!= null) {
            str = head.getTail().getValue();
            Node temp = new Node(head.getTail().getValue());
            if(head.getTail().getTail()!= null){
                temp.setTail(head.getTail().getTail());
                Node node;
                node = head.getTail().getTail();
                head = temp;
                node.setNext(head);
                return str;
            }
            else {
                head.setTail(new Node(null));
                head.setNext(new Node(null));
                head.setValue(temp.getValue());
                head = temp;
                return str;
            }
        }
        else
            str = "";
            head = new Node(null);
            return str;
    }

    public boolean isEmpty(){
        if(head.getTail() == null)
            return true;
        return false;
    }
    public Node get(String data){
        Node temp = head;
        while(temp.getTail() != null && temp.getValue() != null) {

            if(temp.getValue().equals(data))
                return temp;

            temp = temp.getTail();

        }
        return null;
    }

    public Node get(int index){
        Node temp = head;
        int i = 0;
        while(temp.getTail() != null) {
            temp = temp.getTail();
        }

        while(temp.getNext() != null){
            if(i == index)
                return temp;

            temp = temp.getNext();
            i++;
        }
     return (new Node(null));
    }

    public String toString(){
        ArrayList<String> str = new ArrayList<>();
        Node temp = head;
        while(temp.getTail() != null) {
            temp = temp.getTail();
        }
        while(temp.getNext() != null){
            str.add(temp.getValue());
            temp = temp.getNext();
        }
        return str.toString();

    }
}
