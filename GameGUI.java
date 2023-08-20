import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class GameGUI{
	
	
	//setting up the frame,Labels, score counters,integers and string  
	
	
	private JFrame frame;
	private JLabel xCount;
	private JLabel oCount;
	private int xCount1=0;
	private int oCount1=0;
	private int b1 =10;
	private int b2 =10;
	private int b3 =10;
	private int b4 =10;
	private int b5 =10;
	private int b6 =10;
	private int b7 =10;
	private int b8 =10;
	private int b9 =10;
	private int i=0;
	private String startGame;
	
	private void setGamestate() {
		//string start game is equal to choosePlayer which is in different class
		this.startGame = choosePlayer.choosePlayer(this.startGame);
}
	

	public GameGUI(String start) {
			
		
	
	this.startGame = start;
	//frame is been setup for Game body
	frame = new JFrame();
	//frame boundaries 
	frame.setBounds(100, 100, 800, 600);
	//exit Function is created
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//"TicTacToe", title is setup
    frame.setTitle("TicTacToe");
    //retrieves the content pane layer
	frame.getContentPane().setLayout(new BorderLayout(0, 0));
// a container that can store a group of components
	JPanel panel = new JPanel();
	panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	frame.getContentPane().add(panel, BorderLayout.CENTER);
	panel.setLayout(new GridLayout(0, 5, 0, 0));
	//JPanel_1 is established and its border,layout is set also it is added to the panel
	JPanel panel_1 = new JPanel();
	panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_1);
	panel_1.setLayout(new BorderLayout(0, 0));
//Btn1 is made in Panel_1 and its font is selected
	JButton btn1 = new JButton("");
	btn1.setFont(new Font("Tahoma", Font.BOLD, 80));
	
	frame.setVisible(true);
	
	
	btn1.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
			btn1.setText(startGame);
			
			if(startGame.equalsIgnoreCase("X")) {

				btn1.setForeground(Color.RED);
				b1=1;
				i++;
			}
			else {
				btn1.setForeground(Color.BLUE);
				b1=0;
					}
			//new choosePlayer(startGame);
			setGamestate();
			
			
			new winingGame(xCount, oCount,xCount1,oCount1,i, b1,b2,b3,b4, b5,b6,b7,b8,b9);
		}
	});

	panel_1.add(btn1, BorderLayout.CENTER);		
	//JPanel_1 is established and its border,layout is set also it is added to the panel

	JPanel panel_2 = new JPanel();
	panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_2);
	panel_2.setLayout(new BorderLayout(0, 0));
//btn2 is now implemented
	JButton btn2 = new JButton("");
	panel_2.add(btn2, BorderLayout.CENTER);
	//if btn2 is been clicked 
	btn2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent o) {
			//Referring to startgame string
			btn2.setText(startGame);
			//setting up the X color red and it 
			if(startGame.equalsIgnoreCase("X")) {

				btn2.setForeground(Color.RED);
				//b2 is equal to 1
				b2=1;
				//i is increamented
				i++;

			}
//setting up the color of O to blue 
			else {
				btn2.setForeground(Color.BLUE);
				//b is equal to 0 
				b2=0;
				//i is increamented
				i++;

			}
			//setGamestate function is called here
			setGamestate();
			//wining game function is called
			new winingGame(xCount, oCount,xCount1,oCount1,i, b1,b2,b3,b4, b5,b6,b7,b8,b9);

		}
	});
	//font of btn2 is setup
	btn2.setFont(new Font("Tahoma", Font.BOLD, 80));
//panel3 and its border is setup
	JPanel panel_3 = new JPanel();
	panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_3);
	panel_3.setLayout(new BorderLayout(0, 0));
