import java.util.HashMap;
import java.util.*;

class ValidParenRepeat{

    public static boolean checkParen(String s) {
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');

        Stack<Character> st = new Stack<Character>();

        for(int i=0; i<s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                st.push(s.charAt(i));
            }
            else if(map.values().contains(s.charAt(i))) {
                if(!st.isEmpty() && map.get(st.peek()) == s.charAt(i)) {
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {
        boolean b = checkParen("({}{()})");
        System.out.println(b);
    }
}