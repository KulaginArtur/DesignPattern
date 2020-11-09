package com.tehtävä8;

class Chess extends Game {

    /* Implementation of necessary concrete methods */

    void initializeGame() {
        System.out.println("Players chose their color of figures");
    }

    void makePlay(int player) {
        System.out.println("Player: " + player + " thinks about his next move");
        moveOnBoard(player);
    }

    boolean endOfGame() {
        if (moveCount == 4) {
            printWinner();
            return true;
        } else {
            return false;
        }

    }

    void printWinner() {
        System.out.println("Winner is player: 1");
    }

    /* Specific declarations for the chess game. */

    int moveCount = 0;
    void moveOnBoard(int player) {
        endOfGame();
        System.out.println("Player: " + player + " moves on board");
        moveCount++;
    }

}
