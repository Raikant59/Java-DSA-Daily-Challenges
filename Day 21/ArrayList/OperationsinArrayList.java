import java.util.ArrayList;

public class OperationsinArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add operations
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // get operation
        System.out.println(list.get(0));

        // remove Operation
        list.remove(1);

        // set operation
        list.set(1,80);

        // contains operation
        System.out.println(list.contains(20));

        // size operation
        System.out.println(list.size());
    }
}
