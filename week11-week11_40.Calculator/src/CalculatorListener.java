
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class CalculatorListener implements ActionListener {

    private CalculatorLogic calc;
    private JTextField inputValue;
    private JTextField outputValue;
    private int value;
    private JButton ZButton;
    //private String[] NUMBERS = new String[] {
    //    "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public CalculatorListener(JTextField input, JTextField output, JButton ZButton) {
        this.calc = new CalculatorLogic();
        this.inputValue = input;
        this.outputValue = output;
        this.ZButton = ZButton;
        this.value = 0;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        value = Integer.parseInt(inputValue.getText());
        //int num2 = value;
        //int num = Integer.parseInt(outputValue.getText());

        if (ae.getActionCommand().equals("+")) {
            calc.increase(value);
            outputValue.setText("" + calc.getValue());
            //inputValue.setText("");
        } else if (ae.getActionCommand().equals("-")) {
            calc.decrease(value);
            outputValue.setText("" + calc.getValue());

        } else if (ae.getActionCommand().equals("Z")) {
            calc.reset();
            outputValue.setText("" + calc.getValue());
            inputValue.setText("" + calc.getValue());
        }
        if (outputValue.getText().equals("0")) {
            ZButton.setEnabled(false);
        } else {
            ZButton.setEnabled(true);

        }
    }
}
