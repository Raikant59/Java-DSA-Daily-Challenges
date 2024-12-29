import java.util.*;
public class TwoDArrayList {
    public static void main(String[] args) {
        // Syntax of 2D ArrayList: 
        ArrayList<ArrayList<Integer>> Mainlist = new ArrayList<>();

        // Define 1D Lists: 
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // Add elements in One dimensional list LIst1 ,List2, List3
        // Elements are respectively as list1 =  1 2 3 4 5, list2 = 2 4 6 8 10, List3= 3 6 9 12 15
        for(int i=1;i<=5;i++){
            list1.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

        // Add the 1D list in 2D list
        Mainlist.add(list1);
        Mainlist.add(list2);
        Mainlist.add(list3);

        // Print 2D list :
        System.out.println(Mainlist);
    }
}
