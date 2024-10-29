// If any element in array repeat then the ouput is true else output is false;

public class printTrueonIterator {

    static boolean checktwice(int arr[]){
        boolean istwice = false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   istwice=true;
                }
            }
        }
        return istwice;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,5,7,8,1};
        boolean result = checktwice(arr);
        System.out.println("Output is : "+ result);

    }

}
