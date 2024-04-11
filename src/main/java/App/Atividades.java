package App;

import java.util.Stack;

public class Atividades {

    public static void AtividadeUm(){
        Stack<String> stack = new Stack<>();
        stack.push("ESTE EXERCÍCIO É MUITO FÁCIL.");

        while (!stack.empty()) {
            String[] palavras = stack.pop().split(" ");
            Stack<Character> stackChar = new Stack<>();
            StringBuilder fraseReversa = new StringBuilder();

            for(String palavra : palavras){
                char[] chars = palavra.toCharArray();

                for(char c: chars)
                    if(c != '.')
                        stackChar.push(c);

                while (!stackChar.empty())
                    fraseReversa.append(stackChar.pop());

                fraseReversa.append(" ");
            }

            System.out.println(fraseReversa);
        }

    }

}
