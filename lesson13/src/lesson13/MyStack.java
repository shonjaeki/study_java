package lesson13;

import java.util.EmptyStackException;

public class MyStack {
	private int[] arr = new int[10];
	private int size;
	
	void push(int  i) {
		arr[size++] = i;
	}
	int pop() {
		if(size ==0) throw new EmptyStackException();
		return arr[--size];
	}
	int size() {
		return size;
	}

}
