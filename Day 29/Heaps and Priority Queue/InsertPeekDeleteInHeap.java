import java.util.ArrayList;

public class InsertPeekDeleteInHeap {
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);

            int x = arr.size()-1;
            int parent = (x-1)/2;

            while(arr.get(x) < arr.get(parent)){
                int temp = arr.get(x);
                arr.set(x,arr.get(parent));
                arr.set(parent,temp);

                x=parent;
                parent = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        public int delete(){
            int data = arr.get(0);

            // swap - 1st and last index
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // remove last element
            arr.remove(arr.size()-1);

            // Fix heap
            heafify(0);

            return data;

        }

        private void heafify(int i){
            int left = 2*i+1;
            int right = 2*i + 2;
            int minidx = i;

            if(left < arr.size() && arr.get(minidx) > arr.get(left)){
                minidx = left;
            }
            if(right < arr.size() && arr.get(minidx) > arr.get(right)){
                minidx = right;
            }

            if(minidx != i){
                int temp = arr.get(i);
                arr.set(i,arr.get(minidx));
                arr.set(minidx,temp);

                heafify(minidx);
            }
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }
    }

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(11);
        pq.add(15);
        pq.add(1);
        pq.add(18);
        pq.add(23);
        pq.add(40);
        pq.add(4);
        pq.add(7);
        pq.add(2);
        pq.add(21);
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+" ");
            pq.delete();
        }
    }
}
