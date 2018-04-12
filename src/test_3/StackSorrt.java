package test_3;

import java.util.Stack;

public class StackSorrt {

	static void sortedInsert(Stack<Integer> s, int x)
    {
        if (s.isEmpty() || x > s.peek())
        {
            s.push(x);
            return;
        }
        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }
      
   
    static void sortStacks(Stack<Integer> s)
    {
        if (!s.isEmpty())
        {
            int x = s.pop();
            sortStacks(s);
            sortedInsert(s, x);
        }
    }
    
    static void insert_at_bottom(int x,Stack<Integer> stack){
    	 
        if(stack.isEmpty())
            stack.push(x);
 
        else{    
            int a = stack.peek();
            stack.pop();
            insert_at_bottom(x,stack);
            stack.push(a);
        }
    }
    static void  reverse(Stack<Integer> stack)
    {
        if(stack.size()>0)
        {
            int x = stack.peek();
            stack.pop();
            reverse(stack);
            insert_at_bottom(x,stack);
        }
    }


	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();

		st.push(5);
		st.push(2);
		st.push(1);
		st.push(4);
		st.push(3);
		sortStacks(st);
		reverse(st);
		while(!st.isEmpty()){
			System.out.println(st.pop());
		}
	}
}
