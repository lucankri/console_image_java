package edu.school21.printer.logic;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

public class ConsoleImagePrinter {
    public static void printImage(int[][] pixelsImage, String white, String black ) {
        ColoredPrinter printer = new ColoredPrinter();

        for (int[] row : pixelsImage) {
            for (int pixel : row) {
                if (pixel == 1) {
                    printer.print(" ", Ansi.Attribute.NONE,
                            Ansi.FColor.NONE, Ansi.BColor.valueOf(white));
                } else {
                    printer.print(" ", Ansi.Attribute.NONE,
                            Ansi.FColor.NONE, Ansi.BColor.valueOf(black));
                }
            }
            System.out.println();
        }
    }
}
