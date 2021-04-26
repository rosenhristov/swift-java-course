package taskthreewordsreaderandsorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.Collator;
import java.util.*;

/**
 * Created by Rossen on 3.4.2016 г..
 */
/*
  Задача 3: Напишете програма, която прочита списък от думи от файл, наречен words.txt, преброява колко пъти всяка от
  тези думи се среща в друг файл text.txt и записва резултата в трети файл – result.txt, като преди това ги сортира по
  брой на срещане в намаляващ ред.
*/
public class WordsReaderAndSorter {
    public static void main(String[] args) {
        File words = new File("E:\\codezone\\swiftjavacourse\\JavaCourseHomework\\Lecture12FileesAndStreamms\\src" +
                "\\taskthreewordsreaderandsorter\\words.txt");
        File text = new File ("E:\\codezone\\swiftjavacourse\\JavaCourseHomework\\Lecture12FileesAndStreamms\\src" +
                "\\taskthreewordsreaderandsorter\\text.txt");
        File results = new File("E:\\codezone\\swiftjavacourse\\JavaCourseHomework\\" +
                "Lecture12FileesAndStreamms\\src\\taskthreewordsreaderandsorter\\result.txt");
        Scanner wordsReader = null;//reader of words.txt
        Scanner textReader = null;//reader of text.txt
        PrintStream resultsWriter = null;//writes in another results
        int wordsLineNumber = 0;
        int textLineNumber = 0;
        String wordsLine;//saves the current line read from words.txt
        //saves the current line read from words.txt
        try{
            wordsReader = new Scanner(words, "UTF-8");
            TreeSet ts = new TreeSet();

            while (wordsReader.hasNextLine()) {// Reads and saves the words in words.txt
                wordsLine = wordsReader.nextLine();
                ts.add(wordsLine);
                wordsLineNumber++;
            }
            Object[] names = ts.toArray();
            sortArray(Collator.getInstance(), names);//sorting method using collator

            //read from text.txt
            String textLine = null;
            int[] wordsOccurence = new int[names.length]; //contains the number of times every word is met in text.txt
            for (int i = 0; i < names.length; i++) {
                String word = (String) names[i];
                textReader = new Scanner(text, "UTF-8");
                while (textReader.hasNextLine()) {
                    textLine = textReader.nextLine();
                    int index = textLine.indexOf(word);
                    while (index != -1) {
                        wordsOccurence[i]++;
                        index = textLine.indexOf(word, (index + 1));
                    }
                    textLineNumber++;
                }
            }
            //Sort arrays (bubble sort)
            for(int i=0; i<wordsOccurence.length; i++) {
                for(int j = i + 1; j < wordsOccurence.length; j++) {
                    if(wordsOccurence[i] > wordsOccurence[j]) {
                        //Sorting the wordsOccurrence's values
                        int intHolder = wordsOccurence[i];
                        wordsOccurence[i] = wordsOccurence[j];
                        wordsOccurence[j] = intHolder;
                        //Sorting the names values
                        Object wordHolder = names[i];
                        names[i] = names[j];
                        names[j] = wordHolder;
                    }
                }
            }
            //Write in results
            resultsWriter = new PrintStream(results);
            for(int i = wordsOccurence.length - 1; i >= 0; i--) {//iterates through the treeset and writes the names in the second file
                resultsWriter.println(names[i] + " " + wordsOccurence[i]);
            }
        } catch (FileNotFoundException fnf) {
            System.err.println("File not found.");
        } finally{
            if(wordsReader != null) {
                wordsReader.close();
            }
            if (textReader != null) {
                textReader.close();
            }
            if(resultsWriter != null) {
               resultsWriter.close();
            }

        }
    }
    //Implementation of the sorting method
    public static void sortArray(Collator collator, Object[] objArray) {
        Object tmp;
        if (objArray.length == 1)
            return;
        for (int i = 0; i < objArray.length; i++) {
            for (int j = i + 1; j < objArray.length; j++) {
                if (collator.compare(objArray[i], objArray[j]) > 0) {
                    tmp = objArray[i];
                    objArray[i] = objArray[j];
                    objArray[j] = tmp;
                }
            }
        }
    }
}
