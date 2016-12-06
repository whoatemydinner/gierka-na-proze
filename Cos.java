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
public class Cos {
    public static void main(String[] args){ 
        int[] config = new int[8];
        // wczytywanie z pliku musi być tutaj wywołane
        config = importConfig.importConfig();
        
        
        
        window w = new window(); // tworzę nowe okno, jak Pan Bóg przykazał, tu się inicjuje to wszystko
        w.setVisible(true); // ustawiam, żeby to okno było widoczne     
    }
}
