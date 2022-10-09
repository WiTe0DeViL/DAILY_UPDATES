import java.util.*;

public class Fourte {
    public static void fourte(ArrayList operators, int startIndex, int endIndex) {
        int count = 0;
        String str = new String();
        for (int i = startIndex; i < endIndex; i++) {
            ArrayList operatorsAfterSwapping = toSwap(operators, 0, operators.size() - 1);
            fourte(operators, startIndex + 1, endIndex - 1);
            operators = toSwap(operatorsAfterSwapping, startIndex, endIndex);
            System.out.println(operators);
            str = operators.toString();
        }
    }

    public static ArrayList toSwap(ArrayList operators, int startIndex, int endIndex) {
        Object temp = 0;
        temp = operators.get(startIndex);
        operators.set(startIndex, operators.get(endIndex));
        operators.set(endIndex, temp);
        return operators;

    }

    public static void main(String[] args) {
        ArrayList<Object> equation = new ArrayList<>();
        equation.add('(');
        equation.add('+');
        equation.add('-');
        equation.add('*');
        equation.add('/');
        equation.add(')');
        int len = equation.size();
        Scanner sc = new Scanner(System.in);
        for (int i = equation.size(); i < len + 4; i++) {
            equation.add(sc.nextInt());

        }
        fourte(equation, 0, equation.size() - 1);

    }
}