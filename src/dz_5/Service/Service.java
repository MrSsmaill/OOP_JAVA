package dz_5.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Service {
    public static List<String> parsOperatrs(String expression) {
        List<String> operators = new ArrayList<>();
        char[] expres = expression.toCharArray();
        int temp = 0;
        for (int i = 0; i < expression.length() - 1; i++) {
            String elem = String.valueOf(expres[i]);
            if ("+-/*".contains(elem)) {
                operators.add(String.valueOf(Arrays.copyOfRange(expres, temp, i)));
                operators.add(elem);
                temp = i + 1;
            }
        }
        operators.add(String.valueOf(Arrays.copyOfRange(expres, temp, expres.length)));
        return operators;
    }

    public static Float calculation(float num1, float num2, String operator) {
        Float result = switch (operator) {
            case ("+") -> num1 + num2;
            case ("-") -> num1 - num2;
            case ("*") -> num1 * num2;
            case ("/") -> num1 / num2;
            default -> null;
        };
        return result;
    }

    public static Float result(List<String> expression) {
        Float result = null;
        String el;
        int idx = 0;
        while (idx < expression.size()) {
            el = expression.get(idx);
            if ("*".contains(el)) {
                expression.add(idx - 1, String.valueOf(Float.parseFloat(expression.get(idx - 1)) *
                        Float.parseFloat(expression.get(idx + 1))));
                expression.remove(idx);
                expression.remove(idx);
                expression.remove(idx);
                idx -= 1;
            } else if ("/".contains(el)) {
                expression.add(idx - 1, String.valueOf(Float.parseFloat(expression.get(idx - 1)) /
                        Float.parseFloat(expression.get(idx + 1))));
                expression.remove(idx);
                expression.remove(idx);
                expression.remove(idx);
                idx -= 1;
            }
            idx +=1;
        }
        idx = 0;
        while (idx < expression.size()) {

            el = expression.get(idx);
            if ("+".contains(el)) {
                expression.add(idx - 1, String.valueOf(Float.parseFloat(expression.get(idx - 1)) +
                        Float.parseFloat(expression.get(idx + 1))));
                expression.remove(idx);
                expression.remove(idx);
                expression.remove(idx);
                idx -= 1;
            } else if ("-".contains(el)) {
                expression.add(idx - 1, String.valueOf(Float.parseFloat(expression.get(idx - 1)) -
                        Float.parseFloat(expression.get(idx + 1))));
                expression.remove(idx);
                expression.remove(idx);
                expression.remove(idx);
                idx -= 1;
            }
            idx += 1;
        }
        result = Float.parseFloat(expression.get(0));
        return result;
    }
}
