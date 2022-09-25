package leetcode;

import java.util.*;
class summa{

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            System.out.println(CheckBrackets(input));
        }

    }
    public static boolean CheckBrackets(String brackets){
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map =new HashMap<>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        for(Character i : brackets.toCharArray()){
            if(map.containsKey(i)){
                stack.push(i);
            }else{
                if(stack.size() > 0){
                    char temp = stack.pop();
                    if(map.get(temp) != i) return false;
                }else{
                    return false;
                }
            }

        }
        return stack.size() == 0;
    }
}