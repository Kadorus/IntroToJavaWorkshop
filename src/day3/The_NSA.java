package day3;

import javax.swing.JOptionPane;

public class The_NSA {
	
	public static void main(String[] args){
					
		String[] doggo = new String[5];
		
		for(int i = 0; i < 5; i++){
		
		String xInput = JOptionPane.showInputDialog("What is your favorite animal?");
		
		
		
		if(xInput.equals("dog")){
			
			
			
			JOptionPane.showMessageDialog(null, "Welcome to the NSA. Your failed attempts were: ");
			
			for(int z = 0; z < 5; z++){
				
				JOptionPane.showMessageDialog(null, doggo[z]);
				
			}
			
		}
		
		else{
			
			doggo[i] = xInput;
			
		}
		
		}	
		
	}
	
}
