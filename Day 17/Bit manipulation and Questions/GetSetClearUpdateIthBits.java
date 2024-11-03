public class GetSetClearUpdateIthBits {
    public static void main(String[] args) {
        System.out.println(getibit(10,2));
        System.out.println(setibit(10,2));
        System.out.println(clearibit(10,2));
        System.out.println(updateibit(10, 2, 1));
    }

    // Function for get ith Bit operation
    static int getibit(int n,int i){
        int bitmask=1<<i;
        return n&bitmask;
    }

    // Function for set ith Bit operation
    static int setibit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }

    // Function for clear ith Bit operation
    static int clearibit(int n,int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    // Function for update ith Bit operation
    static int updateibit(int n , int i , int newbit){
        if(newbit==0){
            return clearibit(n, i);
        }else{
            return setibit(n, i);
        }

        // Another method to do this.
        
        // n=clearibit(n, i);
        // int bitmask=newbit<<i;
        // return n|bitmask;
    }
}
