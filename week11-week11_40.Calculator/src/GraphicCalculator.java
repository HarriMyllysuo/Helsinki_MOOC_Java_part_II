
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private CalculatorListener listener;
    private JButton ZButton = new JButton("Z");

    @Override
    public void run() {
         frame = new JFrame("Calculator");
         frame.setPreferredSize(new Dimension(250, 150));
         
         frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
         createComponents(frame.getContentPane());
         
         frame.pack();
         frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField outputTextField = new JTextField("0");
        outputTextField.setEnabled(false);
        JTextField inputTextField = new JTextField("0");
        
        this.listener = new CalculatorListener(inputTextField, outputTextField, ZButton);
        
        container.add(outputTextField);
        container.add(inputTextField);
        container.add(createPanel(), BorderLayout.SOUTH);
        
        
    }
    
    private JPanel createPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 3));
        
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        
        plusButton.addActionListener(listener);
        minusButton.addActionListener(listener);
        ZButton.addActionListener(listener);
        
        ZButton.setEnabled(false);
        
        panel.add(plusButton);
        panel.add(minusButton);
        panel.add(ZButton);
        
        return panel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
