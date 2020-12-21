public class TestSimpleLinkedList {
    public static void main(String args[]){
       //Node node1 = new Node("Hi0");
       //Node node2 = new Node("Hi1");
       //Node node3 = new Node("Hi2");
       //Node node4 = new Node("Hi3");
       //Node node5 = new Node("Hi4");

        SimpleLinkedList simpleLinkedList = new SimpleLinkedList();

        simpleLinkedList.addToTail("Hi0");
        simpleLinkedList.addToTail("Hi1");
        simpleLinkedList.addToTail("Hi2");
        simpleLinkedList.addToTail("Hi3");
        simpleLinkedList.addToTail("Hi4");

        System.out.println(simpleLinkedList.toString());
        System.out.println(simpleLinkedList.get("Hi3"));
        System.out.println(simpleLinkedList.get(0).toString());
        System.out.println(simpleLinkedList.toString());
        System.out.println(simpleLinkedList.isEmpty());

        while(!simpleLinkedList.isEmpty()){
            simpleLinkedList.removeFromHead();
            System.out.println(simpleLinkedList.toString());
            System.out.println(simpleLinkedList.isEmpty());
        }




    }
}
