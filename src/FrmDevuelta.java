import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FrmDevuelta extends JFrame {

    //metodo constructor
    public FrmDevuelta(){

        setSize(500,400);
        setTitle("Cálculo Devuelta");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblDeominacion = new JLabel("Denominación");
        lblDeominacion.setBounds(10, 10, 100, 25);
        add(lblDeominacion);

        JComboBox cmbDenominacion = new JComboBox();
        cmbDenominacion.setBounds(120, 10, 100, 25);
        add(cmbDenominacion);

        int[] denominaciones = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50};
        for (int denominacion : denominaciones) {
            cmbDenominacion.addItem(denominacion);
        }

        JButton btnExistencia = new JButton("Actualizar Existencia");
        btnExistencia.setBounds(10, 40, 200, 25);
        add(btnExistencia);

        JTextField txtExistencia = new JTextField();
        txtExistencia.setBounds(220, 40, 50, 25);
        add(txtExistencia);

        JLabel lblDevolver = new JLabel("Valor a Devolver");
        lblDevolver.setBounds(10, 70, 150, 25);
        add(lblDevolver);

        JTextField txtDevolver = new JTextField();
        txtDevolver.setBounds(220, 70, 100, 25);
        add(txtDevolver);

        JButton btnDevolver = new JButton("Cálcular");
        btnDevolver.setBounds(330, 70, 100, 25);
        add(btnDevolver);

        JTable tblDevuelta = new JTable();
        JScrollPane spDevuelta = new JScrollPane(tblDevuelta);
        spDevuelta.setBounds(10, 100, 470, 150);
        add(spDevuelta);

        String[] encabezados = {"Cantidad", "Presentación", "Denominación"};
        DefaultTableModel dtm = new DefaultTableModel(null, encabezados);
        tblDevuelta.setModel(dtm);

    }

}
