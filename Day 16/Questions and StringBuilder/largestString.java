// Questions:- For a given set of strings print the largest string ?

public class largestString {
    public static void main(String[] args) {
        String Fruits[]={"apple","guava","banana","mango"};
        String largest=Fruits[0];
        for(int i=1;i<Fruits.length;i++){
            if(largest.compareTo(Fruits[i])<0){
                largest=Fruits[i];
            }
        }
        System.out.println("Largest String in the set is : "+largest);
    }
}
