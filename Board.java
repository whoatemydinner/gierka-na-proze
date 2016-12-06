/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cos;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;



public class Board extends JPanel {
    private Image[][] images = new Image[20][15]; // tworzę 2D tablicę pełną obiektów typu obraz, 20 rzędów x 15 kolumn
    
    public Board() {initBoard();}
    
    private static int[][] loadLevel() {
        int[][] tempMatrix = new int[20][15];
        try {
            
            File inFile = new File("resources\\level1.txt");
            Scanner in = new Scanner(inFile);
            
            int lineCount = 0;
            while (in.hasNextLine()) {
                String[] currentLine = in.nextLine().trim().split("\\s+"); 
                for (int i = 0; i < currentLine.length; i++) {
                    tempMatrix[lineCount][i] = Integer.parseInt(currentLine[i]);    
                }
                lineCount++;
            }      
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Cos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tempMatrix;
    }
    
    private void initBoard() {
        int[][] map = new int[20][15];
        
        map = loadLevel();

        for(int i = 0; i < 20; i++){
            for(int j = 0; j < 15; j++){
                loadImage(map[i][j], i, j); // zamieniam tablicę intów na tablicę obrazków (obie tablice są już wcześniej zdefiniowane, więc teraz to tylko przepisanie cośków), patrz jeszcze funkcja LoadMap
            }
        }
        
        setPreferredSize(new Dimension(images[0][0].getWidth(this)*15, images[0][0].getHeight(this)*20)); // a tu to po prostu wymuszam wielkość rysowanego jFrame'a
    }
    
    private void loadImage(int number, int arr1, int arr2) {
        ImageIcon ii; // na stronie jakiejś wyczytałem sposób z wykorzystaniem tej klasy jako pośredniej między plikiem a obrazkiem w programie, więc wykorzystuję :x
        switch (number){
            default: ii = new ImageIcon("resources\\graphics\\0.png");
                    images[arr1][arr2] = ii.getImage(); 
                    break; // wszędzie to samo, ładuję plik w zależności od tego, co znajduje się w danej komórce tablicy intów i kopiuję ten obrazek do pamięci do komórki w tablicy obrazków
            case 1: ii = new ImageIcon("resources\\graphics\\1.png");
                    images[arr1][arr2] = ii.getImage();
                    break;
            case 2: ii = new ImageIcon("resources\\graphics\\2.png");
                    images[arr1][arr2] = ii.getImage(); 
                    break;
            case 3: ii = new ImageIcon("resources\\graphics\\3.png");
                    images[arr1][arr2] = ii.getImage(); 
                    break;
            case 4: ii = new ImageIcon("resources\\graphics\\4.png");
                    images[arr1][arr2] = ii.getImage();  
                    break;
            case 5: ii = new ImageIcon("resources\\graphics\\5.png");
                    images[arr1][arr2] = ii.getImage();  
                    break;
            case 252: ii = new ImageIcon("resources\\graphics\\252.png");
                    images[arr1][arr2] = ii.getImage();   
                    break;
            case 253: ii = new ImageIcon("resources\\graphics\\253.png");
                    images[arr1][arr2] = ii.getImage();  
                    break;
            case 254: ii = new ImageIcon("resources\\graphics\\254.png");
                    images[arr1][arr2] = ii.getImage();   
                    break;
            case 255: ii = new ImageIcon("resources\\graphics\\255.png");
                    images[arr1][arr2] = ii.getImage();     
                    break;
        } 
    }
    
  @Override
    public void paintComponent(Graphics g) {
      for(int i = 0; i < 20; i++){
            for(int j = 0; j < 15; j++){
                g.drawImage(images[i][j], j*images[i][j].getWidth(this), i*images[i][j].getHeight(this), null);
            } // rysowanie kafelków
      }
    }
}
