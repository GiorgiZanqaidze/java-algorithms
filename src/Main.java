import stack_data.Stack;

public class Main {
    public static void main(String[] args) {
        // int[] array = {1, 2, 3, 5};

        // Node generatedNodes = insertNodes(array);
        // display(generatedNodes);
        Stack s = new Stack(); 
        // s.push(10); 
        // s.push(20); 
        // s.push(30);
        // System.out.println(s.pop() + " Popped from stack"); 
        System.out.println("Top element is :" + s.peek()); 
        System.out.print("Elements present in stack :"); 
        s.print(); 
    };
}