package Module15.Assignments.Picture.classes;
/*
 * Purpose:
 * 
 * < your name >
 * < today's date >
*/

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 * 
 * @author Barbara Ericson
 */
public class PictureTester {
  /** Method to test zeroBlue - Activity 5 */
  public static void testZeroBlue() {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }

  /** Method to test mirrorVertical */
  public static void testMirrorVertical() {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }

  /** Method to test mirrorTemple */
  public static void testMirrorTemple() {
    Picture temple = new Picture("Module15/Assignments/Picture/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }

  /** Method to test the collage method */
  public static void testCollage() {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }

  /** Method to test edgeDetection */
  public static void testEdgeDetection() {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }

  public static void testKeepOnlyRed() {
    Picture image = new Picture("Module15/Assignments/Picture/images/blueMotorcycle.jpg");
    image.explore();

    Pixel[][] pixels = image.getPixels2D();
    for (Pixel[] row : pixels) {
      for (Pixel pixel : row) {
        pixel.setBlue(0);
        pixel.setGreen(0);
      }
    }

    image.explore();
  }

  public static void testNegate() {
    Picture image = new Picture("Module15/Assignments/Picture/images/blueMotorcycle.jpg");
    image.explore();

    Pixel[][] pixels = image.getPixels2D();
    for (Pixel[] row : pixels) {
      for (Pixel pixel : row) {
        pixel.setBlue(pixel.getBlue() - 255);
        pixel.setGreen(pixel.getGreen() - 255);
        pixel.setRed(pixel.getRed() - 255);
      }
    }

    image.explore();
  }

  public static void testGrayscale() {
    Picture image = new Picture("Module15/Assignments/Picture/images/blueMotorcycle.jpg");
    image.explore();

    Pixel[][] pixels = image.getPixels2D();
    for (Pixel[] row : pixels) {
      for (Pixel pixel : row) {
        int average = (pixel.getBlue() + pixel.getGreen() + pixel.getRed()) / 3;
        pixel.setBlue(average);
        pixel.setGreen(average);
        pixel.setRed(average);
      }
    }

    image.explore();
  }

  public static void testFixUnderwater() {
    Picture image = new Picture("Module15/Assignments/Picture/images/water.jpg");
    image.explore();

    Pixel[][] pixels = image.getPixels2D();
    for (Pixel[] row : pixels) {
      for (Pixel pixel : row) {
        pixel.setRed(pixel.getRed() * 5);
      }
    }

    image.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture image = new Picture("Module15/Assignments/Picture/images/blueMotorcycle.jpg");
    image.explore();

    Pixel[][] pixels = image.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < width / 2; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    }

    image.explore();
  }

  public static void testMirrorHorizontal() {
    Picture image = new Picture("Module15/Assignments/Picture/images/blueMotorcycle.jpg");
    image.explore();

    Pixel[][] pixels = image.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int height = pixels.length;

    for (int row = height - 1; row > 0; row--) {
      for (int col = 0; col < pixels[0].length; col++) {
        botPixel = pixels[row][col];
        topPixel = pixels[height - row][col];
        botPixel.setColor(topPixel.getColor());
      }
    }

    image.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
    Picture image = new Picture("Module15/Assignments/Picture/images/blueMotorcycle.jpg");
    image.explore();

    Pixel[][] pixels = image.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int height = pixels.length;

    for (int row = height - 1; row > 0; row--) {
      for (int col = 0; col < pixels[0].length; col++) {
        botPixel = pixels[row][col];
        topPixel = pixels[height - row][col];
        topPixel.setColor(botPixel.getColor());
      }
    }

    image.explore();
  }

  public static void testMirrorArms() {
    Picture image = new Picture("Module15/Assignments/Picture/images/snowman.jpg");
    image.explore();

    Pixel[][] pixels = image.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int mirrorPoint = 190;

    for (int row = 155; row < mirrorPoint; row++) {
      for (int col = 102; col < 170; col++) {
        topPixel = pixels[row][col];
        botPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        botPixel.setColor(topPixel.getColor());
      }
    }

    mirrorPoint = 192;
    for (int row = 160; row < mirrorPoint; row++) {
      for (int col = 236; col < 293; col++) {
        topPixel = pixels[row][col];
        botPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        botPixel.setColor(topPixel.getColor());
      }
    }

    image.explore();
  }

  public static void testMirrorGull() {
    Picture image = new Picture("Module15/Assignments/Picture/images/seagull.jpg");
    image.explore();

    Pixel[][] pixels = image.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int mirrorPoint = 475;

    for (int row = 235; row < 316; row++) {
      for (int col = 238; col < 344; col++) {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint / 2];
        rightPixel.setColor(leftPixel.getColor());
      }
    }

    image.explore();
  }

  /**
   * Main method for testing. Every class can have a main method in Java
   */
  public static void main(String[] args) {
    // uncomment a call here to run a test and
    // comment out the ones you don't want to run

    // Activity 5
    // testZeroBlue();
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();

    // Activity 5 Challenge - optional
    // testFixUnderwater();

    // Activity 6
    // testMirrorVertical();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontal();
    // testMirrorHorizontalBotToTop();

    // Activity 6 Challenge - optional
    // testMirrorDiagonal();

    // Activity 7
    // testMirrorTemple();
    // testMirrorArms();
    testMirrorGull();

    // Activity 8
    // testCollage();
    // testCopy();
    // testMyCollage();

    // Activity 9
    // testEdgeDetection();
    // testEdgeDetection2();

    // Extra methods
    // testChromakey();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);
  }
}
