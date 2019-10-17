package edu.cgcc.cs260;

public class MusicQueue {
	//members
	public int maxSize;
	private int front;
	private int back;
	private int  itemCount;
	public Song[] qArray;
	
	//member functions
	public MusicQueue(int s) {
		maxSize = s;
		qArray = new Song[maxSize];
		front = 0;
		back = -1;
		itemCount = 0;
	}
	
	public void enQueue(Song s) {
		//maxSize = 4
		//	if back == 4 - 1
		//		back = -1
		
		if(back == maxSize - 1) 
			back = -1;
		qArray[++back] = s; //back = 0
		itemCount++;
	}
	
	public Song deQueue() {
		Song temp = qArray[front++];
		
		if(front == maxSize)
			front = 0;
		
		itemCount--;
		return temp;
	}
	
	public Song peek() {
		return qArray[front];
	}
	
	public boolean isEmpty() {
		return (itemCount == 0);
	}
	
	public boolean isFull() {
		return (itemCount == maxSize);
	}
	
	public int size() {
		return itemCount;
	}
}
