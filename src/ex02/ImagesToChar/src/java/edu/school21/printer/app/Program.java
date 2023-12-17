package edu.school21.printer.app;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.Parameters;
import edu.school21.printer.logic.BMPImageReader;
import edu.school21.printer.logic.ConsoleImagePrinter;

import java.io.File;

@Parameters(separators = "=")
public class Program {
    @Parameter(names = "--white")
    private static String white;

    @Parameter(names = "--black")
    private static String black;

    public static void main(String[] args) {
        Program program = new Program();
        try {
            JCommander.newBuilder()
                    .addObject(program)
                    .build()
                    .parse(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        int[][] pixels = BMPImageReader.readImage("/resources/it.bmp");
        if (pixels != null) {
            ConsoleImagePrinter.printImage(pixels, white, black);
        }
    }
}
