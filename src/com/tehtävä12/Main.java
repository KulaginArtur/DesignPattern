package com.tehtävä12;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(final String[] arguments) {

        ArrayList<Image> photoAlbum = new ArrayList<>();

        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");
        Image image3 = new ProxyImage("HiRes_10MB_Photo3");
        Image image4 = new ProxyImage("HiRes_10MB_Photo4");
        Image image5 = new ProxyImage("HiRes_10MB_Photo5");
        Image image6 = new ProxyImage("HiRes_10MB_Photo6");

        photoAlbum.add(image1);
        photoAlbum.add(image2);
        photoAlbum.add(image3);
        photoAlbum.add(image4);
        photoAlbum.add(image5);
        photoAlbum.add(image6);

        Scanner scanner = new Scanner(System.in);

        boolean runLoop = true;
        int selectedImg = 0;
        while(runLoop) {

            System.out.println("\nSelect");
            System.out.println("1. Display first photo in album");
            System.out.println("2. Display next photo in album");
            System.out.println("3. Display previous photo in album");
            System.out.println("4. Display last photo in album");
            System.out.println("5. Close the album");

            String ans = scanner.nextLine();

            switch (ans) {
                case "1" -> photoAlbum.get(selectedImg).showData();
                case "2" -> {
                    if (selectedImg == (photoAlbum.size() - 1)) {
                        System.out.println("There is no more photos");
                    } else {
                        photoAlbum.get(selectedImg + 1).showData();
                        selectedImg += 1;
                    }
                }
                case "3" -> {
                    if (selectedImg == 0){
                        System.out.println("This is the first photo");
                    } else {
                        photoAlbum.get(selectedImg - 1).showData();
                        selectedImg -= 1;
                    }
                }
                case "4" -> photoAlbum.get(photoAlbum.size() - 1).showData();
                case "5" -> runLoop = false;
            }
        }
    }
}
