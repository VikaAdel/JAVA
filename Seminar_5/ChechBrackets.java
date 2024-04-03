// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

package Seminar_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ChechBrackets {
    public static void main(String[] args) {
        String[] expressions = { "a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", "<{a}+{(d*3)}>", "{a+]}{(d*3)}" };

        for (String expression : expressions) {
            System.out.println(expression + " - " + (checkBrackets(expression) ? "истина" : "ложь"));

        }
    }

    public static Map<Character, Character> getBracketsMap() {
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put(']', '[');
        brackets.put('}', '{');
        brackets.put('>', '<');
        return brackets;

    }

    public static boolean checkBrackets(String str) {
        Map<Character, Character> brackets = getBracketsMap();
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (brackets.containsValue(c)) {
                stack.push(c);
            } else if (brackets.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() != brackets.get(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }
}
