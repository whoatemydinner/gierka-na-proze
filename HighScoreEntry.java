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
public class HighScoreEntry {
    // w tej klasie mamy, jak nazwa wskazuje, jeden wpis z najlepszym wynikiem
    String name;
    int lastLevel;
    int highScore;
    
    public HighScoreEntry(){
        name = "aaaaaaaaaa";
        lastLevel = 0;
        highScore = 0;
    }
    
    public HighScoreEntry(String n, int ll, int hs){
        name = n;
        lastLevel = ll;
        highScore = hs;
    }
}
