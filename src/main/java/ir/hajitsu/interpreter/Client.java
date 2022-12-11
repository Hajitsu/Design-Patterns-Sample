package ir.hajitsu.interpreter;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        final String expression = "w x z - +";
        final Evaluator sentence = new Evaluator(expression);
        final Map<String, Expression> variables = new HashMap<>();
        variables.put("w", new Num(5));
        variables.put("x", new Num(10));
        variables.put("z", new Num(42));
        final int result = sentence.interpret(variables);
        System.out.println(result);
    }
}
