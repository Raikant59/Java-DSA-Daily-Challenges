import java.util.ArrayList;

public class PriorityQueueUsingHeap {
    static class PriorityQueue{
        static ArrayList<Integer> arr = new ArrayList<>();
         void add(int val){
            arr.add(val);

            int x = arr.size()-1;
            int parent = (x-1)/2;
            while(arr.get(x) < arr.get(parent)){
                int temp = arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent,temp);
                x = parent;
                parent = (x-1)/2;
            }
        }

        int peek(){
            return arr.get(0);
        }

        int delete(){

            int root = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            arr.remove(arr.size()-1);

            heafify(0);
            return root;
        }

        static void heafify(int i){
            int left = 2*i+1;
            int right = 2*i+2;
            int minidx = i;

            if(left < arr.size() && arr.get(minidx) > arr.get(left)){
                minidx = left;
            }
            if(right < arr.size() && arr.get(minidx) > arr.get(right)){
                minidx = right;
            }
            if (minidx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minidx));
                arr.set(minidx,temp);

                heafify(minidx);
            }
        }

        boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        PriorityQueue heap = new PriorityQueue();
        heap.add(10);
        heap.add(5);
        heap.add(11);
        heap.add(1);
        while (!heap.isEmpty()) {
            System.out.print(heap.peek()+" ");
            heap.delete();
        }


    }
}
