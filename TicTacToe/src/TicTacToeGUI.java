import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TicTacToeGUI {

	private JFrame frame;
	
	
// button
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;

//	counter
	private int xCount1=0;
	private int oCount1=0;
	
// game
	private String startGame="X";
	private int b1=-1;
	private int b2=-1;
	private int b3=-1;
	private int b4=-1;
	private int b5=-1;
	private int b6=-1;
	private int b7=-1;
	private int b8=-1;
	private int b9=-1;
	

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeGUI window = new TicTacToeGUI();
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
	public TicTacToeGUI() {
		initialize();
	}
	
	
// clearBtn
  private void clearBtn() {
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);	
	}
	
	private void winnerGame(JLabel x, JLabel o) {
		
// winner X	
		if(b1==1 && b2==1 && b3==1)
		{
			xCount1++; 
			x.setText(String.valueOf(xCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player X winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			
		
		}
		else if(b4==1 && b5==1 && b6==1)
		{
			xCount1++; 
			x.setText(String.valueOf(xCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player X winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b7==1 && b8==1 && b9==1)
		{
			xCount1++; 
			x.setText(String.valueOf(xCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player X winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b1==1 && b4==1 && b7==1)
		{
			xCount1++; 
			x.setText(String.valueOf(xCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player X winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b2==1 && b5==1 && b8==1)
		{
			xCount1++; 
			x.setText(String.valueOf(xCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player X winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b3==1 && b6==1 && b9==1)
		{
			xCount1++; 
			x.setText(String.valueOf(xCount1));
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player X winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b1==1 && b5==1 && b9==1)
		{
			xCount1++; 
			x.setText(String.valueOf(xCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player X winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b3==1 && b5==1 && b7==1)
		{
			xCount1++; 
			x.setText(String.valueOf(xCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player X winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		

// winner O	
		
		if(b1==0 && b2==0 && b3==0)
		{
			oCount1++; 
			o.setText(String.valueOf(oCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player O winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b4==0 && b5==0 && b6==0)
		{
			oCount1++; 
			o.setText(String.valueOf(oCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player O winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b7==0 && b8==0 && b9==0)
		{
			oCount1++; 
			o.setText(String.valueOf(oCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player O winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b1==0 && b4==0 && b7==0)
		{
			oCount1++; 
			o.setText(String.valueOf(oCount1));
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player O winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b2==0 && b5==0 && b8==0)
		{
			oCount1++; 
			o.setText(String.valueOf(oCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player O winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b3==0 && b6==0 && b9==0)
		{
			oCount1++; 
			o.setText(String.valueOf(oCount1));
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player O winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b1==0 && b5==0 && b9==0)
		{
			oCount1++; 
			o.setText(String.valueOf(oCount1));	
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player O winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b3==0 && b5==0 && b7==0)
		{
			oCount1++; 
			o.setText(String.valueOf(oCount1));
			clearBtn();
			JOptionPane.showMessageDialog(frame, "player O winner","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		
	}
	
	
	private void choosePlayer() {
		if(startGame.equalsIgnoreCase("X"))
		{
			startGame="O";
		}
		else {
			startGame="X";
		}
	}
	
	
	
	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
//		main panel
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
//		panelLabel
		JPanel panelLabel = new JPanel();
		panelLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelLabel.setBounds(0, 0, 586, 61);
		frame.getContentPane().add(panelLabel);
		panelLabel.setLayout(null);
		
		JLabel MainLabel = new JLabel("START GAME");
		MainLabel.setForeground(Color.GREEN);
		MainLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		MainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		MainLabel.setBounds(113, 10, 391, 41);
		panelLabel.add(MainLabel);
		
//		panelScore
	    JPanel panelScore = new JPanel();
		panelScore.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panelScore.setBounds(335, 58, 251, 275);
		frame.getContentPane().add(panelScore);
		panelScore.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("SCORE");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(67, 0, 110, 36);
		panelScore.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WINNER X");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(32, 69, 110, 36);
		panelScore.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("WINNER O");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(32, 136, 110, 36);
		panelScore.add(lblNewLabel_2_1);
		
		JLabel xCount = new JLabel("0");
		xCount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		xCount.setHorizontalAlignment(SwingConstants.CENTER);
		xCount.setBounds(167, 77, 45, 21);
		panelScore.add(xCount);
		
		JLabel oCount = new JLabel("0");
		oCount.setHorizontalAlignment(SwingConstants.CENTER);
		oCount.setFont(new Font("Tahoma", Font.PLAIN, 20));
		oCount.setBounds(167, 144, 45, 21);
		panelScore.add(oCount);
		
//      new game
		JButton btnNewButton = new JButton("new game");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// game setting new game
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				b1=-1;
				b2=-1;
				b3=-1;
				b4=-1;
				b5=-1;
				b6=-1;
				b7=-1;
				b8=-1;
				b9=-1;
				
//				enable button
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(10, 208, 126, 36);
		panelScore.add(btnNewButton);
		
//		reset
		JButton btnReset = new JButton("reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
// game setting reset
				btn1.setText(null);
				btn2.setText(null);
				btn3.setText(null);
				btn4.setText(null);
				btn5.setText(null);
				btn6.setText(null);
				btn7.setText(null);
				btn8.setText(null);
				btn9.setText(null);
				b1=-1;
				b2=-1;
				b3=-1;
				b4=-1;
				b5=-1;
				b6=-1;
				b7=-1;
				b8=-1;
				b9=-1;
							
//				counter
				xCount1=0;
				oCount1=0;
				xCount.setText(xCount1 + ""); //string
				oCount.setText(oCount1 + ""); //string
				
//				enable button
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				
				
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnReset.setBounds(138, 208, 103, 36);
		panelScore.add(btnReset);
		
//		panelScore
		JPanel panelGame = new JPanel();
		panelGame.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		panelGame.setBounds(20, 94, 305, 240);
		frame.getContentPane().add(panelGame);
		panelGame.setLayout(new GridLayout(3, 3, 0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGame.add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
//		btn1
//		JButton btn1 = new JButton("");
		btn1 = new JButton("");
		btn1.setForeground(Color.BLACK);
		btn1.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
//					X
					b1=1;
				}
				else {
//					Y
					b1=0;
					
				}
				choosePlayer();
				winnerGame(xCount,oCount);
				btn1.setEnabled(false);
				
			}
		});
		panel_1.add(btn1, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGame.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
//		btn2
//		JButton btn2 = new JButton("");
		btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b2=1;
				}
				else {
					b2=0;		
				}
				choosePlayer();
				winnerGame(xCount,oCount);
				btn2.setEnabled(false);
			}
		});
		panel_2.add(btn2, BorderLayout.CENTER);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGame.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
//		btn3
//		JButton btn3 = new JButton("");
		btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b3=1;
				}
				else {
					b3=0;		
				}
				choosePlayer();
				winnerGame(xCount,oCount);
				btn3.setEnabled(false);
			}
		});
		panel_3.add(btn3, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGame.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
//		btn4
//		JButton btn4 = new JButton("");
		btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b4=1;
				}
				else {
					b4=0;		
				}
				choosePlayer();
				winnerGame(xCount,oCount);
				btn4.setEnabled(false);
			}
		});
		panel_4.add(btn4, BorderLayout.CENTER);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGame.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
//		btn5
//		btn5 = new JButton("");
		btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b5=1;
				}
				else {
					b5=0;		
				}
				choosePlayer();
				winnerGame(xCount,oCount);
				btn5.setEnabled(false);
			}
		});
		panel_5.add(btn5, BorderLayout.CENTER);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGame.add(panel_6);
		panel_6.setLayout(new BorderLayout(0, 0));
		
//		btn6
//		JButton btn6 = new JButton("");
		btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b6=1;
				}
				else {
					b6=0;		
				}
				choosePlayer();
				winnerGame(xCount,oCount);
				btn6.setEnabled(false);
			}
		});
		panel_6.add(btn6, BorderLayout.CENTER);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGame.add(panel_7);
		panel_7.setLayout(new BorderLayout(0, 0));
		
//		btn7
//		JButton btn7 = new JButton("");
		btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b7=1;
				}
				else {
					b7=0;		
				}
				choosePlayer();
				winnerGame(xCount,oCount);
				btn7.setEnabled(false);
				
			}
		});
		panel_7.add(btn7, BorderLayout.CENTER);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGame.add(panel_8);
		panel_8.setLayout(new BorderLayout(0, 0));
		
//		btn8
//		JButton btn8 = new JButton("");
		btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b8=1;
				}
				else {
					b8=0;		
				}
				choosePlayer();
				winnerGame(xCount,oCount);
				btn8.setEnabled(false);
			}
		});
		panel_8.add(btn8, BorderLayout.CENTER);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelGame.add(panel_9);
		panel_9.setLayout(new BorderLayout(0, 0));
		
//		btn9
//		JButton btn9 = new JButton("");
		btn9 = new JButton("");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 60));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setText(startGame);
				if(startGame.equalsIgnoreCase("X"))
				{
					b9=1;
				}
				else {
					b9=0;		
				}
				choosePlayer();
				winnerGame(xCount,oCount);
				btn9.setEnabled(false);
			}
		});
		panel_9.add(btn9, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 58, 338, 39);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1_1 = new JLabel("GAME");
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.GREEN);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
	}
}


