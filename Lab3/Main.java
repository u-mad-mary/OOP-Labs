public class Main
{
    public static void main(String[] args)
    {
        String s = "There were once a man and a woman who had long in vain wished for a child. At length the woman hoped that God was about to grant her desire. These people had a little window at the back of their house from which a splendid garden could be seen, which was full of the most beautiful flowers and herbs. It was, however, surrounded by a high wall, and no one dared to go into it because it belonged to an enchantress, who had great power and was dreaded by all the world. One day the woman was standing by this window and looking down into the garden, when she saw a bed which was planted with the most beautiful rampion (rapunzel), and it looked so fresh and green that she longed for it, and had the greatest desire to eat some. ";

        TextManipulation x = new TextManipulation(s);
        System.out.println("The number of sentences: " + x.AmountOfSentences());
        System.out.println("Word Count: " + x.countWords());

        System.out.println();

        System.out.println("The number of letters: " + x.amountOfLetters());
        System.out.println("The number of vowels: " + x.amountOfVowels());
        System.out.println("The number of consonants: " + x.amountOfConsonants());

        System.out.println();

        System.out.println("The longest word in the text is: " + x.longestWord());
        System.out.println("Top 5 most popular words are: " + x.top5Words(s,5));

    }
}
