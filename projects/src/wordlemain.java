import java. io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.*;

public class wordlemain {
    public static void main(String[] args)
    {
        //this part of code will take all the words from the list and store it all in allWords
        ArrayList<String> allWords = new ArrayList<String>();
        try {
            File myObj = new File("/Users/aditi/Desktop/AP CompSci/Projects/projects/src/wordle.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine())
            {
                String data = myReader.nextLine();
                allWords.add(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String[] word = new String[5];
        int wordIndex = (int) (allWords.size() * Math.random());
        for (int i = 0; i < 5; i++) {
            word[i] = allWords.get(wordIndex).substring(i, i+1);
        }
        wordleobject wordle = new wordleobject(word);

        System.out.println("key:");
        System.out.println("c = letter in the right place");
        System.out.println("l = letter is somewhere else in the word");
        System.out.println(":( = letter is not in the word");

        Scanner scan = new Scanner(System.in);
        boolean right = false;
        while (!right) {
            System.out.println("Remaining letters:");
            for (int i = 0; i < wordle.getAlpha().size(); i++) {
                System.out.print(wordle.getAlpha().get(i) + " ");
            }
            System.out.println();
            System.out.println("Enter guess");
            String guess = scan.nextLine();
            String[] input = new String[5];
            for (int i = 0; i < 5; i++) {
                input[i] = guess.substring(i, i+1);
            }
            String[] output = wordle.procinp(input);
            for (int i = 0; i < 5; i++) {
                System.out.print(output[i]);
            }
            System.out.println();

            if (output[0].equals("c") && output[1].equals("c") && output[2].equals("c") && output[3].equals("c") && output[4].equals("c"))
                right = true;
        }
        System.out.println("Congratulations, you won!");
    }
}