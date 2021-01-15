/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ericjiang
 */
public class SaveableDictionary {

    private HashMap<String, String> hello;
    private File text;

    public SaveableDictionary() {
        hello = new HashMap<>();
    }

    public SaveableDictionary(String file) throws Exception {
        text = new File(file);
        hello = new HashMap<>();

    }

    public boolean load() {

        try {
            Scanner scnr = new Scanner(text);
            while (scnr.hasNextLine()) {
                String line = scnr.nextLine();
                String[] parts = line.split(":");   // split the line based on the ':' character
                if (!hello.containsKey(parts[0])) {
                    hello.put(parts[0], parts[1]);
                    hello.put(parts[1], parts[0]);

                }

            }
            return true;

        } catch (Exception e) {
            return false;

        }

    }

    public boolean save() {
        ArrayList<String> usedWords = new ArrayList<>();
        try {
            FileWriter dictionary = new FileWriter(text);
            for (String key : this.hello.keySet()) {
                String translatedWord = this.hello.get(key);
                usedWords.add(translatedWord);
                if (!(usedWords.contains(key))) {
                    dictionary.write(key + ":" + this.hello.get(key) + "\n");
                }
            }
            dictionary.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String words, String translation) {
        if (!hello.containsKey(words)) {
            hello.put(words, translation);
            hello.put(translation, words);
        }
    }

    public String translate(String word) {
        return hello.get(word);
    }

    public void delete(String word) {
        hello.remove(hello.get(word));
        hello.remove(word);
    }
}
