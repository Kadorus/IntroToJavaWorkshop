package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		
		String[] words = new String[6];
		
		words[0] = "Eviscerate"; 
				
		words[1] = "E v i s c e r a t e";
		
		words[2] = "Dog";
		
		words[3] = "D o g";
		
		words[4] = "Happy";
		
		words[5] = "H a p p y";
		
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		
		for(int i = 0; i < 6; i+=2){
		speak(words[i]);
		// 2. Catch the user's answer in a String
		String xInput = JOptionPane.showInputDialog("Spell that word.");
		// 3. If the user spelled the word correctly, speak "correct"
		if(xInput.equalsIgnoreCase(words[i])||xInput.equalsIgnoreCase(words[i+1])){
			
			speak("Correct");
			
		}
		else{
			
			speak("Wrong");
			
		}
		// 4. Otherwise say "wrong"
		
		// 5. repeat the process for other words
		
	}
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


