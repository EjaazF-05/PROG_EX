import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class ProductApp extends JFrame{
    private JTextField txtCustomerName;
    private JComboBox<String> cmbProduct;
    private JTextField txtPrice;
    private JButton btnProcess;

    public ProductApp(){
        setTitle("Product App");
        setSize(450, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu + new JMenu("File");
        exitItem.addActionListener(e -> System.exit((0)));
        fileMenu.add(exitItem);
        JMenu toolsMenu = new JMenu("Tools");
        JMenuItem processItem = new JMenuItem("Process");
        JMenuItem clearItem = new JMenuItem("Clear");

        processItem
    }
}
