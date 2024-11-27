// Using Recursion

public class duplicateString {

    public static void main(String[] args) {
        String str="aaabbbddccca";
        StringBuilder newstr=new StringBuilder();
        boolean map[]=new boolean[26];
        remove(str,0, newstr, map);
    }

    static void remove(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }

        char chur=str.charAt(idx);
        if(map[chur-'a']==true){
            remove(str, idx+1, newstr, map);
        }else{
            map[chur-'a']=true;
            remove(str, idx+1, newstr.append(chur), map);
        }
    }


}