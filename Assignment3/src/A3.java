
//implement a program that can input an expression in postfix notation ( see Exer-cise C-6.19 ) and output its value


public class A3 {


    static int Prec(char ch)
    {
        if(ch=='+'||ch=='-')
                return 1;
        if(ch=='*'||ch=='/')
                return 2;
        if(ch=='^')
                return 3;

        return -1;
    }


    static String Expression (String exp)
    {
        String result = new String("");

       StackA3<Character> stack = new StackA3<Character>();

        for (int i = 0; i<exp.length(); ++i)
        {
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c))
                result += c;

               else if (c == '(')
                stack.push(c);

                else if (c == ')')
                 {
                       while (!stack.isEmpty() && stack.top() != '(')
                       result += stack.pop();
                        stack.pop();
                 }
            else
            {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.top())){

                    result += stack.pop();
                }
                stack.push(c);
            }

        }

        while (!stack.isEmpty()){
            if(stack.top() == '(')
                return "";
            result += stack.pop();
        }
        return result;
    }


    public static void main(String[] args)
    {
        String exp = "((5+2)*(8-3))/4";
        System.out.println(Expression(exp));
    }
}
