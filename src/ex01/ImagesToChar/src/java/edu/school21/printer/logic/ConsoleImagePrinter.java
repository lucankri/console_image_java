package edu.school21.printer.logic;

public class ConsoleImagePrinter {
    public static void printImage(int[][] pixelsImage, char white, char black ) {
        for (int[] row : pixelsImage) {
            for (int pixel : row) {
                if (pixel == 1) {
                    System.out.print(white);
                } else {
                    System.out.print(black);
                }
            }
            System.out.println();
        }
    }
}
