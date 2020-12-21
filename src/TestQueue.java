public class TestQueue {

    public static void main(String args[]){

        SimpleQueue simpleQueue = new SimpleQueue();

        simpleQueue.enqueue("1st");
        simpleQueue.enqueue("2nd");
        simpleQueue.enqueue("3rd");
        while(!simpleQueue.isEmpty()) {
            System.out.println(simpleQueue.toString());
            System.out.println(simpleQueue.dequeue());
        }
        System.out.println(simpleQueue.toString());
        System.out.println(simpleQueue.dequeue());

    }

}
