package com.kinshukPaul.DataStructureTest.Heap;
import com.kinshukPaul.DataStructure.Heap.MinHeap;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class minHeapTest {

	@Test
	void insertTest() {
		fail("Not yet implemented");
	}
	@Test
	void getMinElementTest()
	{
		fail("Not yet implemented");
	}
	@Test
	void getMinElement()
	{
		MinHeap minHeap = new MinHeap(5);
		//fail("Not yet implemented");
		minHeap.insert(12);
		minHeap.insert(24);
		minHeap.insert(78);
		minHeap.insert(17);
		minHeap.insert(10);
		assertEquals( 10, minHeap.getMin(),"succesfull run");
	}
}
