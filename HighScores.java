/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cos;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Piotr
 */
public class HighScores {
    // ArrayList to rzecz, za którą chyba pokocham Javę.
    // Robimy listę wpisów do listy najlepszych wyników. Potem można je modyfikować i accessować jak zwyczajny array.
    static ArrayList<HighScoreEntry> entries = new ArrayList<HighScoreEntry>();   
    
    public static void importHighScores() throws FileNotFoundException{
        File file = new File("resources\\highscores.txt");
        try (Scanner input = new Scanner(file)) {
            for (int i = 0; i < 10; i++){
                entries.add(new HighScoreEntry(input.next(),input.nextInt(),input.nextInt()));
            }
            input.close();
        }
    }
    
}
