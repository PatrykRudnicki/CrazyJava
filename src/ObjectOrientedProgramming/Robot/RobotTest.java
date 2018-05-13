package ObjectOrientedProgramming.Robot;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RobotTest {
    Robot robot;

    public RobotTest() {
        try {
            robot = new Robot();
        } catch (AWTException e) {
            System.err.println("What the hell?!");
            e.printStackTrace();
        }
    }

    /**
     * Hello World!
     */
    public void printText() {
        int[] text = {KeyEvent.VK_H, KeyEvent.VK_E, KeyEvent.VK_L, KeyEvent.VK_L, KeyEvent.VK_O, KeyEvent.VK_SPACE,
                KeyEvent.VK_W, KeyEvent.VK_O, KeyEvent.VK_R, KeyEvent.VK_L, KeyEvent.VK_D};

        for(int i=0; i<text.length; i++) {
            robot.keyPress(text[i]);
            robot.delay(500);
            robot.keyRelease(text[i]);
        }
    }

    /**
     * Screenshot and save on disk
     */
    public void screenCapture() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(dimension);

        BufferedImage screen = robot.createScreenCapture(rectangle);
        try {
            ImageIO.write(screen, "jpg", new File("screenshot.jpg"));
        } catch (IOException e) {
            System.err.println("Error during saving screenshot");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RobotTest test = new RobotTest();
        test.robot.delay(3000);
        test.printText();
        test.screenCapture();
    }
}
