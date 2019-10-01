package com.kinshukPaul.DataStructure.Heap;
import java.util.*;
public class MinHeap {
	private int size,maxSize ; 
	private int [] minHeapArray ;
	private static final int FRONT = 1;
	public MinHeap(int size)
	{	
		this.maxSize = size;
		size = 0 ;
		minHeapArray = new int[maxSize+1];
	}
	public int getMin() {
		return minHeapArray[FRONT];
	}
	
	private int parent(int pos) {
		return (pos)/2;
	}
	private void swap(int pos1 , int pos2) {
		int temp = minHeapArray[pos1];
		minHeapArray[pos1] = minHeapArray[pos2];
		minHeapArray[pos2]=temp;
	}
	public void insert(int ele)
	{
		int current;
		if(size >= maxSize)
			return ;
		
		minHeapArray[++size] = ele;
		current = size ;
		
		while(minHeapArray[current] < minHeapArray[parent(current)]) {
			swap(current , parent(current));
			current = parent(current);
		}
	}
	private void print() 
    { 
        for (int i = 1; i <= size / 2; i++) { 
            System.out.print(" Parent:" + minHeapArray[i] 
                             + " LEft Child: " + minHeapArray[2 * i] 
                             + " Right Child:" + minHeapArray[2 * i + 1]); 
            System.out.println(); 
        } 
    } 
	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		int sz =s.nextInt();
		MinHeap minHeap = new MinHeap(sz);
		for (int i = 0 ; i < sz ; i ++)
			minHeap.insert(s.nextInt());
		minHeap.print();
		s.close();
	}

}
