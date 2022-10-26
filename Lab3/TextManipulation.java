import java.util.*;

public class TextManipulation
{
    private String textInAVar;
    public TextManipulation(String textInAVar)
    {
        this.textInAVar = textInAVar;
    }
    public String getTextFromVar()
    {
        return textInAVar;
    }
    private String[] gettingRidOfPunctuations()
    {
        String[] punctuationOff = textInAVar.split("\\s+");
        for (int i = 0; i < punctuationOff.length; i++)
        {
            punctuationOff[i] = punctuationOff[i].toLowerCase();
            punctuationOff[i] = punctuationOff[i].replace(")", "");
            punctuationOff[i] = punctuationOff[i].replace("(", "");
            punctuationOff[i] = punctuationOff[i].replace(",", "");
            punctuationOff[i] = punctuationOff[i].replace(".", "");
            punctuationOff[i] = punctuationOff[i].replace("!", "");
            punctuationOff[i] = punctuationOff[i].replace("?", "");
            punctuationOff[i] = punctuationOff[i].replace(")", "");
            punctuationOff[i] = punctuationOff[i].replace("(", "");
            punctuationOff[i] = punctuationOff[i].replace("'", "");

        }
        return punctuationOff;
    }

    public String longestWord()
    {
        String[] punctuationsOff = gettingRidOfPunctuations();
        String currentWord = "";

        for (int i = 0; i < punctuationsOff.length; i++)
            if (punctuationsOff[i].length() > currentWord.length())
                currentWord = punctuationsOff[i];

        return currentWord;
    }

    public int amountOfLetters()
    {
        String[] noPunctuation = gettingRidOfPunctuations();
        int nr = 0;
        for (int i = 0; i < noPunctuation.length; i++)
            nr += noPunctuation[i].length();

        return nr;
    }

    private boolean isVowel(char vowel)
    {
        return vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o'|| vowel == 'u';
    }

    public int amountOfVowels()
    {
        String[] noPunctuation = gettingRidOfPunctuations();
        int count = 0;
        for (int i = 0; i < noPunctuation.length; i++)
        {
            for (int j = 0; j < noPunctuation[i].length(); j++)
            {
                if (isVowel(noPunctuation[i].charAt(j)))
                {
                    count++;
                }
            }
        }
        return count;

    }

    private boolean isConsonant(char consonant)
    {
        return consonant == 'b' || consonant == 'c' || consonant == 'd'
                || consonant == 'f' || consonant == 'g' || consonant == 'j'
                || consonant == 'k' || consonant == 'l' || consonant == 'm'
                || consonant == 'n' || consonant == 'p' || consonant == 'q'
                || consonant == 's' || consonant == 't' || consonant == 'v'
                || consonant == 'x' || consonant == 'z' || consonant == 'h'
                || consonant == 'r' || consonant == 'w' || consonant == 'y';
    }

    public int amountOfConsonants()
    {
        String[] noPunctuation = gettingRidOfPunctuations();
        int count = 0;
        for (int i = 0; i < noPunctuation.length; i++)
        {
            for (int j = 0; j < noPunctuation[i].length(); j++)
            {
                if (isConsonant(noPunctuation[i].charAt(j)))
                {
                    count++;
                }
            }
        }
        return count;
    }

    public int countWords()
    {
        return gettingRidOfPunctuations().length;
    }
    public int AmountOfSentences()
    {
        int nr = 0;
        for (int i = 0; i < textInAVar.length(); i++)
        {
            if (textInAVar.charAt(i) == '.' || textInAVar.charAt(i) == '!'
                    || textInAVar.charAt(i) == '?')
            {
                nr++;
            }
        }

        return nr;
    }

    public List<String> top5Words(String words, int k)
    {
        String[] words2x;

        words2x = gettingRidOfPunctuations();
        if (words == null || words2x.length == 0) {
            return new ArrayList<String>();
        }

        Map<String, Integer> map = new HashMap();
        for (String s: words2x) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> candidates = new ArrayList(map.keySet());
        Collections.sort(candidates, (w1, w2) -> map.get(w1) != map.get(w2) ?
                map.get(w2) - map.get(w1) : w1.compareTo(w2));

        return  candidates.subList(0, k);
    }

}