package Geekster.O2.Problems;


/* Copy form A to C using Stack       
 * 
 *          |                         |                           |
 *          |                         |                           |
 *       ---|---                      |                       ----|----
         |  | 2|                      |                       |   | 2 |
 	   -----|-----                    |                   --------|--------
       |    |  3 |                    |                   |       | 3     |
 	--------|--------                 |                -----------|-----------  
 	|		|  4  	|                 |                |          |  4       |
    ----------------------------------------------------------------------------------
 			A						  B                           C
 */
//class MyStack {
//	/*
//	 This is a custom Stack and the basic methods are
//	 1. Create a stack
//	 2. Check whether Stack is Empty or not
//	 3. Check whether Stack is Full or not
//	 4. Push Method
//	 5. Pop Method
//	 6. Peek Method
//	 */
//	int capacity;
//	int top;
//	int array[];
//	
//	public MyStack createStack(int capacity) {
//		MyStack stack = new MyStack();
//		stack.capacity = capacity;
//		stack.top = -1;
//		stack.array = new int[capacity];
//		return stack;
//	}
//	
//	boolean isFull(MyStack stack) {
//		return (stack.top == stack.capacity - 1);
//	}
//	
//	boolean isEmpty(MyStack stack) {
//		return (stack.top == -1);
//	}
//	
//	void push(MyStack stack, int item) {
//		if(isFull(stack)) {
//			return;
//		} else {
//			stack.array[++stack.top] = item;
//		}
//	}
//	
//	int pop(MyStack stack) {
//		if(isEmpty(stack)) {
//			return -1;
//		} else {
//			return stack.array[top--];
//		}
//	}
//	
//	int peek(MyStack stack) {
//		if(isEmpty(stack)) {
//			return -1;
//		} else {
//			return stack.array[top];
//		}
//	}
//}

class IntStack {
	
	private int capacity;
	private int top;
	private int[] arry;
	
	
	public IntStack() {
		this.capacity = 10;
		this.top = -1;
		this.arry = new int[capacity];
	}
	
	public IntStack(int capacity) {
		this.capacity = capacity;
		this.top = -1;
		this.arry = new int[capacity];
	}
	
	public boolean isFull() {
		return (this.top == this.capacity - 1);
	}
	
	public boolean isEmpty() {
		return (this.top < 0);
	}
	
	public void push(int item) {
		if(isFull()) {
			System.out.println("Stack Overloaded");
			return;
		} else {
			System.out.println(item + " is inserted in the stack");
			this.arry[++this.top] = item;
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return - 1;
		} else {
			System.out.println(this.arry[this.top] + " Poped out");
			return this.arry[top--];
		}
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return - 1;
		} else {
			System.out.println(this.arry[this.top]);
			return this.arry[top];
		}
	}
}

//----------------------------------------------------------------------------------------------------

class StrStack {
	
	private int capacity;
	private int top;
	private String[] arry;
	
	
	public StrStack() {
		this.capacity = 10;
		this.top = -1;
		this.arry = new String[capacity];
	}
	
	public StrStack(int capacity) {
		this.capacity = capacity;
		this.top = -1;
		this.arry = new String[capacity];
	}
	
	public boolean isFull() {
		return (this.top == this.capacity - 1);
	}
	
	public boolean isEmpty() {
		return (this.top < 0);
	}
	
	public void push(String item) {
		if(isFull()) {
			System.out.println("Stack Overloaded");
			return;
		} else {
			System.out.println(item + " is inserted in the stack");
			this.arry[++this.top] = item;
		}
	}
	
	public String pop() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return "Empty Stack";
		} else {
			System.out.println(this.arry[this.top] + " Poped out");
			return this.arry[top--];
		}
	}
	
	public String peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
			return "Empty Stack";
		} else {
			System.out.println(this.arry[this.top]);
			return this.arry[top];
		}
	}
}

//class MyStack<Type> {
//
//	private Type dataType;
//	
//	private int capacity;
//	private int top;
//	private Type[] sArry;
//	private Type[] iArray;
//	private Type[] cArray;
//	
//	
//	public MyStack(int capacity) {
//		this.capacity = capacity;
//		this.top = -1;
//		if(dataType == DataTypes.) {
//			this.sArry = new String[capacity];
//		} else if(dataType == "int") {
//			this.iArray = new int[capacity];
//		} else if(dataType == "char") {
//			this.cArray = new char[capacity];
//		}
//	}
//	
//	public boolean isFull() {
//		return (this.top == this.capacity - 1);
//	}
//	
//	public boolean isEmpty() {
//		return (this.top < 0);
//	}
//	
//	public void push(Type item) {
//		if(isFull()) {
//			System.out.println("Stack Overloaded");
//			return;
//		} else {
//			System.out.println(item + " is inserted in the stack");
//			if(dataType == "String") {
//				this.sArry[++this.top] = (String) item;
//			} else if(dataType == "int") {
//				this.iArray[++this.top] = (int) item;
//			} else if(dataType == "char") {
//				this.cArray[++this.top] = (char) item;
//			}
//		}
//	}
//	
//	
//	public Type pop() {
//		if(isEmpty()) {
//			System.out.println("Stack is Empty");
//			return (dataType);
//		} else {
//			System.out.println(this.sArry[this.top] + " Poped out");
//			if(dataType == "String") {
//				return this.sArry[top--];
//			} else if(dataType == "int") {
//				return this.sArry[top--];
//			} else if(dataType == "char") {
//				return this.sArry[top--];
//			}
//		}
//		return null;
//	}
	
//	public String peek() {
//		if(isEmpty()) {
//			System.out.println("Stack is Empty");
//			return "Empty Stack";
//		} else {
//			System.out.println(this.sArry[this.top]);
//			return this.sArry[top];
//		}
//	}
//}

public class Tower_Of_Hanoi {
	
	public static void main(String[] args) {
		
//		MyStack<String> stack = new MyStack<String>(5);
//		stack.push("arun");
//		stack.push("arup");
//		
		
		
//		IntStack stack = new IntStack(5);
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.isFull());
//		stack.push(5);
//		stack.push(6);
//		stack.push(8);
//		stack.push(2);
//		stack.push(11);
//		stack.push(53);
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.isFull());
//		stack.pop();
//		System.out.println(stack.isEmpty());
//		System.out.println(stack.isFull());
//		stack.pop();
//		stack.peek();
		
		
		StrStack s = new StrStack(3);
		s.push("Dog");
		s.push("Horse");
		s.push("Cat");
		
	}
}
