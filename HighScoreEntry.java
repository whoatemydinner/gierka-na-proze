package cos;

/**
 * Klasa zawierająca pojedynczy wpis na liście najlepszych wyników. 
 * 
 * @author Piotr Kierzek i Michał Janczyk
 *
 *  
 */
public class HighScoreEntry {
    String name;
    int lastLevel;
    int highScore;
    
    /**
     * Podstawowy konstruktor klasy.
     * Wypełnia pola wartościami domyślnymi jako "placeholder" dla faktycznych wyników.
     */
    public HighScoreEntry(){
        name = "aaaaaaaaaa";
        lastLevel = 0;
        highScore = 0;
    }
    
    /**
     * Konstruktor klasy z trzema parametrami.
     * @param n Pseudonim gracza, wybierany przez samego zainteresowanego.
     * @param ll Plansza, na której skończona została gra (do sortowania wyników).
     * @param hs Ilość zdobytych punktów, korelująca z czasem.
     */
    public HighScoreEntry(String n, int ll, int hs){
        name = n;
        lastLevel = ll;
        highScore = hs;
    }
}
