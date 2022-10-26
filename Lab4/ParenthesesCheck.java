import java.util.ArrayList;

public class ParenthesesCheck{

    public String isBalanced(String s)
    {
        {
            String result = "The following mathematical expression is not correct:";
            ArrayList<String> al = new ArrayList<String>();

            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                {
                    al.add(Character.toString(s.charAt(i)));
                }

                else if (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')
                {
                    if (al.size() != 0 && al.get(al.size() - 1).equals("(")
                            && s.charAt(i) == ')')
                    {
                        al.remove(al.size() - 1);
                    }
                    else if (al.size() != 0 && al.get(al.size() - 1).equals("{")
                            && s.charAt(i) == '}')
                    {
                        al.remove(al.size() - 1);
                    }
                    else if (al.size() != 0 && al.get(al.size() - 1).equals("[")
                            && s.charAt(i) == ']')
                    {
                        al.remove(al.size() - 1);
                    }
                    else
                    {
                        return result = "The following mathematical expression is not correct:";
                    }
                }

            }
            if (al.isEmpty() == true)
            {
                return result = "The following mathematical expression is correct:";
            }
            return result;
        }
    }
}
