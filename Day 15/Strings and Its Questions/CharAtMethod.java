// Same as arrays we can also find or take output of every single charracter of String using charAt() Method
// we can find length of string using .length();
// Indexing is same as array starts from 0 but it also count space.

public class CharAtMethod {
    public static void main(String[] args) {
        String name = "Raikant Chaudhary";
        printchars(name);
    }
    
    static void printchars(String name){
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
}
