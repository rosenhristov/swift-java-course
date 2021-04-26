package taskonefileswithnames;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;

/**
 * Created by Rossen on 3.4.2016 г..
 */
/*
*   Задача 1
    Напишете програма, която чете списък от имена от един текстов файл, сортира ги по азбучен ред и ги запазва в друг
    файл. Имената да са с латински букви. На всеки ред от файла, където са записани имената, има точно по едно име.
    На всеки ред от файла с резултата също трябва да има само по едно име. За сортиране използвайте подходяща структура
    от данни (например TreeSet – прочетете как се сортират данните в нея) или използвайте Collections.sort()
*/
public class Task1FilesWithNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        File fileToRead = new File("E:\\codezone\\swiftjavacourse\\JavaCourseHomework\\Lecture12FileesAndStreamms\\src\\" +
                "taskonefileswithnames\\NamesToRead.txt");
        File fileToWrite = new File("E:\\codezone\\swiftjavacourse\\JavaCourseHomework\\Lecture12FileesAndStreamms\\src\\" +
                "taskonefileswithnames\\NamesToWrite.txt");
        Scanner fileReader = null;
        PrintStream fileWriter = null;//write in another file
        try{
            fileReader = new Scanner(fileToRead);
            fileWriter = new PrintStream(fileToWrite);
            int lineNumber = 0;
            String line;
            TreeSet ts = new TreeSet();
            while (fileReader.hasNextLine()) {// Reads and saves in a treeset
                line = fileReader.nextLine();
                ts.add(line);
                lineNumber++;
            }
            Iterator itr = ts.iterator();
            while (itr.hasNext()) {//iterates through the treeset and writes the names in the second file
                fileWriter.println(itr.next());
            }
        } catch (FileNotFoundException fnf) {
            System.err.println("File not found.");
        } finally{
            fileReader.close();
            fileWriter.close();
        }
    }
}
