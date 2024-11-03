// StringbUilder is similar to string but they are mutable
// To add element in stringbuilder we use @ .append().
// To convert StringBUilder to string we use :- .toString().

public class StringBuilderSB {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("");// Initialization

        for(char ch = 'a';ch<='z';ch++){
            sb.append(ch);
        }

        System.out.println(sb);

    }
}