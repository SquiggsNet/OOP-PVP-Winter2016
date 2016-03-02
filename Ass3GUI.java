import java.awt.event.*;

import javax.swing.*;

import java.awt.*;

import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Ass3GUI {

	private JFrame frame;
	private JPanel pnlWelcome;
	private JPanel pnlCharSelect;
	private JPanel pnlCharInput;
	private JPanel pnlCharMenu;
	private JPanel pnlArmouryMenu;
	private JPanel pnlArmoury;
	private JPanel pnlBattleIntro;
	private JPanel pnlBattleScreen;
	private JPanel pnlWinner;
	private JPanel pnlGameOver;
	private JPanel pnlCredits;
	
	private JSlider sldStudy;
	private JSlider sldAnalytics;
	private JSlider sldPenmanship;

	private JTextArea txtAreaStudentDescCreate;
	private JLabel lblStudentTypeCreate;
	private JTextField txtNameCreate;
	private JTextField txtStudyCreate;
	private JTextField txtAnalyticsCreate;
	private JTextField txtPenmanshipCreate;
	private JTextField txtPointsAvailCreate;
	private JLabel lblHeadCreate;
	private JLabel lblHatCreate;
	private JLabel lblTopCreate;
	private JLabel lblBottomCreate;
	
	private JTextArea txtAreaStudentDescCharMenu;
	private JLabel lblStudentTypeCharMenu;
	private JLabel lblCharacterNameCharMenu;
	private JLabel lblHeadCharMenu;
	private JLabel lblHatCharMenu;
	private JLabel lblTopCharMenu;
	private JLabel lblBottomCharMenu;
	
	private JTextArea txtAreaStudentDescLocker;
	private JLabel lblStudentTypeLocker;
	private JLabel lblCharacterNameLocker;
	private JLabel lblHeadLocker;
	private JLabel lblHatLocker;
	private JLabel lblTopLocker;
	private JLabel lblBottomLocker;
	
	private JLabel lblCharacterNameItemSelect;
	private JLabel lblHeadItemSelection;
	private JLabel lblHatItemSelection;
	private JLabel lblTopItemSelection;
	private JLabel lblBottomItemSelection;
	
	private JButton btnItem1;
	private JButton btnItem2;
	private JButton btnItem3;
	private JButton btnItem4;
	
	private JLabel label_22;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	
	private int points;
	private int gear;
	private int selected;
	
	private final ButtonGroup btnGroupCharSelect = new ButtonGroup();
	private JTextField txtBonusPointsWinner;
	private Business myBusiness = new Business();
	private final String[] splashNames= {"splash1.jpg","linedPaper.jpg"};
	private Icon[] splashIcons = {
			new ImageIcon(getClass().getResource("pics/"+splashNames[0])),
			new ImageIcon(getClass().getResource("pics/"+splashNames[1]))
	};
	private final String[] gameCharacterNames={"Study_1x1.jpg","Study_1x3.jpg","Sleepy_1x1.jpg","Sleepy_1x3.jpg","Keener_1x1.jpg","Keener_1x3.jpg"};
	private Icon[] gameCharacterIcons = {
			new ImageIcon(getClass().getResource("pics/"+gameCharacterNames[0])),
			new ImageIcon(getClass().getResource("pics/"+gameCharacterNames[1])),
			new ImageIcon(getClass().getResource("pics/"+gameCharacterNames[2])),
			new ImageIcon(getClass().getResource("pics/"+gameCharacterNames[3])),
			new ImageIcon(getClass().getResource("pics/"+gameCharacterNames[4])),
			new ImageIcon(getClass().getResource("pics/"+gameCharacterNames[5]))
	};
	private final String[] hatNames={"noHat_1x3.jpg","topHat_1x3.jpg", "partyHat_1x3.jpg","nightHat_1x3.jpg"};
	private Icon[] hatIcons={
			new ImageIcon(getClass().getResource("pics/"+hatNames[0])),
			new ImageIcon(getClass().getResource("pics/"+hatNames[1])),
			new ImageIcon(getClass().getResource("pics/"+hatNames[2])),
			new ImageIcon(getClass().getResource("pics/"+hatNames[3]))
	};
	private final String[] topNames={"tShirt_1x3.jpg","labShirt_1x3.jpg","pocketShirt_1x3.jpg","safetyShirt_1x3.jpg"};
	private Icon[] topIcons={
			new ImageIcon(getClass().getResource("pics/"+topNames[0])),
			new ImageIcon(getClass().getResource("pics/"+topNames[1])),
			new ImageIcon(getClass().getResource("pics/"+topNames[2])),
			new ImageIcon(getClass().getResource("pics/"+topNames[3]))
	};
	private final String[] bottomNames={"shortsBottom_1x3.jpg","slacksBottom_1x3.jpg","skirtBottom_1x3.jpg","diaperBottom_1x3.jpg"};
	private Icon[] bottomIcons={
			new ImageIcon(getClass().getResource("pics/"+bottomNames[0])),
			new ImageIcon(getClass().getResource("pics/"+bottomNames[1])),
			new ImageIcon(getClass().getResource("pics/"+bottomNames[2])),
			new ImageIcon(getClass().getResource("pics/"+bottomNames[3]))
	};
	private JTextField txtStudyCharMenu;
	private JTextField txtAnalyticsCharMenu;
	private JTextField txtPenmanshipCharMenu;
	private JTextField txtBonusCharMenu;
	private JTextField txtStudyLocker;
	private JTextField txtAnalyticsLocker;
	private JTextField txtPenmanshipLocker;
	private JTextField txtBonusLocker;
	private JTextField txtBonusItemSelection;
	private JPanel pnlSkillsCreate;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ass3GUI window = new Ass3GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ass3GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 530, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		pnlWelcome = new JPanel();
		frame.getContentPane().add(pnlWelcome, "name_72576306654514");
		pnlWelcome.setLayout(null);

		
		JButton btnNewGame = new JButton("New Game");
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(true);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
				
				
				
			}
		});
		btnNewGame.setBounds(274, 300, 230, 25);
		pnlWelcome.add(btnNewGame);
		
		JButton btnLoadGame = new JButton("Load Game");
		btnLoadGame.setBounds(10, 300, 230, 25);
		pnlWelcome.add(btnLoadGame);
		
		JLabel lblWelcome = new JLabel("Due Date!");
		lblWelcome.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcome.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblWelcome.setBounds(10, 11, 494, 23);
		pnlWelcome.add(lblWelcome);
		
		JLabel lblASquiggsnetProduction = new JLabel("A SquiggsNet Production.");
		lblASquiggsnetProduction.setHorizontalAlignment(SwingConstants.CENTER);
		lblASquiggsnetProduction.setFont(new Font("OCR A Extended", Font.PLAIN, 8));
		lblASquiggsnetProduction.setBounds(10, 31, 494, 14);
		pnlWelcome.add(lblASquiggsnetProduction);
		
		JLabel lblSplash = new JLabel("");
		lblSplash.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblSplash.setBounds(146, 55, 220, 220);
		pnlWelcome.add(lblSplash);
		lblSplash.setIcon(splashIcons[0]);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(0, 0, 514, 289);
		pnlWelcome.add(lblBackground);
		lblBackground.setIcon(splashIcons[1]);
		
		pnlCharSelect = new JPanel();
		pnlCharSelect.setLayout(null);
		frame.getContentPane().add(pnlCharSelect, "name_72589222128848");
		
		JLabel lblCharacters = new JLabel("Character Selection");
		lblCharacters.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacters.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblCharacters.setBounds(10, 11, 494, 23);
		pnlCharSelect.add(lblCharacters);
		
		JLabel lblSelectYourCharacter = new JLabel("Choose Your Character to Complete your Assignment!");
		lblSelectYourCharacter.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectYourCharacter.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		lblSelectYourCharacter.setBounds(10, 37, 494, 14);
		pnlCharSelect.add(lblSelectYourCharacter);
		
		JPanel pnlCharacters = new JPanel();
		pnlCharacters.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlCharacters.setBounds(114, 83, 288, 167);
		pnlCharSelect.add(pnlCharacters);
		pnlCharacters.setLayout(null);
		
		JRadioButton rdbtnStudy = new JRadioButton("Study Master");
		rdbtnStudy.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnStudy.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnStudy.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnGroupCharSelect.add(rdbtnStudy);
		rdbtnStudy.setBounds(6, 103, 86, 57);
		pnlCharacters.add(rdbtnStudy);
		
		JRadioButton rdbtnSleepy = new JRadioButton("Sleepy Head");
		rdbtnSleepy.setSelected(true);
		rdbtnSleepy.setVerticalTextPosition(SwingConstants.BOTTOM);
		rdbtnSleepy.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnSleepy.setHorizontalAlignment(SwingConstants.CENTER);
		btnGroupCharSelect.add(rdbtnSleepy);
		rdbtnSleepy.setBounds(102, 105, 82, 55);
		pnlCharacters.add(rdbtnSleepy);
		
		JRadioButton rdbtnKeener = new JRadioButton("The Keener");
		rdbtnKeener.setHorizontalTextPosition(SwingConstants.CENTER);
		rdbtnKeener.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnKeener.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnGroupCharSelect.add(rdbtnKeener);
		rdbtnKeener.setBounds(194, 105, 82, 55);
		pnlCharacters.add(rdbtnKeener);
		
		JLabel lblImageStudy = new JLabel("");
		lblImageStudy.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImageStudy.setBounds(10, 11, 82, 87);
		pnlCharacters.add(lblImageStudy);
		lblImageStudy.setIcon(gameCharacterIcons[0]);

		JLabel lblImageKeener = new JLabel("");
		lblImageKeener.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImageKeener.setBounds(194, 11, 82, 87);
		pnlCharacters.add(lblImageKeener);
		lblImageKeener.setIcon(gameCharacterIcons[4]);
		
		JLabel lblImageSleepy = new JLabel("");
		lblImageSleepy.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblImageSleepy.setBounds(102, 11, 82, 87);
		pnlCharacters.add(lblImageSleepy);
		lblImageSleepy.setIcon(gameCharacterIcons[2]);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (rdbtnStudy.isSelected()){
					myBusiness.getStudent().setStudentType(1);
					lblStudentTypeCreate.setText("The Study Master");
					txtAreaStudentDescCreate.setText("As a Study Master, You have conquered the ways of Concentration and receive a Study Bonus");
				}
				
				else if (rdbtnKeener.isSelected()){
					myBusiness.getStudent().setStudentType(5);
					lblStudentTypeCreate.setText("The Keener");
					txtAreaStudentDescCreate.setText("As a Keener, You have conquered the ways of Style and receive a Penmanship Bonus");
					}

				else if (rdbtnSleepy.isSelected()){
					myBusiness.getStudent().setStudentType(3);
					lblStudentTypeCreate.setText("The Sleepy Head");
					txtAreaStudentDescCreate.setText("As a Sleepy Head, You have conquered the ways of late nights and receive an Analytics Bonus");
					}
				
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(true);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
				
				
				lblHeadCreate.setIcon(gameCharacterIcons[myBusiness.getStudent().getStudentType()]);
				lblHatCreate.setIcon(hatIcons[myBusiness.getStudent().getHatArmour()]);
				lblTopCreate.setIcon(topIcons[myBusiness.getStudent().getTopArmour()]);
				lblBottomCreate.setIcon(bottomIcons[myBusiness.getStudent().getBottomArmour()]);
			}
		});
		btnSelect.setBounds(274, 300, 230, 25);
		pnlCharSelect.add(btnSelect);
		
		JButton btnBack_1 = new JButton("Back");
		btnBack_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlWelcome.setVisible(true);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
			}
		});
		btnBack_1.setBounds(10, 300, 230, 25);
		pnlCharSelect.add(btnBack_1);
		
		JLabel lblBackground1 = new JLabel("");
		lblBackground1.setBounds(0, 0, 514, 289);
		pnlCharSelect.add(lblBackground1);
		lblBackground1.setIcon(splashIcons[1]);
		
		pnlCharInput = new JPanel();
		pnlCharInput.setLayout(null);
		frame.getContentPane().add(pnlCharInput, "name_72591639653535");
		
		JLabel lblCharacterSetup = new JLabel("Character Creation");
		lblCharacterSetup.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterSetup.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblCharacterSetup.setBounds(10, 11, 494, 23);
		pnlCharInput.add(lblCharacterSetup);
		
		JLabel lblEnterYourDesired = new JLabel("Enter Your Desired Characters Skill Set!");
		lblEnterYourDesired.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterYourDesired.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		lblEnterYourDesired.setBounds(20, 39, 283, 14);
		pnlCharInput.add(lblEnterYourDesired);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Integer.parseInt(txtPointsAvailCreate.getText())>=0){
					myBusiness.createNewStudent(txtNameCreate.getText(), Integer.parseInt(txtStudyCreate.getText()), Integer.parseInt(txtAnalyticsCreate.getText()), Integer.parseInt(txtPenmanshipCreate.getText()));
						
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(true);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
				
				if (myBusiness.getStudent().getStudentType()==1){
					lblStudentTypeCharMenu.setText("The Study Master");
					txtAreaStudentDescCharMenu.setText("As a Study Master, You have conquered the ways of Concentration and receive a Study Bonus");
				}
				else if (myBusiness.getStudent().getStudentType()==3){
					lblStudentTypeCharMenu.setText("The Sleepy Head");
					txtAreaStudentDescCharMenu.setText("As a Sleepy Head, You have conquered the ways of late nights and receive an Analytics Bonus");			
				}
				else if (myBusiness.getStudent().getStudentType()==5){
					lblStudentTypeCharMenu.setText("The Keener");
					txtAreaStudentDescCharMenu.setText("As a Keener, You have conquered the ways of Style and receive a Penmanship Bonus");					
				}
				
				lblCharacterNameCharMenu.setText(myBusiness.getStudent().getName());
				txtStudyCharMenu.setText(String.valueOf(myBusiness.getStudent().getStudySkill()));
				txtAnalyticsCharMenu.setText(String.valueOf(myBusiness.getStudent().getAnalyticsSkill()));
				txtPenmanshipCharMenu.setText(String.valueOf(myBusiness.getStudent().getPenmanshipSkill()));
				txtBonusCharMenu.setText(String.valueOf(myBusiness.getStudent().getBonusPoints()));
				
				lblHeadCharMenu.setIcon(gameCharacterIcons[myBusiness.getStudent().getStudentType()]);
				lblHatCharMenu.setIcon(hatIcons[myBusiness.getStudent().getHatArmour()]);
				lblTopCharMenu.setIcon(topIcons[myBusiness.getStudent().getTopArmour()]);
				lblBottomCharMenu.setIcon(bottomIcons[myBusiness.getStudent().getBottomArmour()]);
				}
				else{
					JOptionPane.showMessageDialog(null, "You are attempting to create an OP student... this is not valid. Please adjust your stats.");
				}
				
				
			}
		});
		btnCreate.setBounds(273, 300, 230, 25);
		pnlCharInput.add(btnCreate);
		
		JButton button_4 = new JButton("Back");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(true);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
			}
		});
		button_4.setBounds(10, 300, 230, 25);
		pnlCharInput.add(button_4);
		
		txtNameCreate = new JTextField();
		txtNameCreate.setBounds(337, 52, 140, 20);
		pnlCharInput.add(txtNameCreate);
		txtNameCreate.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(337, 39, 140, 14);
		pnlCharInput.add(lblName);
		lblName.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		pnlSkillsCreate = new JPanel();
		pnlSkillsCreate.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlSkillsCreate.setBounds(20, 62, 283, 213);
		pnlCharInput.add(pnlSkillsCreate);
		pnlSkillsCreate.setLayout(null);
		
		JLabel lblPenmanship = new JLabel("Penmanship:");
		lblPenmanship.setBounds(10, 152, 97, 14);
		pnlSkillsCreate.add(lblPenmanship);
		lblPenmanship.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JLabel lblAnalytics = new JLabel("Analytics:");
		lblAnalytics.setBounds(10, 127, 97, 14);
		pnlSkillsCreate.add(lblAnalytics);
		lblAnalytics.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JLabel lblStudy = new JLabel("Study:");
		lblStudy.setBounds(10, 102, 97, 14);
		pnlSkillsCreate.add(lblStudy);
		lblStudy.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		
		JLabel lblSkills = new JLabel("Skills");
		lblSkills.setFont(new Font("OCR A Extended", Font.BOLD, 11));
		lblSkills.setBounds(10, 69, 72, 14);
		pnlSkillsCreate.add(lblSkills);
		
		JLabel lblPointsAvailable = new JLabel("Points Available:");
		lblPointsAvailable.setFont(new Font("OCR A Extended", Font.BOLD, 11));
		lblPointsAvailable.setBounds(10, 188, 140, 14);
		pnlSkillsCreate.add(lblPointsAvailable);
		
		txtStudyCreate = new JTextField();
		txtStudyCreate.setText("0");
		txtStudyCreate.setHorizontalAlignment(SwingConstants.TRAILING);
		txtStudyCreate.setEditable(false);
		txtStudyCreate.setBounds(245, 96, 28, 20);
		pnlSkillsCreate.add(txtStudyCreate);
		txtStudyCreate.setColumns(10);
		
		txtAnalyticsCreate = new JTextField();
		txtAnalyticsCreate.setText("0");
		txtAnalyticsCreate.setHorizontalAlignment(SwingConstants.TRAILING);
		txtAnalyticsCreate.setEditable(false);
		txtAnalyticsCreate.setColumns(10);
		txtAnalyticsCreate.setBounds(245, 121, 28, 20);
		pnlSkillsCreate.add(txtAnalyticsCreate);
		
		txtPenmanshipCreate = new JTextField();
		txtPenmanshipCreate.setText("0");
		txtPenmanshipCreate.setHorizontalAlignment(SwingConstants.TRAILING);
		txtPenmanshipCreate.setEditable(false);
		txtPenmanshipCreate.setColumns(10);
		txtPenmanshipCreate.setBounds(245, 146, 28, 20);
		pnlSkillsCreate.add(txtPenmanshipCreate);
		
		txtPointsAvailCreate = new JTextField();
		txtPointsAvailCreate.setHorizontalAlignment(SwingConstants.TRAILING);
		txtPointsAvailCreate.setText("10");
		txtPointsAvailCreate.setEditable(false);
		txtPointsAvailCreate.setColumns(10);
		txtPointsAvailCreate.setBounds(245, 182, 28, 20);
		pnlSkillsCreate.add(txtPointsAvailCreate);
		
		sldPenmanship = new JSlider();
		sldPenmanship.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				txtPenmanshipCreate.setText(String.valueOf(sldPenmanship.getValue()));
				points = 10 - Integer.parseInt(txtStudyCreate.getText()) - Integer.parseInt(txtAnalyticsCreate.getText()) - Integer.parseInt(txtPenmanshipCreate.getText());
				txtPointsAvailCreate.setText(String.valueOf(points));
			}
		});
		sldPenmanship.setValue(0);
		sldPenmanship.setMaximum(10);
		sldPenmanship.setBounds(123, 152, 112, 14);
		pnlSkillsCreate.add(sldPenmanship);
		
		sldAnalytics = new JSlider();
		sldAnalytics.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				txtAnalyticsCreate.setText(String.valueOf(sldAnalytics.getValue()));
				points = 10 - Integer.parseInt(txtStudyCreate.getText()) - Integer.parseInt(txtAnalyticsCreate.getText()) - Integer.parseInt(txtPenmanshipCreate.getText());
				txtPointsAvailCreate.setText(String.valueOf(points));
			}
		});
		sldAnalytics.setValue(0);
		sldAnalytics.setMaximum(10);
		sldAnalytics.setBounds(123, 127, 112, 14);
		pnlSkillsCreate.add(sldAnalytics);
		
		sldStudy = new JSlider();
		sldStudy.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				txtStudyCreate.setText(String.valueOf(sldStudy.getValue()));
				points = 10 - Integer.parseInt(txtStudyCreate.getText()) - Integer.parseInt(txtAnalyticsCreate.getText()) - Integer.parseInt(txtPenmanshipCreate.getText());
				txtPointsAvailCreate.setText(String.valueOf(points));
			}
		});
		sldStudy.setValue(0);
		sldStudy.setMaximum(10);
		sldStudy.setBounds(123, 102, 112, 14);
		pnlSkillsCreate.add(sldStudy);
		
		lblStudentTypeCreate = new JLabel("Selected Student");
		lblStudentTypeCreate.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		lblStudentTypeCreate.setBounds(10, 11, 263, 14);
		pnlSkillsCreate.add(lblStudentTypeCreate);
		
		txtAreaStudentDescCreate = new JTextArea();
		txtAreaStudentDescCreate.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		txtAreaStudentDescCreate.setWrapStyleWord(true);
		txtAreaStudentDescCreate.setEditable(false);
		txtAreaStudentDescCreate.setLineWrap(true);
		txtAreaStudentDescCreate.setBounds(10, 27, 263, 42);
		pnlSkillsCreate.add(txtAreaStudentDescCreate);
		
		JPanel pnlVisualCreate = new JPanel();
		pnlVisualCreate.setLayout(null);
		pnlVisualCreate.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlVisualCreate.setBounds(337, 83, 140, 192);
		pnlCharInput.add(pnlVisualCreate);
		
		lblHatCreate = new JLabel("");
		lblHatCreate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHatCreate.setBounds(10, 7, 120, 40);
		pnlVisualCreate.add(lblHatCreate);
		
		lblTopCreate = new JLabel("");
		lblTopCreate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTopCreate.setBounds(10, 101, 120, 40);
		pnlVisualCreate.add(lblTopCreate);
		
		lblHeadCreate = new JLabel("");
		lblHeadCreate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHeadCreate.setBounds(10, 54, 120, 40);
		pnlVisualCreate.add(lblHeadCreate);
		
		lblBottomCreate = new JLabel("");
		lblBottomCreate.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblBottomCreate.setBounds(10, 148, 120, 40);
		pnlVisualCreate.add(lblBottomCreate);
		
		JLabel lblBackground2 = new JLabel("");
		lblBackground2.setBounds(0, 0, 514, 289);
		pnlCharInput.add(lblBackground2);
		lblBackground2.setIcon(splashIcons[1]);
		
		pnlCharMenu = new JPanel();
		pnlCharMenu.setLayout(null);
		frame.getContentPane().add(pnlCharMenu, "name_72592974989967");
		
		JLabel lblCharactername = new JLabel("Character Menu");
		lblCharactername.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharactername.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblCharactername.setBounds(10, 11, 494, 23);
		pnlCharMenu.add(lblCharactername);
		
		JButton btnArmoury = new JButton("Locker Room");
		btnArmoury.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(true);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
				
				if (myBusiness.getStudent().getStudentType()==1){
					lblStudentTypeLocker.setText("The Study Master");
					txtAreaStudentDescLocker.setText("As a Study Master, You have conquered the ways of Concentration and receive a Study Bonus");
				}
				else if (myBusiness.getStudent().getStudentType()==3){
					lblStudentTypeLocker.setText("The Sleepy Head");
					txtAreaStudentDescLocker.setText("As a Sleepy Head, You have conquered the ways of late nights and receive an Analytics Bonus");			
				}
				else if (myBusiness.getStudent().getStudentType()==5){
					lblStudentTypeLocker.setText("The Keener");
					txtAreaStudentDescLocker.setText("As a Keener, You have conquered the ways of Style and receive a Penmanship Bonus");					
				}
				
				lblCharacterNameLocker.setText(myBusiness.getStudent().getName());
				txtStudyLocker.setText(String.valueOf(myBusiness.getStudent().getStudySkill()));
				txtAnalyticsLocker.setText(String.valueOf(myBusiness.getStudent().getAnalyticsSkill()));
				txtPenmanshipLocker.setText(String.valueOf(myBusiness.getStudent().getPenmanshipSkill()));
				txtBonusLocker.setText(String.valueOf(myBusiness.getStudent().getBonusPoints()));
				
				lblHeadLocker.setIcon(gameCharacterIcons[myBusiness.getStudent().getStudentType()]);
				lblHatLocker.setIcon(hatIcons[myBusiness.getStudent().getHatArmour()]);
				lblTopLocker.setIcon(topIcons[myBusiness.getStudent().getTopArmour()]);
				lblBottomLocker.setIcon(bottomIcons[myBusiness.getStudent().getBottomArmour()]);
			}
		});
		btnArmoury.setBounds(183, 300, 150, 25);
		pnlCharMenu.add(btnArmoury);
		
		JButton btnTesting = new JButton("Testing");
		btnTesting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(true);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
			}
		});
		btnTesting.setBounds(354, 300, 150, 25);
		pnlCharMenu.add(btnTesting);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(10, 300, 150, 25);
		pnlCharMenu.add(btnSave);
		
		lblCharacterNameCharMenu = new JLabel("");
		lblCharacterNameCharMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterNameCharMenu.setFont(new Font("OCR A Extended", Font.BOLD, 12));
		lblCharacterNameCharMenu.setBounds(337, 39, 140, 14);
		pnlCharMenu.add(lblCharacterNameCharMenu);
		
		JPanel pnlSkillsCharMenu = new JPanel();
		pnlSkillsCharMenu.setBounds(20, 62, 283, 213);
		pnlCharMenu.add(pnlSkillsCharMenu);
		pnlSkillsCharMenu.setLayout(null);
		pnlSkillsCharMenu.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		JLabel label_45 = new JLabel("Penmanship:");
		label_45.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		label_45.setBounds(10, 152, 97, 14);
		pnlSkillsCharMenu.add(label_45);
		
		JLabel label_46 = new JLabel("Analytics:");
		label_46.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		label_46.setBounds(10, 127, 97, 14);
		pnlSkillsCharMenu.add(label_46);
		
		JLabel label_47 = new JLabel("Study:");
		label_47.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		label_47.setBounds(10, 102, 97, 14);
		pnlSkillsCharMenu.add(label_47);
		
		JLabel label_48 = new JLabel("Skills");
		label_48.setFont(new Font("OCR A Extended", Font.BOLD, 11));
		label_48.setBounds(10, 69, 72, 14);
		pnlSkillsCharMenu.add(label_48);
		
		JLabel lblBonus = new JLabel("Bonus Points:");
		lblBonus.setFont(new Font("OCR A Extended", Font.BOLD, 11));
		lblBonus.setBounds(10, 188, 140, 14);
		pnlSkillsCharMenu.add(lblBonus);
		
		txtStudyCharMenu = new JTextField();
		txtStudyCharMenu.setHorizontalAlignment(SwingConstants.TRAILING);
		txtStudyCharMenu.setEditable(false);
		txtStudyCharMenu.setColumns(10);
		txtStudyCharMenu.setBounds(245, 96, 28, 20);
		pnlSkillsCharMenu.add(txtStudyCharMenu);
		
		txtAnalyticsCharMenu = new JTextField();
		txtAnalyticsCharMenu.setHorizontalAlignment(SwingConstants.TRAILING);
		txtAnalyticsCharMenu.setEditable(false);
		txtAnalyticsCharMenu.setColumns(10);
		txtAnalyticsCharMenu.setBounds(245, 121, 28, 20);
		pnlSkillsCharMenu.add(txtAnalyticsCharMenu);
		
		txtPenmanshipCharMenu = new JTextField();
		txtPenmanshipCharMenu.setHorizontalAlignment(SwingConstants.TRAILING);
		txtPenmanshipCharMenu.setEditable(false);
		txtPenmanshipCharMenu.setColumns(10);
		txtPenmanshipCharMenu.setBounds(245, 146, 28, 20);
		pnlSkillsCharMenu.add(txtPenmanshipCharMenu);
		
		txtBonusCharMenu = new JTextField();
		txtBonusCharMenu.setHorizontalAlignment(SwingConstants.TRAILING);
		txtBonusCharMenu.setEditable(false);
		txtBonusCharMenu.setColumns(10);
		txtBonusCharMenu.setBounds(245, 182, 28, 20);
		pnlSkillsCharMenu.add(txtBonusCharMenu);
		
		lblStudentTypeCharMenu = new JLabel("Selected Student");
		lblStudentTypeCharMenu.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		lblStudentTypeCharMenu.setBounds(10, 11, 263, 14);
		pnlSkillsCharMenu.add(lblStudentTypeCharMenu);
		
		txtAreaStudentDescCharMenu = new JTextArea();
		txtAreaStudentDescCharMenu.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		txtAreaStudentDescCharMenu.setLineWrap(true);
		txtAreaStudentDescCharMenu.setWrapStyleWord(true);
		txtAreaStudentDescCharMenu.setEditable(false);
		txtAreaStudentDescCharMenu.setBounds(10, 27, 263, 42);
		pnlSkillsCharMenu.add(txtAreaStudentDescCharMenu);
		
		JPanel pnlVisualCharMenu = new JPanel();
		pnlVisualCharMenu.setBounds(337, 83, 140, 192);
		pnlCharMenu.add(pnlVisualCharMenu);
		pnlVisualCharMenu.setLayout(null);
		pnlVisualCharMenu.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		
		lblHatCharMenu = new JLabel("");
		lblHatCharMenu.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHatCharMenu.setBounds(10, 7, 120, 40);
		pnlVisualCharMenu.add(lblHatCharMenu);
		
		lblTopCharMenu = new JLabel("");
		lblTopCharMenu.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTopCharMenu.setBounds(10, 101, 120, 40);
		pnlVisualCharMenu.add(lblTopCharMenu);
		
		lblHeadCharMenu = new JLabel("");
		lblHeadCharMenu.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHeadCharMenu.setBounds(10, 54, 120, 40);
		pnlVisualCharMenu.add(lblHeadCharMenu);
		
		lblBottomCharMenu = new JLabel("");
		lblBottomCharMenu.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblBottomCharMenu.setBounds(10, 148, 120, 40);
		pnlVisualCharMenu.add(lblBottomCharMenu);
		
		JLabel lblBackground3 = new JLabel("");
		lblBackground3.setBounds(0, 0, 514, 289);
		pnlCharMenu.add(lblBackground3);
		lblBackground3.setIcon(splashIcons[1]);
		
		pnlArmouryMenu = new JPanel();
		pnlArmouryMenu.setLayout(null);
		frame.getContentPane().add(pnlArmouryMenu, "name_72595002812956");
		
		JLabel lblArmoury = new JLabel("Locker Room");
		lblArmoury.setHorizontalAlignment(SwingConstants.CENTER);
		lblArmoury.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblArmoury.setBounds(10, 11, 494, 23);
		pnlArmouryMenu.add(lblArmoury);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(true);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
				
				if (myBusiness.getStudent().getStudentType()==1){
					lblStudentTypeCharMenu.setText("The Study Master");
					txtAreaStudentDescCharMenu.setText("As a Study Master, You have conquered the ways of Concentration and receive a Study Bonus");
				}
				else if (myBusiness.getStudent().getStudentType()==3){
					lblStudentTypeCharMenu.setText("The Sleepy Head");
					txtAreaStudentDescCharMenu.setText("As a Sleepy Head, You have conquered the ways of late nights and receive an Analytics Bonus");			
				}
				else if (myBusiness.getStudent().getStudentType()==5){
					lblStudentTypeCharMenu.setText("The Keener");
					txtAreaStudentDescCharMenu.setText("As a Keener, You have conquered the ways of Style and receive a Penmanship Bonus");					
				}
				
				lblCharacterNameCharMenu.setText(myBusiness.getStudent().getName());
				txtStudyCharMenu.setText(String.valueOf(myBusiness.getStudent().getStudySkill()));
				txtAnalyticsCharMenu.setText(String.valueOf(myBusiness.getStudent().getAnalyticsSkill()));
				txtPenmanshipCharMenu.setText(String.valueOf(myBusiness.getStudent().getPenmanshipSkill()));
				txtBonusCharMenu.setText(String.valueOf(myBusiness.getStudent().getBonusPoints()));
				
				lblHeadCharMenu.setIcon(gameCharacterIcons[myBusiness.getStudent().getStudentType()]);
				lblHatCharMenu.setIcon(hatIcons[myBusiness.getStudent().getHatArmour()]);
				lblTopCharMenu.setIcon(topIcons[myBusiness.getStudent().getTopArmour()]);
				lblBottomCharMenu.setIcon(bottomIcons[myBusiness.getStudent().getBottomArmour()]);
			}
		});
		btnBack.setBounds(10, 300, 115, 25);
		pnlArmouryMenu.add(btnBack);
		
		JButton btnPieces = new JButton("Head");
		btnPieces.setBounds(135, 300, 115, 25);
		pnlArmouryMenu.add(btnPieces);
		
		JButton btnChest = new JButton("Body");
		btnChest.setBounds(260, 302, 115, 25);
		pnlArmouryMenu.add(btnChest);
		
		JButton btnBottoms = new JButton("Bottoms");
		btnBottoms.setBounds(389, 302, 115, 25);
		pnlArmouryMenu.add(btnBottoms);
		
		lblCharacterNameLocker = new JLabel("Character Name");
		lblCharacterNameLocker.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterNameLocker.setFont(new Font("OCR A Extended", Font.BOLD, 12));
		lblCharacterNameLocker.setBounds(337, 39, 140, 14);
		pnlArmouryMenu.add(lblCharacterNameLocker);
		
		JPanel pnlSkillsLocker = new JPanel();
		pnlSkillsLocker.setLayout(null);
		pnlSkillsLocker.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlSkillsLocker.setBounds(20, 62, 283, 213);
		pnlArmouryMenu.add(pnlSkillsLocker);
		
		JLabel label_2 = new JLabel("Penmanship:");
		label_2.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		label_2.setBounds(10, 152, 97, 14);
		pnlSkillsLocker.add(label_2);
		
		JLabel label_49 = new JLabel("Analytics:");
		label_49.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		label_49.setBounds(10, 127, 97, 14);
		pnlSkillsLocker.add(label_49);
		
		JLabel label_52 = new JLabel("Study:");
		label_52.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		label_52.setBounds(10, 102, 97, 14);
		pnlSkillsLocker.add(label_52);
		
		JLabel label_53 = new JLabel("Skills");
		label_53.setFont(new Font("OCR A Extended", Font.BOLD, 11));
		label_53.setBounds(10, 69, 72, 14);
		pnlSkillsLocker.add(label_53);
		
		JLabel label_54 = new JLabel("Bonus Points:");
		label_54.setFont(new Font("OCR A Extended", Font.BOLD, 11));
		label_54.setBounds(10, 188, 140, 14);
		pnlSkillsLocker.add(label_54);
		
		txtStudyLocker = new JTextField();
		txtStudyLocker.setHorizontalAlignment(SwingConstants.TRAILING);
		txtStudyLocker.setEditable(false);
		txtStudyLocker.setColumns(10);
		txtStudyLocker.setBounds(245, 96, 28, 20);
		pnlSkillsLocker.add(txtStudyLocker);
		
		txtAnalyticsLocker = new JTextField();
		txtAnalyticsLocker.setHorizontalAlignment(SwingConstants.TRAILING);
		txtAnalyticsLocker.setEditable(false);
		txtAnalyticsLocker.setColumns(10);
		txtAnalyticsLocker.setBounds(245, 121, 28, 20);
		pnlSkillsLocker.add(txtAnalyticsLocker);
		
		txtPenmanshipLocker = new JTextField();
		txtPenmanshipLocker.setHorizontalAlignment(SwingConstants.TRAILING);
		txtPenmanshipLocker.setEditable(false);
		txtPenmanshipLocker.setColumns(10);
		txtPenmanshipLocker.setBounds(245, 146, 28, 20);
		pnlSkillsLocker.add(txtPenmanshipLocker);
		
		txtBonusLocker = new JTextField();
		txtBonusLocker.setHorizontalAlignment(SwingConstants.TRAILING);
		txtBonusLocker.setEditable(false);
		txtBonusLocker.setColumns(10);
		txtBonusLocker.setBounds(245, 182, 28, 20);
		pnlSkillsLocker.add(txtBonusLocker);
		
		lblStudentTypeLocker = new JLabel("Selected Student");
		lblStudentTypeLocker.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		lblStudentTypeLocker.setBounds(10, 11, 263, 14);
		pnlSkillsLocker.add(lblStudentTypeLocker);
		
		txtAreaStudentDescLocker = new JTextArea();
		txtAreaStudentDescLocker.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		txtAreaStudentDescLocker.setLineWrap(true);
		txtAreaStudentDescLocker.setWrapStyleWord(true);
		txtAreaStudentDescLocker.setBounds(10, 27, 263, 42);
		pnlSkillsLocker.add(txtAreaStudentDescLocker);
		
		JPanel pnlVisualLocker = new JPanel();
		pnlVisualLocker.setLayout(null);
		pnlVisualLocker.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlVisualLocker.setBounds(337, 83, 140, 192);
		pnlArmouryMenu.add(pnlVisualLocker);
		
		lblHatLocker = new JLabel("");
		lblHatLocker.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHatLocker.setBounds(10, 7, 120, 40);
		pnlVisualLocker.add(lblHatLocker);
		
		lblTopLocker = new JLabel("");
		lblTopLocker.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTopLocker.setBounds(10, 101, 120, 40);
		pnlVisualLocker.add(lblTopLocker);
		
		lblHeadLocker = new JLabel("");
		lblHeadLocker.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHeadLocker.setBounds(10, 54, 120, 40);
		pnlVisualLocker.add(lblHeadLocker);
		
		lblBottomLocker = new JLabel("");
		lblBottomLocker.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblBottomLocker.setBounds(10, 148, 120, 40);
		pnlVisualLocker.add(lblBottomLocker);
		
		JLabel lblBackground4 = new JLabel("");
		lblBackground4.setBounds(0, 0, 514, 289);
		pnlArmouryMenu.add(lblBackground4);
		lblBackground4.setIcon(splashIcons[1]);
		btnBottoms.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(true);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
				
				gear=2;
				btnItem1.setIcon(bottomIcons[0]);
				btnItem2.setIcon(bottomIcons[1]);
				btnItem3.setIcon(bottomIcons[2]);
				btnItem4.setIcon(bottomIcons[3]);
				
				lblCharacterNameItemSelect.setText(myBusiness.getStudent().getName());
				txtBonusItemSelection.setText(String.valueOf(myBusiness.getStudent().getBonusPoints()));

				lblHeadItemSelection.setIcon(gameCharacterIcons[myBusiness.getStudent().getStudentType()]);
				lblHatItemSelection.setIcon(hatIcons[myBusiness.getStudent().getHatArmour()]);
				lblTopItemSelection.setIcon(topIcons[myBusiness.getStudent().getTopArmour()]);
				lblBottomItemSelection.setIcon(bottomIcons[myBusiness.getStudent().getBottomArmour()]);
			}
		});
		btnChest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(true);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
				
				gear=1;
				btnItem1.setIcon(topIcons[0]);
				btnItem2.setIcon(topIcons[1]);
				btnItem3.setIcon(topIcons[2]);
				btnItem4.setIcon(topIcons[3]);
				
				lblCharacterNameItemSelect.setText(myBusiness.getStudent().getName());
				txtBonusItemSelection.setText(String.valueOf(myBusiness.getStudent().getBonusPoints()));

				lblHeadItemSelection.setIcon(gameCharacterIcons[myBusiness.getStudent().getStudentType()]);
				lblHatItemSelection.setIcon(hatIcons[myBusiness.getStudent().getHatArmour()]);
				lblTopItemSelection.setIcon(topIcons[myBusiness.getStudent().getTopArmour()]);
				lblBottomItemSelection.setIcon(bottomIcons[myBusiness.getStudent().getBottomArmour()]);
			}
		});
		
		btnPieces.addActionListener(new ActionListener() {		//armory menu head button
			public void actionPerformed(ActionEvent arg0) {
				
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(true);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
				
				gear=0;
				btnItem1.setIcon(hatIcons[0]);
				btnItem2.setIcon(hatIcons[1]);
				btnItem3.setIcon(hatIcons[2]);
				btnItem4.setIcon(hatIcons[3]);
				
				lblCharacterNameItemSelect.setText(myBusiness.getStudent().getName());
				txtBonusItemSelection.setText(String.valueOf(myBusiness.getStudent().getBonusPoints()));

				lblHeadItemSelection.setIcon(gameCharacterIcons[myBusiness.getStudent().getStudentType()]);
				lblHatItemSelection.setIcon(hatIcons[myBusiness.getStudent().getHatArmour()]);
				lblTopItemSelection.setIcon(topIcons[myBusiness.getStudent().getTopArmour()]);
				lblBottomItemSelection.setIcon(bottomIcons[myBusiness.getStudent().getBottomArmour()]);
			}
		});
		
		pnlArmoury = new JPanel();
		frame.getContentPane().add(pnlArmoury, "name_154745643287787");
		pnlArmoury.setLayout(null);
		
		JLabel lblLockerRoom = new JLabel("Locker Room");
		lblLockerRoom.setHorizontalAlignment(SwingConstants.CENTER);
		lblLockerRoom.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblLockerRoom.setBounds(10, 11, 494, 23);
		pnlArmoury.add(lblLockerRoom);
		
		JButton button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(true);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
				
				lblCharacterNameLocker.setText(myBusiness.getStudent().getName());
				txtStudyLocker.setText(String.valueOf(myBusiness.getStudent().getStudySkill()));
				txtAnalyticsLocker.setText(String.valueOf(myBusiness.getStudent().getAnalyticsSkill()));
				txtPenmanshipLocker.setText(String.valueOf(myBusiness.getStudent().getPenmanshipSkill()));
				txtBonusLocker.setText(String.valueOf(myBusiness.getStudent().getBonusPoints()));
				
				lblHeadLocker.setIcon(gameCharacterIcons[myBusiness.getStudent().getStudentType()]);
				lblHatLocker.setIcon(hatIcons[myBusiness.getStudent().getHatArmour()]);
				lblTopLocker.setIcon(topIcons[myBusiness.getStudent().getTopArmour()]);
				lblBottomLocker.setIcon(bottomIcons[myBusiness.getStudent().getBottomArmour()]);
			}
		});
		button.setBounds(10, 300, 230, 25);
		pnlArmoury.add(button);
		
		lblCharacterNameItemSelect = new JLabel("");
		lblCharacterNameItemSelect.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterNameItemSelect.setFont(new Font("OCR A Extended", Font.BOLD, 12));
		lblCharacterNameItemSelect.setBounds(337, 39, 140, 14);
		pnlArmoury.add(lblCharacterNameItemSelect);
		
		JButton btnPurchase = new JButton("Exchange");
		btnPurchase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (gear==0){
					myBusiness.getStudent().setHatArmour(selected);
					//hat
				}
				else if (gear==1){
					myBusiness.getStudent().setTopArmour(selected);
					//top
				}
				else if (gear==2){
					myBusiness.getStudent().setBottomArmour(selected);
					//bottom
				}
			}
		});
		btnPurchase.setBounds(274, 300, 230, 25);
		pnlArmoury.add(btnPurchase);
		
		JPanel pnlItemSelect = new JPanel();
		pnlItemSelect.setLayout(null);
		pnlItemSelect.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlItemSelect.setBounds(20, 62, 283, 213);
		pnlArmoury.add(pnlItemSelect);
		
		JLabel label_61 = new JLabel("Bonus Points:");
		label_61.setFont(new Font("OCR A Extended", Font.BOLD, 11));
		label_61.setBounds(10, 188, 140, 14);
		pnlItemSelect.add(label_61);
		
		txtBonusItemSelection = new JTextField();
		txtBonusItemSelection.setEditable(false);
		txtBonusItemSelection.setColumns(10);
		txtBonusItemSelection.setBounds(245, 185, 28, 20);
		pnlItemSelect.add(txtBonusItemSelection);
		
		JLabel lblSelectedItem = new JLabel("Selected Item");
		lblSelectedItem.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		lblSelectedItem.setBounds(10, 11, 263, 14);
		pnlItemSelect.add(lblSelectedItem);
		
		btnItem1 = new JButton("");
		btnItem1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selected=0;
				if (gear==0){
					lblHatItemSelection.setIcon(hatIcons[0]);
				}
				else if (gear==1){
					lblTopItemSelection.setIcon(topIcons[0]);
				}
				else if (gear==2){
					lblBottomItemSelection.setIcon(bottomIcons[0]);
				}
			}
		});
		btnItem1.setBounds(15, 85, 120, 40);
		pnlItemSelect.add(btnItem1);
		
		btnItem2 = new JButton("");
		btnItem2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected=1;
				if (gear==0){
					lblHatItemSelection.setIcon(hatIcons[1]);
				}
				else if (gear==1){
					lblTopItemSelection.setIcon(topIcons[1]);
				}
				else if (gear==2){
					lblBottomItemSelection.setIcon(bottomIcons[1]);
				}
			}
		});
		btnItem2.setBounds(148, 85, 120, 40);
		pnlItemSelect.add(btnItem2);
		
		btnItem3 = new JButton("");
		btnItem3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected=2;
				if (gear==0){
					lblHatItemSelection.setIcon(hatIcons[2]);
				}
				else if (gear==1){
					lblTopItemSelection.setIcon(topIcons[2]);
				}
				else if (gear==2){
					lblBottomItemSelection.setIcon(bottomIcons[2]);
				}
			}
		});
		btnItem3.setBounds(15, 137, 120, 40);
		pnlItemSelect.add(btnItem3);
		
		btnItem4 = new JButton("");
		btnItem4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected=3;
				if (gear==0){
					lblHatItemSelection.setIcon(hatIcons[3]);
				}
				else if (gear==1){
					lblTopItemSelection.setIcon(topIcons[3]);
				}
				else if (gear==2){
					lblBottomItemSelection.setIcon(bottomIcons[3]);
				}
			}
		});
		btnItem4.setBounds(148, 137, 120, 40);
		pnlItemSelect.add(btnItem4);
		
		JTextArea txtAreaItemDescItemSelect = new JTextArea();
		txtAreaItemDescItemSelect.setWrapStyleWord(true);
		txtAreaItemDescItemSelect.setLineWrap(true);
		txtAreaItemDescItemSelect.setFont(new Font("OCR A Extended", Font.PLAIN, 11));
		txtAreaItemDescItemSelect.setBounds(10, 27, 263, 42);
		pnlItemSelect.add(txtAreaItemDescItemSelect);
		
		JPanel pnlVisualItemSelection = new JPanel();
		pnlVisualItemSelection.setLayout(null);
		pnlVisualItemSelection.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlVisualItemSelection.setBounds(337, 83, 140, 192);
		pnlArmoury.add(pnlVisualItemSelection);
		
		lblHatItemSelection = new JLabel("");
		lblHatItemSelection.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHatItemSelection.setBounds(10, 7, 120, 40);
		pnlVisualItemSelection.add(lblHatItemSelection);
		
		lblTopItemSelection = new JLabel("");
		lblTopItemSelection.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTopItemSelection.setBounds(10, 101, 120, 40);
		pnlVisualItemSelection.add(lblTopItemSelection);
		
		lblHeadItemSelection = new JLabel("");
		lblHeadItemSelection.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHeadItemSelection.setBounds(10, 54, 120, 40);
		pnlVisualItemSelection.add(lblHeadItemSelection);
		
		lblBottomItemSelection = new JLabel("");
		lblBottomItemSelection.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblBottomItemSelection.setBounds(10, 148, 120, 40);
		pnlVisualItemSelection.add(lblBottomItemSelection);
		
		JLabel lblBackground5 = new JLabel("");
		lblBackground5.setBounds(0, 0, 514, 289);
		pnlArmoury.add(lblBackground5);
		lblBackground5.setIcon(splashIcons[1]);
		
		pnlBattleIntro = new JPanel();
		pnlBattleIntro.setLayout(null);
		frame.getContentPane().add(pnlBattleIntro, "name_72673969675751");
		
		JLabel lblRoundNumberBIntro = new JLabel("#");
		lblRoundNumberBIntro.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoundNumberBIntro.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblRoundNumberBIntro.setBounds(290, 11, 51, 23);
		pnlBattleIntro.add(lblRoundNumberBIntro);
		
		JLabel lblRound = new JLabel("Round:");
		lblRound.setHorizontalAlignment(SwingConstants.CENTER);
		lblRound.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblRound.setBounds(10, 11, 455, 23);
		pnlBattleIntro.add(lblRound);
		
		JLabel lblCharacterNameBIntro = new JLabel("Character Name");
		lblCharacterNameBIntro.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterNameBIntro.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		lblCharacterNameBIntro.setBounds(337, 39, 140, 14);
		pnlBattleIntro.add(lblCharacterNameBIntro);
		
		JLabel lblTestingMethodBIntro = new JLabel("Testing Method");
		lblTestingMethodBIntro.setHorizontalAlignment(SwingConstants.CENTER);
		lblTestingMethodBIntro.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		lblTestingMethodBIntro.setBounds(35, 39, 140, 14);
		pnlBattleIntro.add(lblTestingMethodBIntro);
		
		JLabel lblVs = new JLabel("VS.");
		lblVs.setHorizontalAlignment(SwingConstants.CENTER);
		lblVs.setFont(new Font("Showcard Gothic", Font.PLAIN, 35));
		lblVs.setBounds(185, 137, 109, 64);
		pnlBattleIntro.add(lblVs);
		
		JButton btnWrite = new JButton("Write!");
		btnWrite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(true);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
			}
		});
		btnWrite.setBounds(10, 300, 494, 25);
		pnlBattleIntro.add(btnWrite);
		
		JPanel pnlVisualBIntro = new JPanel();
		pnlVisualBIntro.setLayout(null);
		pnlVisualBIntro.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlVisualBIntro.setBounds(337, 83, 140, 192);
		pnlBattleIntro.add(pnlVisualBIntro);
		
		JLabel lblHatBIntro = new JLabel("");
		lblHatBIntro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHatBIntro.setBounds(10, 7, 120, 40);
		pnlVisualBIntro.add(lblHatBIntro);
		
		JLabel lblTopBIntro = new JLabel("");
		lblTopBIntro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTopBIntro.setBounds(10, 101, 120, 40);
		pnlVisualBIntro.add(lblTopBIntro);
		
		JLabel lblHeadBIntro = new JLabel("");
		lblHeadBIntro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHeadBIntro.setBounds(10, 54, 120, 40);
		pnlVisualBIntro.add(lblHeadBIntro);
		
		JLabel lblBottomBIntro = new JLabel("");
		lblBottomBIntro.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblBottomBIntro.setBounds(10, 148, 120, 40);
		pnlVisualBIntro.add(lblBottomBIntro);
		
		JLabel lblBackground6 = new JLabel("");
		lblBackground6.setBounds(0, 0, 514, 289);
		pnlBattleIntro.add(lblBackground6);
		lblBackground6.setIcon(splashIcons[1]);
		
		pnlBattleScreen = new JPanel();
		pnlBattleScreen.setLayout(null);
		frame.getContentPane().add(pnlBattleScreen, "name_72676374664061");
		
		JPanel panel_27 = new JPanel();
		panel_27.setLayout(null);
		panel_27.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_27.setBounds(399, 45, 100, 100);
		pnlBattleScreen.add(panel_27);
		
		JLabel label_17 = new JLabel("");
		label_17.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		label_17.setBounds(5, 5, 90, 90);
		panel_27.add(label_17);
		
		JLabel label_6 = new JLabel("Testing Method");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		label_6.setBounds(389, 11, 115, 14);
		pnlBattleScreen.add(label_6);
		
		JLabel lblCharacterNameBattle = new JLabel("Character Name");
		lblCharacterNameBattle.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterNameBattle.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		lblCharacterNameBattle.setBounds(10, 11, 115, 14);
		pnlBattleScreen.add(lblCharacterNameBattle);
		
		JPanel pnlVisualBattle = new JPanel();
		pnlVisualBattle.setLayout(null);
		pnlVisualBattle.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlVisualBattle.setBounds(20, 45, 70, 96);
		pnlBattleScreen.add(pnlVisualBattle);
		
		JLabel lblHatBattle = new JLabel("");
		lblHatBattle.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHatBattle.setBounds(5, 5, 60, 20);
		pnlVisualBattle.add(lblHatBattle);
		
		JLabel lblTopBattle = new JLabel("");
		lblTopBattle.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTopBattle.setBounds(5, 50, 60, 20);
		pnlVisualBattle.add(lblTopBattle);
		
		JLabel lblHeadBattle = new JLabel("");
		lblHeadBattle.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHeadBattle.setBounds(5, 27, 60, 20);
		pnlVisualBattle.add(lblHeadBattle);
		
		JLabel lblBottomBattle = new JLabel("");
		lblBottomBattle.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblBottomBattle.setBounds(5, 73, 60, 20);
		pnlVisualBattle.add(lblBottomBattle);
		
		JTextArea txtareaBattleAction = new JTextArea();
		txtareaBattleAction.setBounds(100, 45, 289, 228);
		pnlBattleScreen.add(txtareaBattleAction);
		
		JProgressBar progbarStudentBattle = new JProgressBar();
		progbarStudentBattle.setBackground(Color.RED);
		progbarStudentBattle.setForeground(Color.GREEN);
		progbarStudentBattle.setValue(100);
		progbarStudentBattle.setBounds(20, 26, 175, 14);
		pnlBattleScreen.add(progbarStudentBattle);
		
		JProgressBar progbarExamBattle = new JProgressBar();
		progbarExamBattle.setBackground(Color.RED);
		progbarExamBattle.setForeground(Color.GREEN);
		progbarExamBattle.setValue(100);
		progbarExamBattle.setBounds(322, 26, 175, 14);
		pnlBattleScreen.add(progbarExamBattle);
		
		JLabel label_8 = new JLabel("Round:");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		label_8.setBounds(185, 5, 108, 23);
		pnlBattleScreen.add(label_8);
		
		JLabel lblRoundNumberBattle = new JLabel("#");
		lblRoundNumberBattle.setHorizontalAlignment(SwingConstants.CENTER);
		lblRoundNumberBattle.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblRoundNumberBattle.setBounds(286, 5, 40, 23);
		pnlBattleScreen.add(lblRoundNumberBattle);
		
		JButton btnNext = new JButton("Continue");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(true);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
			}
		});
		btnNext.setBounds(274, 300, 230, 25);
		pnlBattleScreen.add(btnNext);
		
		JLabel lblBackground7 = new JLabel("");
		lblBackground7.setBounds(0, 0, 514, 289);
		pnlBattleScreen.add(lblBackground7);
		lblBackground7.setIcon(splashIcons[1]);
		
		JButton btnWriteExamination = new JButton("Write Examination");
		btnWriteExamination.setBounds(10, 301, 230, 25);
		pnlBattleScreen.add(btnWriteExamination);
		
		pnlWinner = new JPanel();
		pnlWinner.setLayout(null);
		frame.getContentPane().add(pnlWinner, "name_72679669325588");
		
		JLabel lblWinner = new JLabel("Winner!");
		lblWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblWinner.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblWinner.setBounds(10, 11, 494, 23);
		pnlWinner.add(lblWinner);
		
		JLabel lblBonusReceivedWinner = new JLabel("Bonus Points Received:");
		lblBonusReceivedWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblBonusReceivedWinner.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		lblBonusReceivedWinner.setBounds(126, 272, 179, 14);
		pnlWinner.add(lblBonusReceivedWinner);
		
		txtBonusPointsWinner = new JTextField();
		txtBonusPointsWinner.setBounds(303, 269, 32, 20);
		pnlWinner.add(txtBonusPointsWinner);
		txtBonusPointsWinner.setColumns(10);
		
		JButton btnContinue_1 = new JButton("Continue");
		btnContinue_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(true);
				pnlCredits.setVisible(false);
			}
		});
		btnContinue_1.setBounds(10, 300, 494, 25);
		pnlWinner.add(btnContinue_1);
		
		JPanel pnlVisualWinner = new JPanel();
		pnlVisualWinner.setLayout(null);
		pnlVisualWinner.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlVisualWinner.setBounds(183, 58, 140, 192);
		pnlWinner.add(pnlVisualWinner);
		
		JLabel lblHatWinner = new JLabel("");
		lblHatWinner.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHatWinner.setBounds(10, 7, 120, 40);
		pnlVisualWinner.add(lblHatWinner);
		
		JLabel lblTopWinner = new JLabel("");
		lblTopWinner.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTopWinner.setBounds(10, 101, 120, 40);
		pnlVisualWinner.add(lblTopWinner);
		
		JLabel lblHeadWinner = new JLabel("");
		lblHeadWinner.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHeadWinner.setBounds(10, 54, 120, 40);
		pnlVisualWinner.add(lblHeadWinner);
		
		JLabel lblBottomWinner = new JLabel("");
		lblBottomWinner.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblBottomWinner.setBounds(10, 148, 120, 40);
		pnlVisualWinner.add(lblBottomWinner);
		
		JLabel lblCharacterNameWinner = new JLabel("Character Name");
		lblCharacterNameWinner.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterNameWinner.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		lblCharacterNameWinner.setBounds(183, 44, 140, 14);
		pnlWinner.add(lblCharacterNameWinner);
		
		JLabel lblBackground8 = new JLabel("");
		lblBackground8.setBounds(0, 0, 514, 289);
		pnlWinner.add(lblBackground8);
		lblBackground8.setIcon(splashIcons[1]);
		
		pnlGameOver = new JPanel();
		pnlGameOver.setLayout(null);
		frame.getContentPane().add(pnlGameOver, "name_72731579805083");
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlWelcome.setVisible(false);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(true);
			}
		});
		btnContinue.setBounds(10, 300, 494, 25);
		pnlGameOver.add(btnContinue);
		
		JLabel lblCongratulations = new JLabel("Congratulations!");
		lblCongratulations.setHorizontalAlignment(SwingConstants.CENTER);
		lblCongratulations.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblCongratulations.setBounds(10, 11, 494, 23);
		pnlGameOver.add(lblCongratulations);
		
		JLabel lblYouObtainedYour = new JLabel("You Obtained Your Diploma!");
		lblYouObtainedYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblYouObtainedYour.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblYouObtainedYour.setBounds(74, 264, 363, 23);
		pnlGameOver.add(lblYouObtainedYour);
		
		JLabel lblCharacterNameDiploma = new JLabel("Character Name");
		lblCharacterNameDiploma.setHorizontalAlignment(SwingConstants.CENTER);
		lblCharacterNameDiploma.setFont(new Font("OCR A Extended", Font.PLAIN, 12));
		lblCharacterNameDiploma.setBounds(183, 44, 140, 14);
		pnlGameOver.add(lblCharacterNameDiploma);
		
		JPanel pnlVisualDiploma = new JPanel();
		pnlVisualDiploma.setLayout(null);
		pnlVisualDiploma.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		pnlVisualDiploma.setBounds(183, 58, 140, 192);
		pnlGameOver.add(pnlVisualDiploma);
		
		JLabel lblHatDiploma = new JLabel("");
		lblHatDiploma.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHatDiploma.setBounds(10, 7, 120, 40);
		pnlVisualDiploma.add(lblHatDiploma);
		
		JLabel lblTopDiploma = new JLabel("");
		lblTopDiploma.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblTopDiploma.setBounds(10, 101, 120, 40);
		pnlVisualDiploma.add(lblTopDiploma);
		
		JLabel lblHeadDiploma = new JLabel("");
		lblHeadDiploma.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblHeadDiploma.setBounds(10, 54, 120, 40);
		pnlVisualDiploma.add(lblHeadDiploma);
		
		JLabel lblBottomDiploma = new JLabel("");
		lblBottomDiploma.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		lblBottomDiploma.setBounds(10, 148, 120, 40);
		pnlVisualDiploma.add(lblBottomDiploma);
		
		JLabel lblBackground9 = new JLabel("");
		lblBackground9.setBounds(0, 0, 514, 289);
		pnlGameOver.add(lblBackground9);
		lblBackground9.setIcon(splashIcons[1]);
		
		pnlCredits = new JPanel();
		pnlCredits.setLayout(null);
		frame.getContentPane().add(pnlCredits, "name_72733813654904");
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pnlWelcome.setVisible(true);
				pnlCharSelect.setVisible(false);
				pnlCharInput.setVisible(false);
				pnlCharMenu.setVisible(false);
				pnlArmouryMenu.setVisible(false);
				pnlArmoury.setVisible(false);
				pnlBattleIntro.setVisible(false);
				pnlBattleScreen.setVisible(false);
				pnlWinner.setVisible(false);
				pnlGameOver.setVisible(false);
				pnlCredits.setVisible(false);
			}
		});
		btnMainMenu.setBounds(10, 300, 494, 25);
		pnlCredits.add(btnMainMenu);
		
		JLabel label_13 = new JLabel("A SquiggsNet Production.");
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setFont(new Font("OCR A Extended", Font.PLAIN, 20));
		label_13.setBounds(10, 123, 494, 30);
		pnlCredits.add(label_13);
		
		JLabel lblCredits = new JLabel("Credits");
		lblCredits.setHorizontalAlignment(SwingConstants.CENTER);
		lblCredits.setFont(new Font("Showcard Gothic", Font.PLAIN, 20));
		lblCredits.setBounds(10, 11, 494, 23);
		pnlCredits.add(lblCredits);
		
		JLabel lblBackground10 = new JLabel("");
		lblBackground10.setBounds(0, 0, 514, 289);
		pnlCredits.add(lblBackground10);
		lblBackground10.setIcon(splashIcons[1]);
	
	}
}
