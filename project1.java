import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;


class Customer {
    private int softwareID, points;
    private String price,name, year;
}

class Basket {
    private int Basket, softwareTotal;
    private String priceTotal;
}
public class project1 extends JFrame{
    private JTabbedPane custTable;
    private JPanel mainP;
    private JPanel insertGamePanel;
    private JPanel deletePanel;
    private JPanel updatePanel;
    private JPanel queriesPanel;
    private JPanel insertCustomerPanel;
    private JTextField phonetextField;
    private JTextField addresstextField2;
    private JTextField emailField;
    private JTextField userField;
    private JButton insertCustomerButton;
    private JLabel emailInsertLabel;
    private JLabel addInsertLabel;
    private JLabel userInsertLabel;
    private JLabel phoneInsertLabel;
    private JTextField insertYear;
    private JTextField insertName;
    private JTextField insertPrice;
    private JTextField insertSoftID;
    private JButton insertGameButton;
    private JLabel yearLabel;
    private JLabel nameLabel;
    private JLabel priceLabel;
    private JLabel softwareIDlabel;
    private JTabbedPane PublisherUpPanel;
    private JPanel GamesUPPanel;
    private JPanel CustomerUPPanel;
    private JPanel BasketUPPanel;
    private JPanel InsertBasketPanel;
    private JLabel basketIDLabel;
    private JLabel totalBasketPriceLabel;
    private JLabel totalsoftware;
    private JLabel totalpointsLabel;
    private JTabbedPane BasketDeleteTab;
    private JPanel GameDeleteTab;
    private JPanel BasketDeleteab;
    private JPanel CustomerDeleteTab;
    private JTextField insertPoints;
    private JTextField insertTotalSoft;
    private JTextField insertBasket;
    private JTextField insertPriceTotal;
    private JButton InsertBasketButton;
    private JTextField custUpField;
    private JTextField emailUpField;
    private JTextField addressUpField;
    private JTextField phoneUpField;
    private JTextField basketUp;
    private JTextField priceTotalUp;
    private JTextField totalsoftwareUp;
    private JTextField pointsUp;
    private JTextField softDel;
    private JButton delGameButton;
    private JTextField basketDel;
    private JTextField priceDel;
    private JTextField totalSoftDel;
    private JTextField pointsDel;
    private JButton delBasketButton;
    private JButton delCustButton;
    private JButton upBasketButton;
    private JButton upCustomerButton;
    private JButton upGameButton;
    private JTextField insertGamePoints;
    private JLabel insertPointsGiven;
    private JTextField softUP;
    private JTextField priceUP;
    private JTextField nameUP;
    private JTextField pointsGivenUp;
    private JTextField yearUP;
    private JTextField userDel;
    private JTextField emailDel;
    private JTextField addressDel;
    private JTextField phoneDel;
    private JPanel findGamePanel;
    private JTextField findNameField;
    private JButton findButton;
    private JLabel idLabel;
    private JTabbedPane tabbedPane2;
    private JTextField insertPubYear;
    private JTextField insertPubName;
    private JButton insertPubButton;
    private JPanel publisherPanel;
    private JPanel publisherUPPanel;
    private JTextField pubNameUp;
    private JTextField pubYearUp;
    private JPanel pubDelPanel;
    private JTextField pubNameDel;
    private JTextField pubYearDel;
    private JButton pubDelButton;
    private JButton pubUpButton;
    private JLabel insertGameLabel;
    private JLabel insertBasketLabel;
    private JLabel insertPubLabel;
    private JLabel insertCustLabel;
    private JLabel gameUpLab;
    private JLabel baskUpLab;
    private JLabel custUpLab;
    private JLabel pubUpLab;
    private JPanel listPanel;
    private JTabbedPane listTab;
    private JPanel custListTab;
    private JPanel gameListTab;
    private JPanel pubListTab;
    private JPanel basketListTab;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JTable gameTable = new JTable();
    private JTable basketTable;
    private JTable cusTab;
    private JTable pubTab;
    private JLabel gamesDelLab;
    private JLabel baskDelLab;
    private JLabel custDelLab;
    private JLabel pubDelLab;
    private JTable findTable;
    private JScrollPane findScroll;