//btn3 is setupin panel3 and its font and size is selected tahoma and 80 respectively
	JButton btn3 = new JButton("");
	btn3.setFont(new Font("Tahoma", Font.BOLD, 80));
	panel_3.add(btn3, BorderLayout.CENTER);
	//btn3 will perform following action 
	btn3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			btn3.setText(startGame);
			//seting up the stringame=X and its color red
			if(startGame.equalsIgnoreCase("X")) {

				btn3.setForeground(Color.RED);
				b3=1;
				i++;

			}//else O color is set blue
			else {
				btn3.setForeground(Color.BLUE);
				//b3=0
				b3=0;
				//i increamented
				i++;
				

			}
			//function gamestate and wininggame  is called
			setGamestate();
			new winingGame(xCount, oCount,xCount1,oCount1,i, b1,b2,b3,b4, b5,b6,b7,b8,b9);

		}
	});
//new JPanel panel_4 is implemented in Panel  
	JPanel panel_4 = new JPanel();
	panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	//panel_4 is added in panel
	panel.add(panel_4);
	//Border layout is set in panel_4
	panel_4.setLayout(new BorderLayout(0, 0));
//lblNewLabel = Player X , Font, Alignment is also sent
	JLabel lblNewLabel = new JLabel("Player X");
	lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	panel_4.add(lblNewLabel, BorderLayout.CENTER);
//new panel_5 is set its border,color and layout is setup 
	JPanel panel_5 = new JPanel();
	panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_5);
	panel_5.setLayout(new BorderLayout(0, 0));
	//Label xCount = 0 , font alignment is also setup 
	xCount = new JLabel("0");
	xCount.setFont(new Font("Tahoma", Font.BOLD, 24));
	xCount.setHorizontalAlignment(SwingConstants.CENTER);
	panel_5.add(xCount, BorderLayout.CENTER);
	//panel_6 is added in panel  its lineborder and borderLayout is also setup
	JPanel panel_6 = new JPanel();
	panel.add(panel_6);
	panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel_6.setLayout(new BorderLayout(0, 0));
//btn4 is also implemented in panel_6 ,new lineBorder and borderLayout is also setup
	JButton btn4 =new JButton("");
	panel_6.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_6);
	panel_6.setLayout(new BorderLayout(0, 0));
	btn4.setFont(new Font("Tahoma", Font.BOLD, 80));
//btn4 action perform is also seting up 
	btn4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			btn4.setText(startGame);
			//string startGame= "X" if it is pressed its font and color is also selected b4=1, i is increamented 
			if(startGame.equalsIgnoreCase("X")) {
                btn4.setForeground(Color.RED);
				b4=1;
				i++;
			}				//string startGame="O" is printed in else condition, b4=0 and i is increamented 

			else {
				btn4.setForeground(Color.BLUE);
				b4=0;
				i++;

			}  
			//functions gamestate() and winingGame is called
			setGamestate();
			new winingGame(xCount, oCount,xCount1,oCount1,i, b1,b2,b3,b4, b5,b6,b7,b8,b9);
		}
	});
	//adding button in panel_6
	panel_6.add(btn4, BorderLayout.CENTER);
	//panel_7 is implemented in in panel
	JPanel panel_7 = new JPanel();
	panel_7.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_7);
	panel_7.setLayout(new BorderLayout(0, 0));
//btn_5 is added in panel _7 
	JButton btn5 = new JButton("");

	panel_7.add(btn5, BorderLayout.CENTER);
	
	btn5.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//btn5 text value is storing in startgame
			btn5.setText(startGame);
			//if x is equal to x 
			if(startGame.equalsIgnoreCase("X")) {
//btn5 color is set red 
				btn5.setForeground(Color.RED);
				//btn5=1
				b5=1;
				//i is increamented
				i++;

			}
			//in else condition btn5 will blue color 
			else {
				btn5.setForeground(Color.BLUE);
				//b5 is 0
				b5=0;
				//i is increamented
				i++;

			}
			//gamestate and winninggame function is called
			setGamestate();
			new winingGame(xCount, oCount,xCount1,oCount1,i, b1,b2,b3,b4, b5,b6,b7,b8,b9);
		}
	});

	btn5.setFont(new Font("Tahoma", Font.BOLD, 80));

	JPanel panel_8 = new JPanel();
	panel_8.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_8);
	panel_8.setLayout(new BorderLayout(0, 0));

	JButton btn6 = new JButton("");
	btn6.setFont(new Font("Tahoma", Font.BOLD, 80));
	panel_8.add(btn6, BorderLayout.CENTER);
	btn6.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			btn6.setText(startGame);
			if(startGame.equalsIgnoreCase("X")) {

				btn6.setForeground(Color.RED);
				b6=1;
				i++;

			}
			else {
				btn6.setForeground(Color.BLUE);
				b6=0;
				i++;

			}
			setGamestate();
			new winingGame(xCount, oCount,xCount1,oCount1,i, b1,b2,b3,b4, b5,b6,b7,b8,b9);
		}
	});

