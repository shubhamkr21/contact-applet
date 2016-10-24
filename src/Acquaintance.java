import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import com.jgoodies.forms.factories.Borders.EmptyBorder;

public class Acquaintance extends JApplet {

	private JPanel contentPane;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTable table_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	
	static ArrayList<casual> casual_list = new ArrayList<casual> ();
	static ArrayList<personal> personal_list = new ArrayList<personal> ();
	static ArrayList<professional> prof_list = new ArrayList<professional> ();
	static ArrayList<relative> relative_list = new ArrayList<relative> ();
	
	private JTable table_2;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable table_3;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTable table;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTable table_4;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;

	/**
	 * Launch the application.
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void init(String[] args) throws ClassNotFoundException, IOException {
		loadFromFile();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acquaintance frame = new Acquaintance();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Acquaintance() {
		//setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 807, 527);
		contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		tabbedPane.setBounds(0, 0, 791, 452);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Personal Friends", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 786, 304);
		panel.add(scrollPane);
		
		table_1 = new JTable();
		DefaultTableModel model = (new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Mobile", "Email Id", "Context", "Acq. Date", "Events"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Object.class, Object.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_1.setModel(model);
		scrollPane.setViewportView(table_1);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 317, 61, 21);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(49, 317, 109, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setBounds(168, 315, 67, 21);
		panel.add(lblMobile);
		
		textField_1 = new JTextField();
		textField_1.setBounds(220, 317, 109, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblEmailId = new JLabel("Email Id");
		lblEmailId.setBounds(339, 317, 61, 21);
		panel.add(lblEmailId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(396, 315, 164, 24);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblContext = new JLabel("Context ");
		lblContext.setBounds(10, 358, 61, 30);
		panel.add(lblContext);
		
		textField_3 = new JTextField();
		textField_3.setToolTipText("upto 100 characters\r\n");
		textField_3.setBounds(81, 364, 192, 24);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblAcqDate = new JLabel("Acq. Date");
		lblAcqDate.setBounds(584, 315, 61, 30);
		panel.add(lblAcqDate);
		
		textField_4 = new JTextField();
		textField_4.setBounds(655, 318, 118, 24);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEvents = new JLabel("Events");
		lblEvents.setBounds(298, 362, 67, 22);
		panel.add(lblEvents);
		
		textField_5 = new JTextField();
		textField_5.setBounds(349, 363, 164, 25);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		int personalcount = personal_list.size();
		for(int i=0; i<personalcount; i++)
		{
		    Object [] p = {personal_list.get(i).getname(),personal_list.get(i).getmobile(),personal_list.get(i).get_email(),personal_list.get(i).getContext(),personal_list.get(i).getAcqdate(),personal_list.get(i).getEvents()};
			model.addRow(p);
		}
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setFont(new Font("Verdana", Font.BOLD, 15));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String name = textField.getText();
			    String mobile = textField_1.getText();
			    String email = textField_2.getText();
			    String context = textField_3.getText();
			    String date = textField_4.getText();
			    String event = textField_5.getText();
			    personal per = new personal(name,mobile,email,context,date,event);
			    Object [] p = {name,mobile,email,context,date,event};
			    model.addRow(p);
			    personal_list.add(per);
			    textField.setText(null);
			    textField_1.setText(null);
			    textField_2.setText(null);
			    textField_3.setText(null);
			    textField_4.setText(null);
			    textField_5.setText(null);
			}
		});
		btnAdd.setBounds(558, 376, 87, 37);
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = table_1.getSelectedRow();
				try{
				model.removeRow(index);
				personal_list.remove(index);
				} catch (Exception e) {
					if(personal_list.size() == 0){
						JOptionPane.showMessageDialog(null, "List is Empty", "alert", JOptionPane.ERROR_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(null, "Select a Row", "alert", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		btnDelete.setBounds(655, 376, 119, 37);
		panel.add(btnDelete);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Professional Friends", null, panel_1, null);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 786, 325);
		panel_1.add(scrollPane_1);
		
		table_2 = new JTable();
		DefaultTableModel model_1 = (new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Mobile", "Email Id", "Interest"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_2.setModel(model_1);
		scrollPane_1.setViewportView(table_2);
		
		JLabel label = new JLabel("Name");
		label.setBounds(20, 335, 69, 29);
		panel_1.add(label);
		
		textField_6 = new JTextField();
		textField_6.setBounds(65, 335, 129, 25);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblEmailId_1 = new JLabel("Email Id");
		lblEmailId_1.setBounds(215, 339, 55, 21);
		panel_1.add(lblEmailId_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(265, 336, 181, 25);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblMobile_1 = new JLabel("Mobile");
		lblMobile_1.setBounds(489, 338, 55, 22);
		panel_1.add(lblMobile_1);
		
		textField_8 = new JTextField();
		textField_8.setBounds(550, 337, 153, 24);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Interest");
		lblNewLabel.setBounds(43, 383, 55, 25);
		panel_1.add(lblNewLabel);
		
		textField_9 = new JTextField();
		textField_9.setToolTipText("upto 100 characters");
		textField_9.setBounds(112, 383, 238, 25);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		for(int i=0; i<prof_list.size(); i++)
		{
		    Object [] p = {prof_list.get(i).getname(),prof_list.get(i).getmobile(),prof_list.get(i).get_email(),prof_list.get(i).getInterest()};
			model_1.addRow(p);
		}
		JButton btnAdd_1 = new JButton("ADD");
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField_6.getText();
			    String mobile = textField_7.getText();
			    String email = textField_8.getText();
			    String Interest = textField_9.getText();
			    professional prof = new professional(name,mobile,email,Interest);
			    Object [] p = {name,mobile,email,Interest};
			    model_1.addRow(p);
			    prof_list.add(prof);
			    textField_6.setText(null);
			    textField_7.setText(null);
			    textField_8.setText(null);
			    textField_9.setText(null);
			}
		});
		btnAdd_1.setFont(new Font("Verdana", Font.BOLD, 15));
		btnAdd_1.setBounds(440, 374, 116, 38);
		panel_1.add(btnAdd_1);
		
		JButton btnDelete_1 = new JButton("DELETE");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = table_2.getSelectedRow();
				try{
					model_1.removeRow(index);
					prof_list.remove(index);
					} catch (Exception e) {
						if(prof_list.size() == 0){
							JOptionPane.showMessageDialog(null, "List is Empty", "alert", JOptionPane.ERROR_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Select a Row", "alert", JOptionPane.ERROR_MESSAGE);
						}
					}
			}
		});
		btnDelete_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		btnDelete_1.setBounds(620, 375, 144, 38);
		panel_1.add(btnDelete_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Relatives", null, panel_2, null);
		panel_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 786, 324);
		panel_2.add(scrollPane_2);
		
		table_3 = new JTable();
		DefaultTableModel model_3 = (new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Mobile", "Email Id", "DOB", "Date of Last Meeting"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_3.setModel(model_3);
		scrollPane_2.setViewportView(table_3);
		
		JLabel label_1 = new JLabel("Name");
		label_1.setBounds(41, 336, 69, 29);
		panel_2.add(label_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(86, 336, 116, 29);
		panel_2.add(textField_10);
		
		JLabel label_2 = new JLabel("Email Id");
		label_2.setBounds(236, 340, 55, 21);
		panel_2.add(label_2);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(286, 337, 180, 28);
		panel_2.add(textField_11);
		
		JLabel label_3 = new JLabel("Mobile");
		label_3.setBounds(506, 343, 55, 22);
		panel_2.add(label_3);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(571, 337, 144, 28);
		panel_2.add(textField_12);
		
		for(int i=0; i<relative_list.size(); i++)
		{
		    Object [] p = {relative_list.get(i).getname(),relative_list.get(i).getmobile(),relative_list.get(i).get_email(),relative_list.get(i).getBday(),relative_list.get(i).getDolm()};
			model_3.addRow(p);
		}
		
		JButton button = new JButton("ADD");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField_10.getText();
			    String mobile = textField_11.getText();
			    String email = textField_12.getText();
			    String dob = textField_16.getText();
			    String dolm = textField_17.getText();
			    relative rel = new relative(name,mobile,email,dob,dolm);
			    Object [] p = {name,mobile,email,dob,dolm};
			    model_3.addRow(p);
			    relative_list.add(rel);
			    textField_10.setText(null);
			    textField_11.setText(null);
			    textField_12.setText(null);
			    textField_16.setText(null);
			    textField_17.setText(null);
			}
		});
		button.setFont(new Font("Verdana", Font.BOLD, 15));
		button.setBounds(461, 375, 116, 38);
		panel_2.add(button);
		
		JButton button_1 = new JButton("DELETE");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = table_3.getSelectedRow();
				try{
					model_3.removeRow(index);
					relative_list.remove(index);
					} catch (Exception e) {
						if(relative_list.size() == 0){
							JOptionPane.showMessageDialog(null, "List is Empty", "alert", JOptionPane.ERROR_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Select a Row", "alert", JOptionPane.ERROR_MESSAGE);
						}
					}
			}
		});
		button_1.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		button_1.setBounds(617, 375, 144, 38);
		panel_2.add(button_1);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setBounds(31, 386, 55, 21);
		panel_2.add(lblDob);
		
		textField_16 = new JTextField();
		textField_16.setToolTipText("Date of Birth");
		textField_16.setBounds(64, 384, 138, 29);
		panel_2.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblDate = new JLabel("DOLM");
		lblDate.setBounds(230, 389, 61, 24);
		panel_2.add(lblDate);
		
		textField_17 = new JTextField();
		textField_17.setToolTipText("Date of Last Meeting\r\n");
		textField_17.setBounds(289, 384, 138, 29);
		panel_2.add(textField_17);
		textField_17.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Casual Friends", null, panel_3, null);
		panel_3.setLayout(null);
		
		textField_13 = new JTextField();
		textField_13.setBounds(51, 335, 116, 29);
		textField_13.setColumns(10);
		panel_3.add(textField_13);
		
		JLabel label_4 = new JLabel("Name");
		label_4.setBounds(10, 335, 69, 29);
		panel_3.add(label_4);
		
		JLabel label_5 = new JLabel("Email Id");
		label_5.setBounds(177, 339, 55, 21);
		panel_3.add(label_5);
		
		textField_14 = new JTextField();
		textField_14.setBounds(228, 335, 147, 29);
		textField_14.setColumns(10);
		panel_3.add(textField_14);
		
		JLabel label_6 = new JLabel("Mobile");
		label_6.setBounds(385, 338, 55, 22);
		panel_3.add(label_6);
		
		textField_15 = new JTextField();
		textField_15.setBounds(426, 335, 144, 28);
		textField_15.setColumns(10);
		panel_3.add(textField_15);
		
		
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(0, 0, 786, 324);
		panel_3.add(scrollPane_3);
		
		table = new JTable();
		DefaultTableModel model_4 = (new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Mobile", "Email Id", "Acq. Date", "Place", "Circumstances", "Other(Useful Inf.)"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, Object.class, Object.class, Object.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.setModel(model_4);
		scrollPane_3.setViewportView(table);
		
		for(int i=0; i<casual_list.size(); i++)
		{
		    Object [] p = {casual_list.get(i).getname(),casual_list.get(i).getmobile(),casual_list.get(i).get_email(),casual_list.get(i).getCdate(),casual_list.get(i).getWhere(),casual_list.get(i).getCircum(),casual_list.get(i).getInfo()};
			model_4.addRow(p);
		}
		JButton button_2 = new JButton("ADD");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField_13.getText();
			    String mobile = textField_14.getText();
			    String email = textField_15.getText();
			    String dof = textField_18.getText();
			    String place = textField_19.getText();
			    String circum = textField_20.getText();
			    String other = textField_21.getText();
			    casual rel = new casual(name,mobile,email,dof,place,circum,other);
			    Object [] p = {name,mobile,email,dof,place,circum,other};
			    model_4.addRow(p);
			    casual_list.add(rel);
			    textField_13.setText(null);
			    textField_14.setText(null);
			    textField_15.setText(null);
			    textField_18.setText(null);
			    textField_19.setText(null);
			    textField_20.setText(null);
			    textField_21.setText(null);
			}
		});
		button_2.setBounds(562, 380, 88, 29);
		button_2.setFont(new Font("Verdana", Font.BOLD, 15));
		panel_3.add(button_2);
		
		JButton button_3 = new JButton("DELETE");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = table.getSelectedRow();
				try{
					model_4.removeRow(index);
					casual_list.remove(index);
					} catch (Exception e) {
						if(casual_list.size() == 0){
							JOptionPane.showMessageDialog(null, "List is Empty", "alert", JOptionPane.ERROR_MESSAGE);
						}
						else {
							JOptionPane.showMessageDialog(null, "Select a Row", "alert", JOptionPane.ERROR_MESSAGE);
						}
					}
			}
		});
		button_3.setBounds(660, 380, 116, 29);
		button_3.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 15));
		panel_3.add(button_3);
		
		JLabel lblNewLabel_1 = new JLabel("DOFM");
		lblNewLabel_1.setToolTipText("WHEN DO YOU MEET\r\n");
		lblNewLabel_1.setBounds(604, 338, 46, 22);
		panel_3.add(lblNewLabel_1);
		
		textField_18 = new JTextField();
		textField_18.setBounds(645, 337, 131, 25);
		panel_3.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Place");
		lblNewLabel_2.setToolTipText("Where do you meet.\r\n");
		lblNewLabel_2.setBounds(10, 384, 46, 24);
		panel_3.add(lblNewLabel_2);
		
		textField_19 = new JTextField();
		textField_19.setBounds(61, 383, 98, 27);
		panel_3.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblCircumstances = new JLabel("Circumstances");
		lblCircumstances.setToolTipText("In Which Circumstances do you meet\r\n");
		lblCircumstances.setBounds(177, 384, 88, 24);
		panel_3.add(lblCircumstances);
		
		textField_20 = new JTextField();
		textField_20.setBounds(275, 383, 97, 27);
		panel_3.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblOther = new JLabel("Others");
		lblOther.setToolTipText("Other Useful Informations");
		lblOther.setBounds(380, 389, 46, 14);
		panel_3.add(lblOther);
		
		textField_21 = new JTextField();
		textField_21.setBounds(426, 382, 107, 28);
		panel_3.add(textField_21);
		textField_21.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Acquaintances", null, panel_4, null);
		panel_4.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(0, 79, 786, 345);
		panel_4.add(scrollPane_4);
		
		table_4 = new JTable();
		DefaultTableModel model_5 = (new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Mobile", "Email Id", "Type"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, String.class, String.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table_4.setModel(model_5);
		scrollPane_4.setViewportView(table_4);
		
		JLabel lblSearchByName = new JLabel("Search by Name");
		lblSearchByName.setFont(new Font("Verdana", Font.BOLD, 15));
		lblSearchByName.setBounds(45, 11, 156, 38);
		panel_4.add(lblSearchByName);
		
		textField_22 = new JTextField();
		textField_22.setBounds(199, 18, 213, 28);
		panel_4.add(textField_22);
		textField_22.setColumns(10);
		
		JButton btnNewButton = new JButton("SEARCH");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int flag = 1;
				model_5.setRowCount(0);
				String name = textField_22.getText();
				if(name.length() == 0){
					JOptionPane.showMessageDialog(null,"Enter name","Alert",JOptionPane.ERROR_MESSAGE);
					flag = 2;
				}
				name = name.toLowerCase();
				for(int i=0; i<personal_list.size(); i++)
				{
					if(name.compareTo(personal_list.get(i).getname().toLowerCase()) == 0)
					{
						JOptionPane.showMessageDialog(null,"Name found in Personal List","Message",JOptionPane.INFORMATION_MESSAGE);
						Object []p = {personal_list.get(i).getname(),personal_list.get(i).getmobile(),personal_list.get(i).get_email(),"Personal"};
						model_5.addRow(p); 
						flag = 2;
						
					}
				}
				for(int i=0; i<relative_list.size(); i++)
				{
					if(name.compareTo(relative_list.get(i).getname().toLowerCase()) == 0)
					{
						JOptionPane.showMessageDialog(null,"Name found in Relative List","Message",JOptionPane.INFORMATION_MESSAGE);
						Object []p = {relative_list.get(i).getname(),relative_list.get(i).getmobile(),relative_list.get(i).get_email(),"Relative"};
						model_5.addRow(p);
						flag = 2;
					}
				}
				for(int i=0; i<prof_list.size(); i++)
				{
					if(name.compareTo(prof_list.get(i).getname().toLowerCase()) == 0)
					{
						JOptionPane.showMessageDialog(null,"Name found in Professional List","Message",JOptionPane.INFORMATION_MESSAGE);
						Object []p = {prof_list.get(i).getname(),prof_list.get(i).getmobile(),prof_list.get(i).get_email(),"Professional"};
						model_5.addRow(p); 
						flag = 2;
					}
				}
				for(int i=0; i<casual_list.size(); i++)
				{
					if(name.compareTo(casual_list.get(i).getname().toLowerCase()) == 0)
					{
						JOptionPane.showMessageDialog(null,"Name found in Casual List","Message",JOptionPane.INFORMATION_MESSAGE);
						Object []p = {casual_list.get(i).getname(),casual_list.get(i).getmobile(),casual_list.get(i).get_email(),"Casual"};
						model_5.addRow(p);
						flag = 2;
					}
				}
				textField_22.setText(null);
				if(flag == 1){
					JOptionPane.showMessageDialog(null,"Not found","Alert",JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		btnNewButton.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBounds(451, 16, 109, 28);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SHOW ALL");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 model_5.setRowCount(0);
				for(int i=0; i<personal_list.size(); i++)
				{
						Object []p = {personal_list.get(i).getname(),personal_list.get(i).getmobile(),personal_list.get(i).get_email(),"Personal"};
						model_5.addRow(p); 
				}
				for(int i=0; i<relative_list.size(); i++)
				{
						Object []p = {relative_list.get(i).getname(),relative_list.get(i).getmobile(),relative_list.get(i).get_email(),"Relative"};
						model_5.addRow(p); 
				}
				for(int i=0; i<prof_list.size(); i++)
				{
						Object []p = {prof_list.get(i).getname(),prof_list.get(i).getmobile(),prof_list.get(i).get_email(),"Professional"};
						model_5.addRow(p); 
				}
				for(int i=0; i<casual_list.size(); i++)
				{
						Object []p = {casual_list.get(i).getname(),casual_list.get(i).getmobile(),casual_list.get(i).get_email(),"Casual"};
						model_5.addRow(p); 
				}
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.BOLD, 16));
		btnNewButton_1.setBounds(621, 18, 118, 28);
		panel_4.add(btnNewButton_1);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/*try {
					saveToFile();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		btnExit.setBounds(664, 454, 117, 34);
		contentPane.add(btnExit);
		
	}
	
	public static void loadFromFile() throws IOException, ClassNotFoundException {
		int personalcount = 0;
		ObjectInputStream is;
		try{
			is = new ObjectInputStream(new FileInputStream("src/personal.txt"));
		}catch(FileNotFoundException e){
			personalcount = 0; return;
		}
		personalcount = is.readInt();
		for(int i=0; i<personalcount; i++){
			personal_list.add((personal) is.readObject());
			
		}
		is.close();
		
		int profcount = 0;
		ObjectInputStream is1;
		try{
			is1 = new ObjectInputStream(new FileInputStream("src/professional.txt"));
		}catch(FileNotFoundException e){
			profcount = 0; return;
		}
		profcount = is1.readInt();
		for(int i=0; i<profcount; i++){
			prof_list.add((professional) is1.readObject());
			
		}
		is1.close();
		
		int relcount = 0;
		ObjectInputStream is2;
		try{
			is2 = new ObjectInputStream(new FileInputStream("src/relative.txt"));
		}catch(FileNotFoundException e){
			relcount = 0; return;
		}
		relcount = is2.readInt();
		for(int i=0; i<relcount; i++){
			relative_list.add((relative) is2.readObject());
			
		}
		is2.close();
		
		int casualcount = 0;
		ObjectInputStream is3;
		try{
			is3 = new ObjectInputStream(new FileInputStream("src/casual.txt"));
		}catch(FileNotFoundException e){
			casualcount = 0; return;
		}
		casualcount = is3.readInt();
		for(int i=0; i<casualcount; i++){
			casual_list.add((casual) is3.readObject());
			
		}
		is3.close();
		
	}
	
	public static void saveToFile() throws FileNotFoundException, IOException {
        int personalcount = personal_list.size();
		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/personal.txt"));
		os.writeInt(personalcount);
		for(int i=0; i<personalcount; i++){
			os.writeObject(personal_list.get(i));
		}
		os.close();
		
		int profcount = prof_list.size();
		ObjectOutputStream os1 = new ObjectOutputStream(new FileOutputStream("src/professional.txt"));
		os1.writeInt(profcount);
		for(int i=0; i<profcount; i++){
			os1.writeObject(prof_list.get(i));
		}
		os1.close();
		
		int relativecount = relative_list.size();
		ObjectOutputStream os2 = new ObjectOutputStream(new FileOutputStream("src/relative.txt"));
		os2.writeInt(relativecount);
		for(int i=0; i<relativecount; i++){
			os2.writeObject(relative_list.get(i));
		}
		os2.close();
		
		int casualcount = casual_list.size();
		ObjectOutputStream os3 = new ObjectOutputStream(new FileOutputStream("src/casual.txt"));
		os3.writeInt(casualcount);
		for(int i=0; i<casualcount; i++){
			os3.writeObject(casual_list.get(i));
		}
		os3.close();
	}
}
