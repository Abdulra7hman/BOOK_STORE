package BOOK_STORE;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StoreApp extends JFrame implements ActionListener {

    private DefaultTableModel bookModel, customerModel, orderModel;
    private JButton booksBtn, customersBtn, ordersBtn;

    public StoreApp() {
        setTitle("Book Store System");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Header
        JLabel header = new JLabel("Book Store System", SwingConstants.CENTER);
        header.setFont(new Font("SansSerif", Font.BOLD, 24));
        header.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(header, BorderLayout.NORTH);

        // Tabbed pane
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Books", createBookPanel());
        tabs.addTab("Customers", createCustomerPanel());
        tabs.addTab("Orders", createOrderPanel());
        add(tabs, BorderLayout.CENTER);
        // Make the frame visible after adding all components
        setVisible(true);
    }

    private JPanel createBookPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        bookModel = new DefaultTableModel(new String[]{"ID", "Title", "Price", "Stock"}, 0);
        JTable table = new JTable(bookModel);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        // Input area
        JPanel input = new JPanel(new FlowLayout());
        JTextField idField = new JTextField(5);
        JTextField titleField = new JTextField(10);
        JTextField priceField = new JTextField(7);
        JTextField stockField = new JTextField(5);
        JButton addBtn = new JButton("Add Book");
        input.add(new JLabel("ID:")); input.add(idField);
        input.add(new JLabel("Title:")); input.add(titleField);
        input.add(new JLabel("Price:")); input.add(priceField);
        input.add(new JLabel("Stock:")); input.add(stockField);
        input.add(addBtn);
        panel.add(input, BorderLayout.NORTH);

        // Delete button
        JButton delBtn = new JButton("Delete Selected");
        panel.add(delBtn, BorderLayout.SOUTH);

        // Action Listeners
        addBtn.addActionListener(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                String title = titleField.getText();
                double price = Double.parseDouble(priceField.getText());
                int stock = Integer.parseInt(stockField.getText());
                bookModel.addRow(new Object[]{id, title, price, stock});
                idField.setText(""); titleField.setText(""); priceField.setText(""); stockField.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input for book entry.");
            }
        });
        delBtn.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row >= 0) bookModel.removeRow(row);
        });
        return panel;
    }

    private JPanel createCustomerPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        customerModel = new DefaultTableModel(new String[]{"ID", "Name", "Email", "Phone"}, 0);
        JTable table = new JTable(customerModel);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel input = new JPanel(new FlowLayout());
        JTextField idField = new JTextField(5);
        JTextField nameField = new JTextField(10);
        JTextField emailField = new JTextField(12);
        JTextField phoneField = new JTextField(10);
        JButton addBtn = new JButton("Add Customer");
        input.add(new JLabel("ID:")); input.add(idField);
        input.add(new JLabel("Name:")); input.add(nameField);
        input.add(new JLabel("Email:")); input.add(emailField);
        input.add(new JLabel("Phone:")); input.add(phoneField);
        input.add(addBtn);
        panel.add(input, BorderLayout.NORTH);

        JButton delBtn = new JButton("Delete Selected");
        panel.add(delBtn, BorderLayout.SOUTH);

        addBtn.addActionListener(e -> {
            try {
                int id = Integer.parseInt(idField.getText());
                String name = nameField.getText();
                String email = emailField.getText();
                String phone = phoneField.getText();
                customerModel.addRow(new Object[]{id, name, email, phone});
                idField.setText(""); nameField.setText(""); emailField.setText(""); phoneField.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input for customer entry.");
            }
        });
        delBtn.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row >= 0) customerModel.removeRow(row);
        });
        return panel;
    }

    private JPanel createOrderPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        orderModel = new DefaultTableModel(new String[]{"Order ID", "Date", "Customer ID"}, 0);
        JTable table = new JTable(orderModel);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel input = new JPanel(new FlowLayout());
        JTextField orderIdField = new JTextField(5);
        JTextField dateField = new JTextField(10);
        JTextField custIdField = new JTextField(5);
        JButton addBtn = new JButton("Add Order");
        input.add(new JLabel("Order ID:")); input.add(orderIdField);
        input.add(new JLabel("Date:")); input.add(dateField);
        input.add(new JLabel("Customer ID:")); input.add(custIdField);
        input.add(addBtn);
        panel.add(input, BorderLayout.NORTH);

        JButton delBtn = new JButton("Delete Selected");
        panel.add(delBtn, BorderLayout.SOUTH);

        addBtn.addActionListener(e -> {
            try {
                int oid = Integer.parseInt(orderIdField.getText());
                String date = dateField.getText();
                int cid = Integer.parseInt(custIdField.getText());
                orderModel.addRow(new Object[]{oid, date, cid});
                orderIdField.setText(""); dateField.setText(""); custIdField.setText("");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input for order entry.");
            }
        });
        delBtn.addActionListener(e -> {
            int row = table.getSelectedRow();
            if (row >= 0) orderModel.removeRow(row);
        });
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new StoreApp());
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
