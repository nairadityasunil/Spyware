
// import javax.swing.JOptionPane;
import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
public class TakeScreenShot {
	public static void main(String[] args) {
		int i=1;
		while (i>0)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Robot obj ;
			try {
				obj = new Robot();
				Dimension dim= Toolkit.getDefaultToolkit().getScreenSize();
				Rectangle rect = new Rectangle(dim);
				BufferedImage buff = obj.createScreenCapture(rect);
				try {
					ImageIO.write(buff, "PNG", new File("C:/Users/sa.dhyani swamiji/Pictures/Screenshots/" + i + ".PNG"));
				} catch (IOException e) {
					e.printStackTrace();
				}
				// System.out.println("Screen Shot Taken");
			} catch (AWTException e) {
				e.printStackTrace();
			}
			i++;
			// JOptionPane.showMessageDialog(null, "Your PC Has Been Hacked!!!!!!!!!", "Devil Says", JOptionPane.WARNING_MESSAGE);
		}
	}

}
