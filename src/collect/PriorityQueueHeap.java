package collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Random;

class PriorityQueueHeap {
    private final static int MIN_HEAP_SIZE = 3; //size of heap
    private final static int MAX_HEAP_SIZE = 10; //size of heap

    //INNER CLASS
    static class maxHeapComparator implements Comparator<Integer> {
        @Override
        public int compare (Integer x, Integer y) {
            return y-x; //reverse order
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(PriorityQueueHeap.MIN_HEAP_SIZE); 
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(PriorityQueueHeap.MAX_HEAP_SIZE, new maxHeapComparator());  

        System.out.println("MinHeap size is: " + minHeap.size() + " ");
        for(int i=1; i<=8; ++i){
           minHeap.offer(i);
        }
        System.out.println("MinHeap size is: " + minHeap.size() + " ");
        for(int i=1; i<=PriorityQueueHeap.MAX_HEAP_SIZE; ++i){
            int data = new Random().nextInt(100) +1; //number between 0 to 100
            maxHeap.add(data);
        }
        
        System.out.print("\nMIN Heap : ");
        Iterator<Integer> iter = minHeap.iterator();
        while(iter.hasNext()){
            System.out.print(iter.next() + " ");
        }

        System.out.print("\nMAX Heap : ");
        iter = maxHeap.iterator();
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
    }
}
