package deprecated.pixlab;

/**
 * This class contains class (static) methods
 * that will help you test the Picture class
 * methods.  Uncomment the methods and the code
 * in the main to test.
 *
 * @author Barbara Ericson
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /** Method to test zeroBlue */
    public static void testKeepOnlyBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.keepOnlyBlue();
        beach.explore();
    }

    /** Method to test negate */
    public static void testNegate()
    {
        Picture beach = new Picture("beach.jpg");
        beach.negate();
        beach.explore();
    }

    /** Method to test grayscale */
    public static void testGrayscale()
    {
        Picture picture = new Picture("beach.jpg");
        picture.grayscale();
        picture.explore();
    }

    /** Method to test grayscale */
    public static void testFixUnderwater()
    {
        Picture picture = new Picture("water2.jpg");
        picture.fixUnderWater();
        picture.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture picture = new Picture("caterpillar.jpg");
        picture.mirrorVertical();
        picture.setTitle("Vertical");
        picture.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVerticalRightToLeft()
    {
        Picture picture = new Picture("caterpillar.jpg");
        picture.mirrorVerticalRightToLeft();
        picture.setTitle("Vertical Right To Left");
        picture.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorHorizontal()
    {
        Picture picture = new Picture("redMotorcycle.jpg");
        picture.mirrorHorizontal();
        picture.setTitle("Horizontal");
        picture.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorHorizontalBotToTop()
    {
        Picture caterpillar = new Picture("redMotorcycle.jpg");
        caterpillar.mirrorHorizontalBotToTop();
        caterpillar.setTitle("Horizontal Bot To Top");
        caterpillar.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture picture = new Picture("temple.jpg");
        picture.mirrorTemple();
        picture.setTitle("Mirror Temple");
        picture.explore();
    }

    public static void testMirrorArms()
    {
        Picture picture = new Picture("snowman.jpg");
        picture.mirrorSnowman();
        picture.setTitle("Mirror Snowman");
        picture.explore();
    }

    public static void testMirrorGull()
    {
        Picture picture = new Picture("seagull.jpg");
        picture.mirrorGull();
        picture.setTitle("Mirror Seagull");
        picture.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    /**
     * Main method for testing.  Every class can have a main
     * method in Java
     */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        //testZeroBlue();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        testMirrorVertical();
        testMirrorVerticalRightToLeft();
        testMirrorHorizontal();
        testMirrorHorizontalBotToTop();
        testMirrorTemple();
        testMirrorArms();
        testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);

    }
}