    public ArrayList<Customer> userList() {
        ArrayList<Customer> custList = new ArrayList<>();
        return custList;
    }
    public void connect(String sql, String start) {
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://127.0.0.1:3306/meats?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "root";
        // change to pvong2pvong3 on mac
        try {
            connection = DriverManager.getConnection(url, username, password);
            stmt = connection.createStatement();
            if (start != "SELECT") {
                stmt.executeUpdate(sql);
            } else {
                rs = stmt.executeQuery(sql);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public void connectQuery(String sql, JLabel idLabel){
        Connection connection = null;
        Statement stmt = null;
        ResultSet rs = null;
        String url = "jdbc:mysql://127.0.0.1:3306/meats?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username = "root";
        String password = "root";
        // change to pvong2pvong3 on mac
        try {
            connection = DriverManager.getConnection(url, username, password);
            stmt = connection.createStatement();
            rs = stmt.executeQuery(sql);
            String [] col = {"Name"};
            String[][] data = {{"test"}, {"test1"}};
            findTable = new JTable(data,col);
            //findTable.setPreferredScrollableViewportSize(new Dimension(450,63));
            //findTable.setFillsViewportHeight(true);
            findScroll = new JScrollPane(findTable);
            //add(findScroll);
            if (rs.next() == false) {
                idLabel.setText("Not Found");
            }
            else {
                /*
                ArrayList<String> namesCollect = new ArrayList<>();
                while(rs.next()) {
                    namesCollect.add(rs.getString("name"));
                }
                String display = "";
                for(int i = 0; i < namesCollect.size(); i++) {
                    display += namesCollect.get(0);
                    display += ", ";
                }
                idLabel.setText("Games Found Are:" + display);
                // idLabel.setText("Name:" + rs.getString("name"));
                //idLabel.setText("Found " + (namesCollect.size()) + " games");
                //idLabel.setText("Name:" + rs.getString("name"));

                DefaultTableModel model = DefaultTableModel.create */



                int count = 0;
                while (rs.next()) {
                    Vector<String> vector = new Vector<String>();
                }
                //DefaultTableModel model = new DefaultTableModel(data, columns);



            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public project1(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainP);
        this.pack();

        String[][] data = {};
        String[] columnNames = {"Software ID", "Price", "Name", "Year"};

        JTable table = new JTable(data, columnNames);
        DefaultTableModel model = new DefaultTableModel();

        gameTable.setAutoCreateRowSorter(true);
        gameTable.setFillsViewportHeight(true);
        gameTable.setPreferredScrollableViewportSize(new Dimension(500,200));
        model.addColumn("Software ID");
        model.addColumn("Price");
        model.addColumn("Name");
        model.addColumn("Year");
        gameTable.setModel(model);

/////////////////////////////////////// INSERT /////////////////////////////////////////
        insertGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "INSERT";
                int softwareIDtext = Integer.parseInt(insertSoftID.getText());
                double priceText = (Double.parseDouble(insertPrice.getText()));
                //String priceText = insertPrice.getText();
                String nameText = insertName.getText();
                int yearText = Integer.parseInt(insertYear.getText());
                int pointsGiven = Integer.parseInt(insertGamePoints.getText().trim());
                //String insertGameSQL= "Insert into software values(softwareIDtext, priceText, nameText, yearText, pointsGiven)";
                insertGameLabel.setText("Added!");
                String insertGameSQL= "Insert INTO software VALUES(" + softwareIDtext + "," + priceText + ",'" + nameText + "',"  +  pointsGiven+ "," + yearText + ")";
                connect(insertGameSQL,s);
            }
        });
        InsertBasketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "INSERT";
                int basketIDtext = Integer.parseInt(insertBasket.getText());
                double priceTotalText = Double.parseDouble(insertPriceTotal.getText());
                int totalSoft = Integer.parseInt(insertTotalSoft.getText());
                int pointsTotalText = Integer.parseInt(insertPoints.getText());

                // String insertBasketSQL= "Insert into basket values(basketIDtext, priceTotalText, totalSoft, pointsTotalText)"
                insertBasketLabel.setText("Added!");
                String insertBasketSQL= "Insert INTO basket VALUES(" + basketIDtext + ",'" + priceTotalText + "'," + totalSoft + ","  +  pointsTotalText + ")";
                connect(insertBasketSQL,s);
            }
        });
        insertCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "INSERT";
                String userFieldText = userField.getText();
                String emailText = emailField.getText();
                String addressText = addresstextField2.getText();
                String phoneText = phonetextField.getText();

