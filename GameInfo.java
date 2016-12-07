/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cos;

/**
 *
 * @author Piotr
 */
public class GameInfo {
    // deklarujemy zmienne informujące o informacjach dotyczących gry
    static int difficulty;
    static int lives;
    static int gamelength;
    static int numberofdeaths;
    static int bonus;
    static int penaltyfordeath;
    static int points;
    static int levels;
    
    public static void setInit(int[] values){
        // metoda inicjalizująca zmienne tak jak pan config przykazał
        difficulty = values[0];
        lives = values[1];
        gamelength = values[2];
        numberofdeaths = values[3];
        bonus = values[4];
        penaltyfordeath = values[5];
        points = values[6];
        levels = values[7];
    }
}
