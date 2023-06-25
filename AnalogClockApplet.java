import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AnalogClockApplet extends JPanel implements Runnable {
    private Thread thread;
    private boolean running;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Analog Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        AnalogClockApplet applet = new AnalogClockApplet();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        applet.start();
    }

    public AnalogClockApplet() {
        setPreferredSize(new Dimension(400, 400));
        setBackground(Color.white);
    }

    public void start() {
        if (thread == null) {
            thread = new Thread(this);
            running = true;
            thread.start();
        }
    }

    public void stop() {
        if (thread != null) {
            running = false;
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            thread = null;
        }
    }

    public void run() {
        while (running) {
            try {
                Thread.sleep(1000);
                repaint();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int radius = Math.min(width, height) / 2 - 20;

        // Draw clock face
        g.setColor(Color.black);
        g.drawOval(width / 2 - radius, height / 2 - radius, radius * 2, radius * 2);

        // Draw hour markers
        for (int i = 0; i < 12; i++) {
            double angle = Math.PI / 6 * i;
            int x = (int) (width / 2 + Math.cos(angle) * (radius - 10));
            int y = (int) (height / 2 + Math.sin(angle) * (radius - 10));
            g.fillOval(x - 2, y - 2, 4, 4);
        }

        // Get current time
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        String time = sdf.format(new Date());

        // Draw hour hand
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3, 5));
        int second = Integer.parseInt(time.substring(6, 8));
        int hourAngle = (int) (Math.PI / 6 * (hour % 12) + Math.PI / 360 * minute + Math.PI / 21600 * second);
        int hourHandLength = radius / 2;
        int hourHandX = (int) (width / 2 + Math.cos(hourAngle) * hourHandLength);
        int hourHandY = (int) (height / 2 + Math.sin(hourAngle) * hourHandLength);
        g.setColor(Color.blue);
        g.drawLine(width / 2, height / 2, hourHandX, hourHandY);


        // Draw minute hand
        int minuteAngle = (int) (Math.PI / 30 * minute + Math.PI / 1800 * second);
        int minuteHandLength = (int) (radius * 0.8);
        int minuteHandX = (int) (width / 2 + Math.cos(minuteAngle) * minuteHandLength);
        int minuteHandY = (int) (height / 2 + Math.sin(minuteAngle) * minuteHandLength);
        g.setColor(Color.green);
        g.drawLine(width / 2, height / 2, minuteHandX, minuteHandY);
        // Draw second hand
        int secondAngle = (int) (Math.PI / 30 * second);
        int secondHandLength = (int) (radius * 0.9);
        int secondHandX = (int) (width / 2 + Math.cos(secondAngle) * secondHandLength);
        int secondHandY = (int) (height / 2 + Math.sin(secondAngle) * secondHandLength);
        g.setColor(Color.red);
        g.drawLine(width / 2, height / 2, secondHandX, secondHandY);
    }
}

