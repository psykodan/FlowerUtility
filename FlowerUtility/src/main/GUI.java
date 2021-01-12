package main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.bson.Document;
import org.bson.types.ObjectId;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField engName;
	private JTextField latName;
	private JTextField irName;
	private JTextField descF;
	private JLabel lblNewLabel_4;
	private JTextField colour;
	static MongoDatabase database;
	private JTextField copyright;
	private JTextField descL;
	private JTextField descNTBCW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		MongoClient mongoClient = MongoClients.create(
				"mongodb+srv://flower:flower123@cluster0.fksav.mongodb.net/burrenflowerguide?retryWrites=true&w=majority");
		database = mongoClient.getDatabase("burrenflowerguide");

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("English Name");
		lblNewLabel.setBounds(12, 13, 88, 16);
		contentPane.add(lblNewLabel);

		engName = new JTextField();
		engName.setBounds(112, 10, 308, 22);
		contentPane.add(engName);
		engName.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Latin Name");
		lblNewLabel_1.setBounds(12, 45, 88, 16);
		contentPane.add(lblNewLabel_1);

		latName = new JTextField();
		latName.setColumns(10);
		latName.setBounds(112, 42, 308, 22);
		contentPane.add(latName);

		JLabel lblNewLabel_2 = new JLabel("Irish Name");
		lblNewLabel_2.setBounds(12, 77, 88, 16);
		contentPane.add(lblNewLabel_2);

		irName = new JTextField();
		irName.setColumns(10);
		irName.setBounds(112, 74, 308, 22);
		contentPane.add(irName);

		JLabel lblNewLabel_3 = new JLabel("Description");
		lblNewLabel_3.setBounds(12, 109, 88, 16);
		contentPane.add(lblNewLabel_3);

		descF = new JTextField();
		descF.setColumns(10);
		descF.setBounds(185, 106, 235, 19);
		contentPane.add(descF);

		lblNewLabel_4 = new JLabel("Flowering");
		lblNewLabel_4.setBounds(12, 219, 56, 16);
		contentPane.add(lblNewLabel_4);

		JCheckBox jan = new JCheckBox("January");
		jan.setBounds(112, 215, 113, 25);
		contentPane.add(jan);

		JCheckBox feb = new JCheckBox("February");
		feb.setBounds(112, 245, 113, 25);
		contentPane.add(feb);

		JCheckBox march = new JCheckBox("March");
		march.setBounds(112, 275, 113, 25);
		contentPane.add(march);

		JCheckBox april = new JCheckBox("April");
		april.setBounds(112, 305, 113, 25);
		contentPane.add(april);

		JCheckBox may = new JCheckBox("May");
		may.setBounds(112, 335, 113, 25);
		contentPane.add(may);

		JCheckBox june = new JCheckBox("June");
		june.setBounds(112, 365, 113, 25);
		contentPane.add(june);

		JCheckBox july = new JCheckBox("July");
		july.setBounds(229, 215, 113, 25);
		contentPane.add(july);

		JCheckBox august = new JCheckBox("August");
		august.setBounds(229, 245, 113, 25);
		contentPane.add(august);

		JCheckBox sept = new JCheckBox("September");
		sept.setBounds(229, 275, 113, 25);
		contentPane.add(sept);

		JCheckBox oct = new JCheckBox("October");
		oct.setBounds(229, 305, 113, 25);
		contentPane.add(oct);

		JCheckBox nov = new JCheckBox("November");
		nov.setBounds(229, 335, 113, 25);
		contentPane.add(nov);

		JCheckBox dec = new JCheckBox("December");
		dec.setBounds(229, 365, 113, 25);
		contentPane.add(dec);

		JLabel lblNewLabel_5 = new JLabel("Colour");
		lblNewLabel_5.setBounds(12, 410, 56, 16);
		contentPane.add(lblNewLabel_5);

		colour = new JTextField();
		colour.setBounds(109, 407, 311, 22);
		contentPane.add(colour);
		colour.setColumns(10);

		JButton submit = new JButton("Submit");
		submit.setBounds(261, 505, 97, 25);
		contentPane.add(submit);
		
		JLabel lblNewLabel_7 = new JLabel("Copyright to");
		lblNewLabel_7.setBounds(12, 468, 88, 16);
		contentPane.add(lblNewLabel_7);
		
		copyright = new JTextField();
		copyright.setBounds(109, 465, 311, 22);
		contentPane.add(copyright);
		copyright.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Flowers");
		lblNewLabel_8.setBounds(112, 109, 56, 16);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Leaves");
		lblNewLabel_9.setBounds(112, 138, 39, 16);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Not to be confused with");
		lblNewLabel_10.setBounds(38, 167, 135, 16);
		contentPane.add(lblNewLabel_10);
		
		descL = new JTextField();
		descL.setBounds(185, 135, 235, 22);
		contentPane.add(descL);
		descL.setColumns(10);
		
		descNTBCW = new JTextField();
		descNTBCW.setBounds(185, 164, 235, 22);
		contentPane.add(descNTBCW);
		descNTBCW.setColumns(10);
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				// Creating a collection
				// database.createCollection("flowers");
				// System.out.println("Collection created successfully");
				String[] imgnameA = engName.getText().split(" ");
				String imgname = "";
				for(int i = 0; i < imgnameA.length; i++) {
				
					imgname+=imgnameA[i];
				}
				imgname+=".jpg";
						
				// Retrieving a collection
				MongoCollection<Document> collection = database.getCollection("flowers");
				System.out.println("Collection sampleCollection selected successfully");
				Document document = new Document("_id", new ObjectId());
				ArrayList<String> names = new ArrayList<String>();
				names.add(engName.getText());
				names.add(latName.getText());
				names.add(irName.getText());
				document.append("name", names);
				ArrayList<String> desc = new ArrayList<String>();
				desc.add(descF.getText());
				desc.add(descL.getText());
				desc.add(descNTBCW.getText());
				document.append("description", desc);
				ArrayList<String> times = new ArrayList<String>();
				if (jan.isSelected()) {
					times.add(jan.getText());
				}
				if (feb.isSelected()) {
					times.add(feb.getText());
				}
				if (march.isSelected()) {
					times.add(march.getText());
				}
				if (april.isSelected()) {
					times.add(april.getText());
				}
				if (may.isSelected()) {
					times.add(may.getText());
				}
				if (june.isSelected()) {
					times.add(june.getText());
				}
				if (july.isSelected()) {
					times.add(july.getText());
				}
				if (august.isSelected()) {
					times.add(august.getText());
				}
				if (sept.isSelected()) {
					times.add(sept.getText());
				}
				if (oct.isSelected()) {
					times.add(oct.getText());
				}
				if (nov.isSelected()) {
					times.add(nov.getText());
				}
				if (dec.isSelected()) {
					times.add(dec.getText());
				}
				document.append("time", times);
				document.append("colour", colour.getText());
				document.append("img", imgname);
				document.append("copyright", copyright.getText());

				// Inserting document into the collection
				collection.insertOne(document);
				System.out.println("Document inserted successfully");

				System.out.println(engName.getText());
				System.out.println(latName.getText());
				System.out.println(irName.getText());
				System.out.println(descF.getText());

				if (jan.isSelected()) {
					System.out.println(jan.getText());
				}
				if (feb.isSelected()) {
					System.out.println(feb.getText());
				}
				if (march.isSelected()) {
					System.out.println(march.getText());
				}
				if (april.isSelected()) {
					System.out.println(april.getText());
				}
				if (may.isSelected()) {
					System.out.println(may.getText());
				}
				if (june.isSelected()) {
					System.out.println(june.getText());
				}
				if (july.isSelected()) {
					System.out.println(july.getText());
				}
				if (august.isSelected()) {
					System.out.println(august.getText());
				}
				if (sept.isSelected()) {
					System.out.println(sept.getText());
				}
				if (oct.isSelected()) {
					System.out.println(oct.getText());
				}
				if (nov.isSelected()) {
					System.out.println(nov.getText());
				}
				if (dec.isSelected()) {
					System.out.println(dec.getText());
				}

				System.out.println(colour.getText());
				System.out.println(imgname);
				System.out.println(copyright.getText());

				engName.setText("");
				latName.setText("");
				irName.setText("");
				descF.setText("");
				descL.setText("");
				descNTBCW.setText("");

				jan.setSelected(false);
				feb.setSelected(false);
				march.setSelected(false);
				april.setSelected(false);
				may.setSelected(false);
				june.setSelected(false);
				july.setSelected(false);
				august.setSelected(false);
				sept.setSelected(false);
				oct.setSelected(false);
				nov.setSelected(false);
				dec.setSelected(false);

				colour.setText("");
				copyright.setText("");
			}
		});
	}
}
