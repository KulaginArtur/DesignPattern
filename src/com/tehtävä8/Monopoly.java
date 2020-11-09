package com.tehtävä8;

class Monopoly extends Game{
    void initializeGame() {
        System.out.println("Players chose their game figure");
    }

    void makePlay(int player) {
        System.out.println("Player: " + player + " throws a cube");
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

    /* Specific declarations for the Monopoly game. */
    int moveCount = 0;
    void moveOnBoard(int player) {
        endOfGame();
        System.out.println("Player: " + player + " moves on board");
        moveCount++;
    }
}
