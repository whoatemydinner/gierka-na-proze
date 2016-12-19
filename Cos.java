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
* <h1>GRA KULKA</h1>
* Ta aplikacja to implementacja gry "Kulka" w języku Java. Ta klasa to
* główna logika działania aplikacji.
*
* @author Piotr Kierzek i Michał Janczyk
*/
public class Cos {
    /**
    * Główna metoda aplikacji, obsługująca logikę programu.
    * @param args Typowo dla main().
    */
    public static void main(String[] args){ 
        GameInfo.setInit(importConfig.importConfig());
        
        try {
            HighScores.importHighScores();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        window w = new window(); // tworzę nowe okno, jak Pan Bóg przykazał, tu się inicjuje to wszystko
        w.setVisible(true); // ustawiam, żeby to okno było widoczne     
    }
}