//panel_9 is implemented in panel
	JPanel panel_9 = new JPanel();
	panel_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_9);
	panel_9.setLayout(new BorderLayout(0, 0));
//lblNewLabel2 = Player O and it is set be in center
	JLabel lblNewLabel2 = new JLabel("Player O");
	lblNewLabel2.setFont(new Font("Tahoma", Font.BOLD, 24));
	lblNewLabel2.setHorizontalAlignment(SwingConstants.CENTER);
	panel_9.add(lblNewLabel2, BorderLayout.CENTER);
//Jpanel_10 is set to be in panel
	JPanel panel_10 = new JPanel();
	panel_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_10);
	panel_10.setLayout(new BorderLayout(0, 0));
//lalbel oCount=0, font,font color and  alighnment is set 
	oCount = new JLabel("0");
	oCount.setFont(new Font("Tahoma", Font.BOLD, 24));
	oCount.setHorizontalAlignment(SwingConstants.CENTER);
	//oCount is added in panel_10
	panel_10.add(oCount, BorderLayout.CENTER);
//new panel_11 is added 
	JPanel panel_11 = new JPanel();
	//panel_11 border is setup
	panel_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	//panel_11 is added in panel
	panel.add(panel_11);
	panel_11.setLayout(new BorderLayout(0, 0));
//btn7 is added in panel_11 
	JButton btn7 = new JButton("");
	btn7.setFont(new Font("Tahoma", Font.BOLD, 80));
	panel_11.add(btn7, BorderLayout.CENTER);
	//btn7 will perform the function when you click it 
	btn7.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//btn7 = string startGame
			btn7.setText(startGame);
			//string startgame = X 
			if(startGame.equalsIgnoreCase("X")) {
              //color Red
				btn7.setForeground(Color.RED);
				//b7=1
				b7=1;
				//i is increamented 
				i++;

			}
			else {
				//color blue 
				btn7.setForeground(Color.BLUE);
			//b7=0
				b7=0;
				//i is increamented
				i++;

			}
			//function gamestate and winingGame  is called 
			setGamestate();
			new winingGame(xCount, oCount,xCount1,oCount1,i, b1,b2,b3,b4, b5,b6,b7,b8,b9);
		}
	});

//panel_12 is added in panel
	JPanel panel_12 = new JPanel();
	panel_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_12);
	panel_12.setLayout(new BorderLayout(0, 0));
//btn8 is aded in in panel_12, 
	JButton btn8 = new JButton("");
	btn8.setFont(new Font("Tahoma", Font.BOLD, 80));
	panel_12.add(btn8, BorderLayout.CENTER);
	//btn8 perform the action when it will be clicked 
	btn8.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
	//btn8= string startGame
			btn8.setText(startGame);
			//if startGame=X
			if(startGame.equalsIgnoreCase("X")) {

//btn8 color red 
				btn8.setForeground(Color.RED);
				//b8=1
				b8=1;
				//i is increamented 
				i++;
			}
			else {
//btn8 color is blue 
				btn8.setForeground(Color.BLUE);
				//b8=0
				b8=0;
				//i is increamented 
				i++;
			}
			//function  setGamestate and winningGame is called 
			setGamestate();
			new winingGame(xCount, oCount,xCount1,oCount1,i, b1,b2,b3,b4, b5,b6,b7,b8,b9);
		}
	});
//panel_13 is added in panel 
	JPanel panel_13 = new JPanel();
	panel_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_13);
	panel_13.setLayout(new BorderLayout(0, 0));
