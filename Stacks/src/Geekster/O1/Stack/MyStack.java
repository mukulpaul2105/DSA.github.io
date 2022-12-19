package Geekster.O1.Stack;

public class MyStack {
	
	static int MAX = 10;
	int a[] = new int[MAX];
	int top;
	
	boolean isEmpty() {
		return (top < 0);
	}
	
	// It is default constructor so when we create a class then top will be initialized as -1
	MyStack() {
		top = -1;
	}
	
	// Insertion operation is called PUSH 
	boolean push(int x) {
		if(top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = x;
			System.out.println(x + " pushed into stack");
			return true;
		}
	}
	
	// Delete operation in stack is called POP
	int pop() {
		if(top < 0) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			System.out.println(a[top] + " element is removed from stack");
			int x = a[top--];
			return x;
		}
	}
	
	int peak() {
		if(top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			return a[top];
		}
	}
	
	void print() {
		for(int i = top; i > -1; i--) {
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		MyStack s = new MyStack();
		s.push(12);
		s.push(47);
		s.push(88);
		s.push(14);
		s.push(99);
		s.push(92);
		s.push(87);
		s.push(29);
		s.push(87);
		s.push(899);
		s.push(96);
		s.push(28);
		
		s.print();
		s.pop();
		s.print();
	}

}
