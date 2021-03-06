import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.text.DefaultCaret;


public class AnimalUI {
  public AnimalUI() {
		final JFrame frameMain = new JFrame("Animal Wars");
		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		frameMain.setSize(400, 750);
		frameMain.setVisible(true);
		frameMain.setLayout(layout);
		frameMain.addWindowListener(new WindowAdapter(){
			 public void windowClosing(WindowEvent e){
				 System.exit(0);
			 }
		});

		//Player1 label
		JLabel p1Label = new JLabel("Player 1", SwingConstants.CENTER);
		c.gridx=0;
		c.gridy=0;
		c.fill = GridBagConstraints.HORIZONTAL;
		frameMain.add(p1Label, c);

		//Player1 move 1 button
		JButton p1Move1Button = new JButton("1");
		p1Move1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 0;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(p1Move1Button, c);

		//Player1 move 2 button
		JButton p1Move2Button = new JButton("2");
		p1Move2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 0;
		c.gridy = 2;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(p1Move2Button, c);	

		//Player1 move 3 button
		JButton p1Move3Button = new JButton("3");
		p1Move3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 0;
		c.gridy = 3;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(p1Move3Button, c);

		//Player1 move 4 button
		JButton p1Move4Button = new JButton("4");
		p1Move4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 0;
		c.gridy = 4;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(p1Move4Button, c);

		//Winner label and text field
		JLabel winnerLabel = new JLabel("Winner", SwingConstants.CENTER);
		c.gridx=1;
		c.gridy=1;
		frameMain.add(winnerLabel, c);
		final JTextField winnerTextField = new JTextField();
		winnerTextField.setEditable(false);
		c.gridx=1;
		c.gridy=2;
		frameMain.add(winnerTextField, c);

		//Compute winner button
		JButton winnerButton = new JButton("Enter");
		winnerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 1;
		c.gridy = 3;
		c.fill = GridBagConstraints.CENTER;
		frameMain.add(winnerButton, c);

		//Player2 label
		JLabel p2Label = new JLabel("Player 2", SwingConstants.CENTER);
		c.gridx=2;
		c.gridy=0;
		c.fill = GridBagConstraints.HORIZONTAL;
		frameMain.add(p2Label, c);

		//Player1 move 1 button
		JButton p2Move1Button = new JButton("1");
		p2Move1Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 2;
		c.gridy = 1;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(p2Move1Button, c);

		//Player1 move 2 button
		JButton p2Move2Button = new JButton("2");
		p2Move2Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 2;
		c.gridy = 2;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(p2Move2Button, c);

		//Player1 move 3 button
		JButton p2Move3Button = new JButton("3");
		p2Move3Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 2;
		c.gridy = 3;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(p2Move3Button, c);

		//Player1 move 4 button
		JButton p2Move4Button = new JButton("4");
		p2Move4Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 2;
		c.gridy = 4;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(p2Move4Button, c);

		//Player Animal selected textfield
		final JTextField player1SelectedTextField = new JTextField();
		player1SelectedTextField.setEditable(false);
		c.gridx = 0;
		c.gridy = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		frameMain.add(player1SelectedTextField, c);
		final JTextField player2SelectedTextField = new JTextField();
		player2SelectedTextField.setEditable(false);
		c.gridx = 2;
		c.gridy = 5;
		c.fill = GridBagConstraints.HORIZONTAL;
		frameMain.add(player2SelectedTextField, c);

		//Animal selected label
		JLabel selectedLabel = new JLabel("<=    Selected    =>", SwingConstants.CENTER);
		c.gridx=1;
		c.gridy=5;
		frameMain.add(selectedLabel, c);

		//Player Animal selection radio button
		ButtonGroup playerRadioButtonGroup = new ButtonGroup();
		JRadioButton player1RadioButton = new JRadioButton("Player 1");
		JRadioButton player2RadioButton = new JRadioButton("Player 2");
		ActionListener player1RadioListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbstractButton player1RadioButton = (AbstractButton) e.getSource();

			}
		};
		ActionListener player2RadioListener = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AbstractButton player2RadioButton = (AbstractButton) e.getSource();

			}
		};
		c.gridx = 0;
		c.gridy = 6;
		c.fill = GridBagConstraints.HORIZONTAL;
		frameMain.add(player1RadioButton, c);
		playerRadioButtonGroup.add(player1RadioButton);
		c.gridx = 2;
		c.gridy = 6;
		c.fill = GridBagConstraints.HORIZONTAL;
		frameMain.add(player2RadioButton, c);
		playerRadioButtonGroup.add(player2RadioButton);

		//Combat Log Label
		JLabel combatLogLabel = new JLabel("Combat Log", SwingConstants.CENTER);
		c.gridx=1;
		c.gridy=6;
		frameMain.add(combatLogLabel, c);

		//Combat Log
		JTextArea combatLog = new JTextArea(10,10);
		combatLog.setEditable(false);
		combatLog.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.BLACK));
		DefaultCaret caret = (DefaultCaret) combatLog.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
		c.gridx=1;
		c.gridy=7;
		frameMain.add(combatLog, c);

		//Player 1 Info
		JTextArea player1Info = new JTextArea(10,5);
		player1Info.setEditable(false);
		player1Info.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
		c.gridx=0;
		c.gridy=7;
		frameMain.add(player1Info, c);

		//Player 2 Info
		JTextArea player2Info = new JTextArea(10,5);
		player2Info.setEditable(false);
		player2Info.setBorder(BorderFactory.createMatteBorder(2, 2, 2, 2, Color.RED));
		c.gridx=2;
		c.gridy=7;
		frameMain.add(player2Info, c);

		//Animal Label
		JLabel pokemonLabel = new JLabel("Animal", SwingConstants.CENTER);
		c.gridx=1;
		c.gridy=8;
		frameMain.add(pokemonLabel, c);

		// --- LIST OF POKEMON ---

		//Animal Placeholder Button
		JButton pokemonButton1 = new JButton("placeholder1");
		pokemonButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 0;
		c.gridy = 9;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(pokemonButton1, c);

		//Animal Placeholder Button
		JButton pokemonButton2 = new JButton("placeholder2");
		pokemonButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 1;
		c.gridy = 9;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(pokemonButton2, c);

		//Animal Placeholder Button
		JButton pokemonButton3 = new JButton("placeholder3");
		pokemonButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 2;
		c.gridy = 9;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(pokemonButton3, c);

		//Animal Placeholder Button
		JButton pokemonButton4 = new JButton("placeholder4");
		pokemonButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 0;
		c.gridy = 10;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(pokemonButton4, c);

		//Animal Placeholder Button
		JButton pokemonButton5 = new JButton("placeholder5");
		pokemonButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 1;
		c.gridy = 10;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(pokemonButton5, c);

		//Animal Placeholder Button
		JButton pokemonButton6 = new JButton("placeholder6");
		pokemonButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 2;
		c.gridy = 10;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(pokemonButton6, c);

		//Animal Placeholder Button
		JButton pokemonButton7 = new JButton("placeholder7");
		pokemonButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 0;
		c.gridy = 11;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(pokemonButton7, c);

		//Animal Placeholder Button
		JButton pokemonButton8 = new JButton("placeholder8");
		pokemonButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 1;
		c.gridy = 11;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(pokemonButton8, c);

		//Animal Placeholder Button
		JButton pokemonButton9 = new JButton("placeholder9");
		pokemonButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		c.gridx = 2;
		c.gridy = 11;
		c.fill = GridBagConstraints.HORIZONTAL; 
		frameMain.add(pokemonButton9, c);
	}
}