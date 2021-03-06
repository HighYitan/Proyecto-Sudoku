package sudoku;

import java.util.ArrayList;
import java.util.Arrays;

public class Sudoku {
    
    private static int sudokuInicial;
    private ArrayList<String[][]> sudokus;
    
    public Sudoku(){
        this.sudokus = new ArrayList();
        String[][] sudoku1 = {
            {"0", "0", "6", "0", "0", "2", "3", "0", "4"},
            {"9", "0", "4", "7", "5", "0", "0", "8", "2"},
            {"0", "0", "8", "0", "0", "6", "0", "0", "5"},
            {"0", "0", "3", "0", "0", "0", "0", "4", "0"},
            {"2", "0", "0", "4", "0", "0", "8", "3", "0"},
            {"4", "0", "7", "5", "0", "0", "0", "0", "0"},
            {"0", "0", "0", "6", "0", "0", "0", "0", "8"},
            {"7", "0", "0", "0", "2", "0", "4", "5", "3"},
            {"0", "0", "0", "3", "7", "0", "0", "6", "9"}
        };
        this.sudokus.add(sudoku1);
        
        String[][] sudoku2 = {
            {"5", "0", "0", "4", "0", "1", "9", "6", "3"},
            {"4", "0", "0", "0", "0", "7", "0", "0", "0"},
            {"9", "0", "3", "8", "0", "0", "1", "0", "0"},
            {"8", "7", "0", "3", "0", "9", "6", "0", "1"},
            {"0", "0", "0", "0", "0", "0", "0", "0", "0"},
            {"6", "0", "1", "2", "0", "4", "0", "3", "9"},
            {"0", "0", "9", "0", "0", "6", "7", "0", "4"},
            {"0", "0", "0", "7", "0", "0", "0", "0", "6"},
            {"7", "6", "5", "1", "0", "2", "3", "0", "8"}
        };
        this.sudokus.add(sudoku2);
        
        String[][] sudoku3 = {
            {"0", "0", "2", "8", "0", "0", "0", "7", "0"},
            {"6", "0", "9", "0", "7", "4", "0", "2", "3"},
            {"4", "0", "8", "0", "0", "3", "0", "5", "0"},
            {"0", "0", "5", "0", "8", "0", "0", "3", "0"},
            {"0", "0", "0", "0", "0", "0", "7", "4", "0"},
            {"0", "2", "7", "0", "3", "0", "0", "8", "5"},
            {"0", "0", "0", "3", "6", "0", "0", "0", "0"},
            {"0", "0", "0", "5", "1", "7", "4", "0", "8"},
            {"0", "0", "0", "2", "0", "8", "0", "9", "0"}
        };
        this.sudokus.add(sudoku3);
    }
    
    public String[][] getRandomSudoku() {
        double random = Math.random() * this.sudokus.size();
        while ((int)random == Sudoku.sudokuInicial) {
            random = Math.random() * this.sudokus.size();
        }
        
        Sudoku.setSudokuInicial((int)random);

        return this.sudokus.get((int) random);
    }
    
    private static void setSudokuInicial(int random) {
        Sudoku.sudokuInicial = random;
    }
}