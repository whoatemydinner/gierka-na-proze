/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cos;

/**
 * Klasa zawierająca informacje o podstawowych parametrach gry.
 * 
 * @author Piotr Kierzek i Michał Janczyk
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
    
    /**
     * Metoda nadająca wartości zaimportowane przez metodę {@link cos.importConfig#importConfig() } podstawowym parametrom aplikacji.
     * @param values Wektor (w formie tablicy 1-wymiarowej int[]) zawierający podstawowe dane o grze, w kolejności: <br>
     * difficulty - poziom trudności gry (0 - łatwe, 1 - średnie, 2 - trudne); <br>
     * lives - startowa liczba żyć; <br>
     * gamelength - początkowa wartość czasu dla gry; <br>
     * numberofdeaths - początkowa liczba śmierci; <br>
     * bonus - wielkość bonusu czasowego, który może zostać uzyskany przez gracza; <br>
     * penaltyfordeath - czas doliczany za każdą śmierc; <br>
     * points - początkowa liczba punktów; punkty liczone są na zasadzie czas+(l.śmierci*kara)-(l.bonusów*bonus); <br>
     * levels - liczba poziomów w grze, po których następuje wymuszony koniec gry.
     */
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
