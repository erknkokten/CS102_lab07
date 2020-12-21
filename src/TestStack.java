public class TestStack {
    public static void main(String args[]){
        SimpleStackWithQueue stack = new SimpleStackWithQueue();

        stack.push("1st item");
        System.out.println(stack.toString());
        stack.push("2nd item");
        System.out.println(stack.toString());
        stack.push("3rd item");
        System.out.println(stack.toString());
        stack.push("4th item");
        System.out.println(stack.toString());

        while(!stack.isEmpty()){
            stack.pop();
            System.out.println(stack.toString());
        }

    }
}