//btn9 is added in panel_9, font and font size is set 
	JButton btn9 = new JButton("");
	btn9.setFont(new Font("Tahoma", Font.BOLD, 80));
	panel_13.add(btn9, BorderLayout.CENTER);
	//btn9  will perform the function 
	btn9.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			//btn9 = string startGame
			btn9.setText(startGame);
			//string startGame = X
			if(startGame.equalsIgnoreCase("X")) {
//btn9 color is red 
				btn9.setForeground(Color.RED);
				//b9=1
				b9=1;    
				//i is increamented 
				i++;

			}
			else {
				//btn9 color is blue 
				btn9.setForeground(Color.BLUE);
				//b9=0
				b9=0;
				//i is increamented 
				i++;

			}
			//function setGamestate and winningGame is called 
			setGamestate();
			new winingGame(xCount, oCount,xCount1,oCount1,i, b1,b2,b3,b4, b5,b6,b7,b8,b9);
		}
	});

//panel_14 is added in panel  
	JPanel panel_14 = new JPanel();
	panel_14.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_14);
	panel_14.setLayout(new BorderLayout(0, 0));
//JButton btnReset ="Reset"
	JButton btnReset = new JButton("RESET");
	//button reset wil delete all the value from all the buttons 
	btnReset.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			//all btn9 value will be reseet after clicking btn RESET
			btn1.setText(null);
			btn2.setText(null);
			btn3.setText(null);
			btn4.setText(null);
			btn5.setText(null);
			btn6.setText(null);
			btn7.setText(null);
			btn8.setText(null);
			btn9.setText(null);
			b1=10;
			b2=10;
			b3=10;
			b4=10;
			b5=10;
			b6=10;
			b7=10;
			b8=10;
			b9=10;
			//i will become 0
			i=0;
			
		
		
	}});
	
btnReset.addActionListener(new ActionListener() {
//another action will perform by btn RESET
	@Override
	public void actionPerformed(ActionEvent e) {

		if(b1==1 && b2==1 && b3==1 ||b4==1 && b5==1 && b6==1 ||b7==1 && b8==1 && b9==1||
				
b1==1 && b4==1 && b7==1	|| b2==1 && b5==1 && b8==1||b9==1 && b3==1 && b6==1 ||b1==1 && b5==1 && b9==1
||b3==1 && b5==1 && b7==1) {
// if above conitions will satisfy then xCount1 will increamented
		
			xCount1++;
			//xCount1 will print on xCount
			xCount.setText(String.valueOf(xCount1));

		}
		
		
		else if(b1==0 && b2==0 && b3==0 ||b4==0 && b5==0 && b6==0 ||b7==0 && b8==0 && b9==0||
				
				b1==0 && b4==0 && b7==0	|| b2==0 && b5==0 && b8==0||b9==0 && b3==0 && b6==0 ||b1==0 && b5==0 && b9==0
				||b3==0 && b5==0 && b7==0) {


			// if above conitions will satisfy then xCount1 will increamented

							oCount1++;
							//xCount1 will print on xCount

							oCount.setText(String.valueOf(oCount1));

						}
	}
	
	
	
	
});
	

	
	btnReset.setFont(new Font("Tahoma", Font.BOLD, 24));
	panel_14.add(btnReset, BorderLayout.CENTER);


	JPanel panel_15 = new JPanel();
	panel_15.setBorder(new LineBorder(new Color(0, 0, 0), 2));
	panel.add(panel_15);
	panel_15.setLayout(new BorderLayout(0, 0));
//btnExit will exit the application
	JButton btnExit = new JButton("EXIT");
	btnExit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
//new frame 
			frame = new JFrame("Exit");
//if btnexit will press then it will open a new dialog box 'Confirm You Want To Exit'			
			if(JOptionPane.showConfirmDialog(frame, "Confirm You Want To Exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {


				System.exit(0);

			}

		}
	});
	btnExit.setFont(new Font("Tahoma", Font.BOLD, 24));
	panel_15.add(btnExit, BorderLayout.CENTER);
	
	
}}

