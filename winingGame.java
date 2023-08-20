
import javax.swing.JFrame;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class winingGame {
	
	//frame for dialog box (Wining or no one wins)
	private JFrame frame;
	int z=0;
	//getting parameters from GameGui class
	public   winingGame (JLabel xCount,JLabel oCount,int xCount1,int oCount1,int i,int b1,int b2,int b3,int b4,int b5,int b6, int b7, int b8, int b9) {
		
	//if else state used to implement different condition for win and and tied game	
		
if(b1==1 && b2==1 && b3==1) {
//xPlayer wins if  b1,b2,b3 are equal to 1 and show the dialog box  
			JOptionPane.showMessageDialog(frame, "Player x Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);											
		}
		else	if(b4==1 && b5==1 && b6==1) {
			//xPlayer wins if  b4,b5,b6 are equal to 1 and shows the dialog box  
			
			JOptionPane.showMessageDialog(frame, "Player x Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		
		}
		else if(b7==1 && b8==1 && b9==1) {
			//xPlayer wins if  b7,b8,b9 are equal to 1 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player x Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);		
		}
		else if(b1==1 && b4==1 && b7==1) {
			//xPlayer wins if b1,b4,b7 are equal to 1 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player x Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);	
		}
		else if(b2==1 && b5==1 && b8==1) {
			//xPlayer wins if  b2,b5,b8 are equal to 1 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player x Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	}

		else if(b9==1 && b3==1 && b6==1) {
			//xPlayer wins if  b3,b6,b9 are equal to 1 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player x Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
				}
		else if(b1==1 && b5==1 && b9==1) {
			//xPlayer wins if  b1,b5,b9 are equal to 1 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player x Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
			}
		else if(b3==1 && b5==1 && b7==1) {
			//xPlayer wins if  b3,b5,b7 are equal to 1 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player x Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);		
		}
    	else if(i==9) {
			//if i values becomes 9 than no one wins   

			JOptionPane.showMessageDialog(frame, "No One Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
	}	else if(b1==0 && b2==0 && b3==0) {
			//oPlayer wins if  b1,b2,b3 are equal to 0 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		}
		else	if(b4==0 && b5==0 && b6==0) {
			//oPlayer wins if b4,b5,b6 are equal to 0 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);			
		}
		else if(b7==0 && b8==0 && b9==0) {
			//oPlayer wins if  b7,b8,b9 are equal to 0 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
				}
        else if(b1==0 && b4==0 && b7==0) {
			//oPlayer wins if  b1,b4,b7 are equal to 0 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		}
        else if(b2==0 && b5==0 && b8==0) {
			//oPlayer wins if  b2,b5,b8 are equal to 0 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		}
     	else if(b9==0 && b3==0 && b6==0) {
			//oPlayer wins if  b9,b3,b6 are equal to 0 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);	
		}
else if(b1==0 && b5==0 && b9==0) {
			//oPlayer wins if  b1,b5,b9 are equal to 0 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
				}
		else if(b3==0 && b5==0 && b7==0) {
			//oPlayer wins if  b3,b5,b7 are equal to 0 and show the dialog box  

			JOptionPane.showMessageDialog(frame, "Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}