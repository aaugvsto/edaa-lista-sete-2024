package App;

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

public class Atividades {

    public static void AtividadeUmLetraA(){
        Stack<String> stack = new Stack<>();
        stack.push("ESTE EXERCÍCIO É MUITO FÁCIL.");

        while (!stack.empty()) {
            String[] palavras = stack.pop().replace(".", "").split(" ");
            Stack<Character> stackChar = new Stack<>();
            StringBuilder fraseReversa = new StringBuilder();

            for(String palavra : palavras){
                char[] chars = palavra.toCharArray();

                for(char c: chars)
                    stackChar.push(c);

                while (!stackChar.empty())
                    fraseReversa.append(stackChar.pop());

                fraseReversa.append(" ");
            }

            System.out.println(fraseReversa);
        }
    }

    public static void AtividadeUmLetraB(){
        Stack<Character> stack = new Stack<>();
        String palavra = "TENET";
        char[] charArray = palavra.toCharArray();

        for(char c : charArray)
            stack.push(c);

        for (char c : charArray){
            if(c != stack.pop()){
                System.out.println("A palavra '" + palavra + "' não é um políndromo");
                return;
            }
        }

        System.out.println("A palavra '" + palavra + "' é um políndromo");
    }

    public static void AtividadeUmLetraC(){

        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        stack.push(80);
        stack.push(50);

        Stack<Integer> stackTemp = new Stack<>();
        while (!stack.empty()){
            int temp = stack.pop();

            while (!stackTemp.empty() && stackTemp.peek() > temp)
                stack.push(stackTemp.pop());


            stackTemp.push(temp);
        }

        while (!stackTemp.isEmpty())
            stack.push(stackTemp.pop());

        while (!stack.empty())
            System.out.println(stack.pop());
    }
}
