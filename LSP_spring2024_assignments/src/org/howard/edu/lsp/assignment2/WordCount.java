package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
    	// current directory
    	String currentDirectory = System.getProperty("user.dir");
        
    	// get the package name
        String packageName = WordCount.class.getPackageName().replace('.', '/');    	
        
        // words.txt file
        String fileName = "words.txt";
        
        // final path to the word.txt file
        String filePath = currentDirectory + "/src/" + packageName + "/" + fileName;
        System.out.println("The path which it expects the file to be: " + filePath);
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word = word.toLowerCase();
                    if (!word.matches("\\d+") && word.length() > 3) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
