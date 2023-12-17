package edu.school21.printer.app;

import edu.school21.printer.logic.BMPImageReader;
import edu.school21.printer.logic.ConsoleImagePrinter;

public class Program {
    public static void main(String[] args) {
        if (checkArgs(args)) {
            int[][] pixels = BMPImageReader.readImage("/resources/it.bmp");
            if (pixels != null) {
                ConsoleImagePrinter.printImage(pixels, args[0].charAt(0), args[1].charAt(0));
            }
        }
    }

    public static boolean checkArgs(String[] args) {
        boolean result = false;
        if (args.length == 2) {
            if (args[0].length() == 1 && args[1].length() == 1) {
                result = true;
            } else {
                System.out.println("The first and second parameters must be one character each!");
            }
        } else {
            System.out.println("The program should be started with three arguments:\n" +
                    "\"whit symbol\" \"black symbol\"!");
        }
        return result;
    }
}
