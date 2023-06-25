import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends Frame implements MouseListener, MouseMotionListener {

    public MouseEventExample() {
        super("Mouse Event Example");
        setSize(300, 200);
        setVisible(true);
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("Mouse Dragged");
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("Mouse Moved");
    }

    public static void main(String[] args) {
        new MouseEventExample();
    }
}

