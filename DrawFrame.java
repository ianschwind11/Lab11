
import java.awt.Color;
import java.awt.Point;

import javax.swing.JFrame;

/**
 * This class extends JFrame and contains the main entry point for the program.
 * 
 * @author CS2334. Modified by: Stephen
 * @version 2018-04-02
 * Lab 11
 */
public class DrawFrame extends JFrame
{
    /**
     * Serial ID
     */
    private static final long serialVersionUID = 1L;
    
    /** Contains and draws all the shapes */
    private static DrawPanel drawPanel;

    /**
     * Creates an invisible window, the objects to be drawn and adds them to the panel.
     * 
     * @param title String title of the drawing window
     */
    public DrawFrame(String title)
    {
        super(title);
        
        int width = 800;
        int height = 600;
        
        // draw a dog:
        
        // Base head:
        Circle base = new Circle(new Point(400, 300), 400, Color.ORANGE, true);
        
        // Ears:
        RightTriangle leftOutEar = new RightTriangle(new Point(180, 430), 30, 100, Color.GRAY, true);
        RightTriangle leftInEar = new RightTriangle(new Point(170, 430), 20, 80, Color.PINK, true);
        RightTriangle rightOutEar = new RightTriangle(new Point(520, 430), 30, 100, Color.GRAY, true);
        RightTriangle rightInEar = new RightTriangle(new Point(510, 430), 20, 80, Color.PINK, true);
        
        // Eyes:
        Oval leftEye = new Oval(new Point(240, 380), 80, 160, Color.BLACK, true);
        Oval leftPupil = new Oval(new Point(240, 380), 50, 120, Color.WHITE, true);
        Oval rightEye = new Oval(new Point(560, 380), 80, 160, Color.BLACK, true);
        Oval rightPupil = new Oval(new Point(560, 380), 50, 120, Color.WHITE, true);
        
        // Nose and mouth and tounge:
        Circle nose = new Circle(new Point(400, 300), 50, Color.BLACK, true);
        PolyLine leftMouth = new PolyLine(new Point(240, 250), new Point(400, 200), 75, Color.BLACK, true);
        PolyLine rightMouth = new PolyLine(new Point(400, 200), new Point(560, 250), 75, Color.BLACK, true);
        Oval tounge = new Oval(new Point(425, 200), 80, 120, Color.RED, true);
        
        // Collar:
        Oval collar = new Oval(new Point(400, 100), 400, 50, Color.BLUE, true);
        Circle collarButton = new Circle(new Point(400, 100), 60, Color.RED, true);
        Circle  collarHighlight = new Circle(new Point(400, 100), 50, Color.GREEN, false);
        
        // Square and circle around the dog:
        Square outsideSquare = new Square(new Point(400, 300), 450, Color.MAGENTA, false);
        Circle outsideCircle = new Circle(new Point(400, 300), 500, Color.BLACK, false);

        // initialize the panel and add the shapes to it
        drawPanel = new DrawPanel();
        
        // TODO: add shapes to the panel:
        drawPanel.addShape(base);
        drawPanel.addShape(outsideCircle);
        drawPanel.addShape(outsideSquare);
        drawPanel.addShape(leftOutEar);
        drawPanel.addShape(leftInEar);
        drawPanel.addShape(rightOutEar);
        drawPanel.addShape(rightInEar);
        drawPanel.addShape(leftEye);
        drawPanel.addShape(rightEye);
        drawPanel.addShape(leftPupil);
        drawPanel.addShape(rightPupil);
        drawPanel.addShape(nose);
        drawPanel.addShape(leftMouth);
        drawPanel.addShape(rightMouth);
        drawPanel.addShape(tounge);
        drawPanel.addShape(collar);
        drawPanel.addShape(collarButton);
        drawPanel.addShape(collarHighlight);
        
        // set background color
        drawPanel.setBackground(Color.YELLOW);
        
        // add panel to frame
        this.add(drawPanel);
        
        // finish setting up the frame
        setSize(width, height);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * The main method, initializes the frame to draw the images.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args)
    {
        DrawFrame frame = new DrawFrame("Woof :3");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
