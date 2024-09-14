/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vowelcounter;
import java.util.Scanner;
/**
 *
 * @author Angel Vhugie
 */
public class VowelCounter {
    // Function to count vowels in the input string
    public static int countVowels(String sentence) {
        // Convert the sentence to lowercase to make it case insensitive
        sentence = sentence.toLowerCase();
        // Define a string that contains all vowels
        String vowels = "aeiou";
        int vowelCount = 0;

        // Iterate through each character of the sentence
        for (int i = 0; i < sentence.length(); i++) {
            // Get the character at the current index
            char currentChar = sentence.charAt(i);

            // Check if the current character is a vowel by checking its index in the vowels string
            if (vowels.indexOf(currentChar) != -1) {
                vowelCount++; // Increment the count if it's a vowel
            }
        }

        return vowelCount; // Return the total number of vowels
    }

    public static void main(String[] args) {
        // Create a scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Ask the user to input a sentence
        System.out.println("Enter a sentence: ");
        String inputSentence = sc.nextLine();

        // Call the countVowels function and display the result
        int numberOfVowels = countVowels(inputSentence);
        System.out.println("Number of vowels in the sentence: " + numberOfVowels);
    }
}
      

