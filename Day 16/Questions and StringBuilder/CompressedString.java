// Question :- Compressed a String? Eg:- If Input = aaabbccccdd then Output will be = a3b2c4d2

public class CompressedString {
    public static void main(String[] args) {
        String str="aaabbcccdd";
        System.out.println(compress(str));
    }

    static String compress(String str){
        String fstr="";
        for(int i=0;i<str.length();i++){
              Integer count=1;
              while (i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                count++;
                i++;
              }
              fstr=fstr+str.charAt(i);
              if(count>1){
                fstr=fstr+count.toString();
              }
        }
        return fstr;
    }
}