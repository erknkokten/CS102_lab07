public class SimpleQueue {

    SimpleLinkedList simpleLinkedList;

    public SimpleQueue(){
        simpleLinkedList = new SimpleLinkedList();

    }

    public void enqueue(String data){
        simpleLinkedList.addToTail(data);
    }

    public String dequeue(){
        return simpleLinkedList.removeFromHead();
    }

    public boolean isEmpty(){
        return simpleLinkedList.isEmpty();
    }

    public String toString(){
        return simpleLinkedList.toString();
    }
}
