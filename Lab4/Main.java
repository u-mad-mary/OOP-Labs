import java.io.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        ParenthesesCheck parenthesesCheck = new ParenthesesCheck();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(
                "C:\\Users\\Madalina\\IdeaProjects\\Lab4\\src\\one_expression.txt"));
        String expression1 = bufferedReader.readLine();

        FileReader fr = new FileReader(
                "C:\\Users\\Madalina\\IdeaProjects\\Lab4\\src\\three_expressions.txt");

        BufferedReader br = new BufferedReader(fr);
        String str = "", l = "";
        while ((l = br.readLine()) != null)
        {
            str += " " + l;
        }
        br.close();
        String[] array = str.split("\\.");

        ArrayList<String> arrayOfExpressions = new ArrayList<>();

        for (int k = 0; k < array.length; k++)
        {

            String pol = array[k];
            if (pol != null && pol.length() > 1 && pol.charAt(pol.length()-1)!= ')' && pol.charAt(pol.length()-1)!= '(' )
            {
                pol = pol.substring(0, pol.length() - 1);
            }
            arrayOfExpressions.add(pol);

        }

        for(int m=0;m<arrayOfExpressions.size();m++){
            if(arrayOfExpressions.get(m).length() <2){
                arrayOfExpressions.remove(m);
            }
        }


        String currentExpresionInText = "";

        for (int j = 0; j < arrayOfExpressions.size(); j++)
        {

            currentExpresionInText = arrayOfExpressions.get(j);
            System.out.println(parenthesesCheck.isBalanced(currentExpresionInText));
            System.out.println(currentExpresionInText);

        }
        System.out.println(parenthesesCheck.isBalanced(expression1));
        System.out.println(expression1);



    }
}
