import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

class DivisionCalculator extends JFrame implements ActionListener{

    private Container container;
    private JLabel message;
    private JLabel dividend;
    private JLabel divisor;
    private JLabel result;
    private JLabel error;
    private JTextField textField1;
    private JTextField textField2;
    private JButton button;

    public DivisionCalculator(){
        setTitle("Division Calculator");
        setSize(390,250);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        container = getContentPane();
        container.setLayout(null);

        message = new JLabel ("Please, enter 2 numbers in the following fields. ");
        message.setBounds(35,20,300,20);
        container.add(message);

        dividend = new JLabel ("Dividend: ");
        dividend.setBounds(90,60,100,20);
        container.add(dividend);

        textField1 = new JTextField();
        textField1.setBounds(155,60,90,20);
        container.add(textField1);

        divisor = new JLabel ("Divisor: ");
        divisor.setBounds(90,90,90,20);
        container.add(divisor);

        textField2 = new JTextField();
        textField2.setBounds(155,90,90,20);
        container.add(textField2);

        button = new JButton("Divide");
        button.setBounds(125,125,100,25);
        container.add( button);

        result = new JLabel("Result:  ");
        result.setBounds(35,160,150,20);
        container.add(result);

        error = new JLabel();
        error.setBounds(35,180,400,20);
        container.add(error);
        button.addActionListener(this);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ev) {

        try {
            if (ev.getSource() == button){
                double n1 = Double.parseDouble(this.textField1.getText());
                double n2 = Double.parseDouble(this.textField2.getText());
                double n = n1 / n2;
                if(n2 == 13.0){ result.setText(""); throw new UnluckyException(); }
                else if(n2 == 0){ throw new ArithmeticException(); }
                this.result.setText("Result:  " + n);
                error.setText("");

            }

        }
        catch(NumberFormatException ev1) { result.setText(""); error.setText("Please, enter numbers only. ^^"); }
        catch(ArithmeticException ev2){ result.setText(""); error.setText("Please, do not divide by 0. ^^"); }
        catch(UnluckyException ev3){ result.setText(""); error.setText("Did you know that 13 is considered an unlucky number?"); }
    }
}