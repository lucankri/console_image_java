package edu.school21.printer.logic;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class BMPImageReader {
    public static int[][] readImage(String imagePath) {
        int[][] pixels;
        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            int width = image.getWidth();
            int height = image.getHeight();
            pixels = new int[height][width];

            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int rgb = image.getRGB(x, y);
                    int red = (rgb >> 16) & 0xFF;
                    int green = (rgb >> 8) & 0xFF;
                    int blue = rgb & 0xFF;

                    int grey = (red + green + blue) / 3;
                    pixels[y][x] = grey > 128 ? 1 : 0;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
            pixels = null;
        }


        return pixels;
    }
}
