package com.tehtävä11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("Player1");
        fileWriter.join();
        caretaker.save(fileWriter);

        System.out.println(fileWriter + "\n\n");
        Scanner scanner = new Scanner(System.in);

        boolean runLoop = true;
        while(runLoop){

            System.out.println("Your guess: ");

            int ans = scanner.nextInt();

            if (fileWriter.guess(ans)) {
                System.out.println("Try Again\n");
            } else {
                System.out.println("you won the game: " + fileWriter);
                runLoop = false;
            }

        }


    }
}

