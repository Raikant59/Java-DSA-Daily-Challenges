public class Checkifstringisapalindrome {
    public static void main(String[] args) {
        String name ="madam";
        boolean result =checkpalindrome(name);
        if(result==true){
            System.out.println("Yes, It is a Palindrome");
        }else{
            System.out.println("No, It is not a Palindrome");
        }
    }

    static boolean checkpalindrome(String name){
        boolean istrue=false;
        int s=0;
        int e=name.length()-1;
        while(s<e){
            if(name.charAt(s)==name.charAt(e)){
                istrue=true;
            }else{
                istrue=false;
                break;
            }
            s++;
            e--;
        }
        return istrue;
    }
}
