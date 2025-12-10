import java.awt.*;
import java.awt.event.*;

class AWTExample1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Simple AWT Example");

        Button button = new Button("Click Me!");
        button.setBounds(100, 100, 80, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.add(button);
        frame.add(new Label("Hello, AWT!"));
        frame.setSize(600, 200);
        frame.setLayout(null);
        frame.setVisible(true);

        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