                //String insertCustomerSQL= "Insert into customer values(userFieldText, emailText, addressText, phoneText)";
                String insertCustomerSQL= "INSERT INTO customer VALUES('" + userFieldText + "','" + emailText + "','" + addressText + "','"  +  phoneText + "')";
                connect(insertCustomerSQL, s);
                insertCustLabel.setText("Added!");
            }
        });


        ///////////////////////////////////////// UPDATE ////////////////////////////////////
        upGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "UPDATE";
                int softwareIDtext = Integer.parseInt(softUP.getText());
                double priceText = (Double.parseDouble(priceUP.getText()));
                String nameText = nameUP.getText();
                int yearText = Integer.parseInt(yearUP.getText());
                int pointsGiven = Integer.parseInt(pointsGivenUp.getText().trim());

                String upGameSQL= "Update software set price = " + priceText + ",name = '" + nameText + "',points_given= " +  pointsGiven + ",year=" + yearText + " where software_id = " + softwareIDtext;
                connect(upGameSQL,s);
                gameUpLab.setText("Updated!");
            }
        });
        upBasketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "UPDATE";
                int basketIDtext = Integer.parseInt(basketUp.getText());
                double priceTotalText = Double.parseDouble(priceTotalUp.getText());
                int totalSoft = Integer.parseInt(totalsoftwareUp.getText());
                int pointsTotalText = Integer.parseInt(pointsUp.getText());

                String upBasketSQL = "Update basket set  price_total = " + priceTotalText + ",software_total = " + totalSoft + ", points_total = " + pointsTotalText + " where basket_id = " + basketIDtext;
                connect(upBasketSQL, s);
                baskUpLab.setText("Updated!");


            }
        });
        upCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "UPDATE";
                String userFieldText = custUpField.getText();
                String emailText = emailUpField.getText();
                String addressText = addressUpField.getText();
                String phoneText = phoneUpField.getText();

                //String upCustomerSQL = "Update customer set  email = emailText, address = addressText, phone = phoneText where username = userFieldText";
                String upCustomerSQL= "Update customer set email = '" + emailText + "',address = '" + addressText + "',phone='"  +  phoneText + "' where username = '" + userFieldText + "'";
                connect(upCustomerSQL,s);
                custUpLab.setText("Updated!");
            }
        });


        /////////////////////////////////////// DELETE /////////////////////////////////////////
        delGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "DELETE";
                int softwareIDText = Integer.parseInt(softDel.getText());
                String delGameSQL = "Delete from software where software_id = " + softwareIDText;
                connect(delGameSQL,s);
                gamesDelLab.setText("Deleted");
            }
        });
        delBasketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "DELETE";
                String basketIDtext = basketDel.getText();
                String delBasketSQL = "Delete from basket where basket_id = " + basketIDtext;
                connect(delBasketSQL,s);
                baskDelLab.setText("Deleted");
            }
        });
        delCustButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "DELETE";
                String userFieldText = userDel.getText();
                String delCustSQL = "Delete from customer where username = '" + userFieldText +"'";
                connect(delCustSQL,s);
                custDelLab.setText("Deleted");
            }
        });


        /////////////////////////////////////// FIND /////////////////////////////////////////
        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "SELECT";
                String getNameText = findNameField.getText().toLowerCase();
                String foundGameID = " ";
                String findGameSQL = "Select name from software where name LIKE '%" + getNameText + "%'";
                connectQuery(findGameSQL, idLabel);
               // idLabel.setText(getNameText + " id is " + foundGameID);
            }
        });

        /////////////////////////////////////// PUBLISHER /////////////////////////////////////////
        insertPubButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "INSERT";
                String pubNameText = insertPubName.getText();
                int pubYearText = Integer.parseInt(insertPubYear.getText());
                String insertPubSQL = "Insert into publisher (pub_name, year) values('" + pubNameText + "'," +  pubYearText + ")";
                connect(insertPubSQL, s);
                insertPubLabel.setText("Inserted!");
            }
        });
        pubUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "UPDATE";
                String pubNameText = pubNameUp.getText();
                int pubYearText = Integer.parseInt(pubYearUp.getText());

                String updatePubSQL = "Update publisher set year = " + pubYearText + " Where pub_name= '" + pubNameText + "'";
                connect(updatePubSQL,s);
                pubUpLab.setText("Updated!");
            }
        });
        pubDelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = "DELETE";
                String pubNameText = pubNameDel.getText();
                String delPubSQL = "Delete from publisher where pub_name = '" + pubNameText + "'";
                connect(delPubSQL,s);
                pubUpLab.setText("Deleted!");
                //list software
                //String listSoftware = "Select * from software"
                //list publishers
                // String listPubs = "Select * from publisher"
                //list customers
                // String listCust = "Select * from customers";

                // select * from software where points = (select max(points) from software)
                // select pub_name, count(software_id) from publisher where software_id = (select name from software group by software_id order by count(software_id > 0)
                // select name, price from software where price < (select avg(price) from software)
                // select

            }
        });
    }

    public void gamesTableFunc(){
        String[][] data = {};
        String[] columnNames = {"Software ID", "Price", "Name", "Year"};

        JTable table = new JTable(data, columnNames);
        DefaultTableModel model = new DefaultTableModel();

        gameTable.setAutoCreateRowSorter(true);
        gameTable.setFillsViewportHeight(true);
        gameTable.setPreferredScrollableViewportSize(new Dimension(500,200));
        model.addColumn("Software ID");
        model.addColumn("Price");
        model.addColumn("Name");
        model.addColumn("Year");
        gameTable.setModel(model);
        add(new JScrollPane(gameTable));

    }

    public void basketsTableFunc() {
        String[][] data = {};
        String[] columnNames = {"Basket", "Price Total", "Total Software", "Points Total"};
        JTable baskTab = new JTable(data, columnNames);
        // basketsTable = baskTab;
        baskTab.setVisible(true);
    }

    public void CustomersTableFunc() {
        String[][] data = {};
        String[] columnNames = {"Username", "Email", "Address", "Phone"};
        JTable customerTab = new JTable(data, columnNames);
        // customerTable = customerTab;
        customerTab.setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new project1("meatS Admin Mode");
        frame.setVisible(true);
        frame.setSize(new Dimension(1000,800));

    }



}

