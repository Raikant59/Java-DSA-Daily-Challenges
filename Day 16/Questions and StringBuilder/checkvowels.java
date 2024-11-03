public class checkvowels {
    public static void main(String[] args) {
        String str="Raikant";
        System.out.println("No of vowels : "+countvowels(str));
    }

    public static int countvowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
}
