public class SimpleStackWithQueue {
    SimpleQueue queue1, queue2;

    public SimpleStackWithQueue(){
        queue1 = new SimpleQueue();
        queue2 = new SimpleQueue();

    }

    public void push(String data){
        queue2.enqueue(data);
        while(!queue1.isEmpty()){
            queue2.enqueue(queue1.dequeue());
        }
        SimpleQueue temp = queue1;
        queue1 = queue2;
        queue2 = temp;

    }

    public String pop(){
        return queue1.dequeue();

    }

    public String toString(){
        return queue1.toString();
    }

    public boolean isEmpty(){
        return queue1.isEmpty();
    }
}
