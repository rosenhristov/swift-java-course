package lecturefourarrays;

import java.util.Scanner;

/**
 * Created by Rossen on 13.2.2016 г..
 * The programme accepts a word entered by the user, checks every letter in the word one by one and prints the index
 * of eack letter in the alphabet. To do this it finds the place of the letter in an array of type 'char' and adds 1 to
 * its index in the array in order to calculate the index in the alphabet. to be sure the programme will
 * output the result correctly (if the user uses uppercase letters in the words for example), the programme uses two
 * strings: the first stores the word as it is entered by the user. The second stores the same word lowercased
 * in any case.
 */
/*
 7. Да се напише програма, която създава масив с всички букви от латинската азбука. Да се даде възможност на потребител
 да въвежда дума от конзолата и в резултат да се извеждат индексите на буквите от думата.
*/
public class TaskSevenLetterIndexes {
    public static void main(String[] args) {
       char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
               't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter a word: ");
        String word = input.nextLine();
        System.out.printf("Your word is: %s\n", word);

        String str = word.toLowerCase();//to be sure all the leters are small and will match the array

        char letter;//keeps the current processed letter
        System.out.println("The index of each letter in this word in the alphabet is as follows:");
        for (int i = 0; i < str.length(); i++) {//passes through the word entered by the user
           letter = str.charAt(i);//lette in the current loop
            for (int j = 0; j < alphabet.length; j++) {//finds the place of the lleter in the alphabet
                if (letter == alphabet[j]) {
                    System.out.printf("| %d ",j+1);

                }
            }
        }
        System.out.print('|');




    }
}
