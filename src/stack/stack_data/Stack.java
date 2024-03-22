package stack_data;
import java.util.Arrays;

public class Stack { 
    static final int MAX = 10; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() { 
        return (top < 0); 
    } 

    public Stack() { 
        top = -1; 
        System.out.println("default stack items" + Arrays.toString(a));
    } 
  
    public boolean push(int x) { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    public int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
  
    public int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
     
    public void print(){ 
        System.out.println("result stack items" + Arrays.toString(a));
    for( int i = top; i > -1; i-- ) { 
      System.out.print(" "+ a[i]); 
    } 
  } 
} 
  
